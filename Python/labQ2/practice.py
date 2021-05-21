def main():
#    inptfile = input("Which file?")
    
#    openfile = open(inptfile, 'r')
    openfile = open("fileA.txt", "r")
    inptdata = openfile.readlines()
    openfile.close()    
    
    data1 = []    
    data2 = []
    for num in inptdata:
        data1.append(num.strip())

    for list1 in data1:
        list1 = list1.split()
        data = []
        for numlist in list1:
            numlist = int(numlist)
            data2.append(numlist)
    print(data2)
    
main()