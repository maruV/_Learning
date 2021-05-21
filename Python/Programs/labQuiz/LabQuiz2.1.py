# Vishal Maru
# Lab Quiz

def main():
    inptfile = input("Which file?")   
    
    openfile = open(inptfile, 'r')

    inptdata = openfile.read()
    openfile.close()    

    myIntList = [int(item) for item in inptdata.split()]
    
    print("The smallest value is:", min(myIntList))
    
    print("The average of the integers is:", sum(myIntList)/len(myIntList))

    print("The even integers are:")
    
    for num in myIntList:
        if num % 2 == 0:
            print(num, end=" ")
    
    print("\nThe included integers are:")
    
    inclList = [5, 6, 7, 8, 9]
    
    i = 0    
    while i <= len(inclList):
        for num1 in myIntList:
            if num1 == inclList[i]:
                print(num1, end = " ")
                inclList.pop(i)
                i += 1
            
    print("\nFinished.")

    
main()