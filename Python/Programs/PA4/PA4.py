
# Vishal Maru
# Programming Assignment 4

class Person:
    
    def __init__(self, firstName, lastName, SSN):
        self._firstName = firstName
        self._lastName = lastName
        self._SSN = SSN
        self._address = "<no address>"
        self._phones = []       
        
    def setFirstName(self, F_name):
        self._firstName = F_name
        
    def getFirstName(self):
        return self._firstName
        
    def setLastName(self, L_name):
        self._lastName = L_name

    def getLastName(self):        
        return self._lastName
        
    def getSSN(self):
        return self._SSN        
        
    def setAddress(self, residence):        
        self._address = residence
    
    def getAddress(self):        
        return self._address
        
    def addPhone(self, PhoneNumber):
        self._phones.append(PhoneNumber)
        
    def delPhone(self, PhoneNumber):
        if PhoneNumber in self._phones:
            self._phones.remove(PhoneNumber)
        
    def getPhones(self):
        return self._phones
        
    def __str__(self):
        return "%s, %s SSN=%s"%(self._lastName, self._firstName, str(self._SSN))

    def printAll(self):
        print("%s, %s SSN=%s"%(self._lastName, self._firstName, str(self._SSN)))
        print(self._address)
        print("Phone(s):")
        if len(self._phones) == 0:
            print("<none>")
        else:
            for phone in self._phones:
                print(str(phone))
        
class Student(Person):

    def __init__(self, firstName, lastName, SSN, techID):
        Person.__init__(self, firstName, lastName, SSN)
        self._techID = techID
        self._grades = {}

    def addCourse(self, CourseID, CourseGrade):
        self._grades[CourseID] = CourseGrade

    def dropCourse(self, CourseID ):
        if CourseID in self._grades.keys():
            CourseGrade = self._grades[CourseID]
            if CourseGrade[0] == "I":
                del self._grades[CourseID]
        
    def __str__(self):
        return "%s, %s techID=%s"%(self._lastName, self._firstName, str(self._techID))
        
    def printAll(self):
        print("%s, %s techID=%s"%(self._lastName, self._firstName, str(self._techID)))
        print(self._address)
        print("Phone(s):")
        if len(self._phones) == 0:
            print("<none>")
        else:
            for phone in self._phones:
                print(phone)
        print("Courses:")
        if self._grades == {}:
            print("<none>")
        else:
            for CourseID, CourseGrade in self._grades.items():
                if len(CourseID) == 9:
                    print("%s %s"%(CourseID, CourseGrade.upper()))
                elif len(CourseID) == 8:
                    print("%s  %s"%(CourseID, CourseGrade.upper()))
                elif len(CourseID) == 7:
                    print("%s   %s"%(CourseID, CourseGrade.upper()))
                else:
                    print("%s    %s"%(CourseID, CourseGrade.upper()))
        
if __name__ == "__main__":
    per1 = Person("Joe", "Smith", "111-22-3333")
    per2 = Person("Lisa", "Hernandez", "222-33-4444")
    per2.setAddress("123 South St #456, Chicago, IL, 61111")
    per2.addPhone("312-234-5678")
    per2.addPhone("800-888-9990")

    print(per1)
    print(per2)
    print()
    per1.printAll()
    print()
    per2.printAll()
    print()
    print("Result of getPhones():", per2.getPhones())
    print()

    stu1 = Student("Mary", "Jones", "234-56-1234", "00112233")
    stu1.setAddress("333 N Main St, Dallas, TX 75150")
    stu2 = Student("Bill", "Chen", "876-76-7676", "12345433")
    stu2.addPhone("214-999-0011")
    stu2.addCourse("IT 210", "IP")
    stu2.addCourse("ENG 271W", "B")
    stu2.addCourse("GEOG 210W", "IP")

    print(stu1)
    print(stu2)
    print()
    stu1.printAll()
    print()
    stu2.printAll()

    stu2.addCourse("IT 210", "a") # Change grade
    stu2.dropCourse("ENG 271W") # Drop existing course
    stu2.dropCourse("ENG 101") # Dropping a non-existent course does nothing
    stu2.addPhone("214-999-5511")
    stu2.delPhone("214-999-0011") # Delete existing phone
    stu2.delPhone("999-999-9999") # Delete non-existent phone does nothing

    print()
    stu2.printAll()

