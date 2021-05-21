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
        
    mySet = {}

    for num1 in myIntList:
        if num1 in [5, 6, 7, 8, 9]:
            mySet = {num1}
        
    print(mySet)
        
    print("\nFinished.")

    
main()