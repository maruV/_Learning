# PA4 Test Code

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
    stu2.addCourse("ENG 271W", "IP")
    stu2.addCourse("MATH 121", "IP")

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

