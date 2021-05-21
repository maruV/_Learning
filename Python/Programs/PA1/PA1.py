# Vishal Maru
# Programming Assignment 1

# Prints the line if it starts with a digit        
def printIfNumeric(line):
    if line[0] in ['0', '1', '2', '3', '4', '5', '6', '7', '8', '9']:            
        print("Numeric:", line)

# Prints the line if it starts with '#'         
def printIfComment(line):
    if line[0] == '#':
        print("Comment:", line)

# Prints the characters of line in odd index locations         
def printOdds(line):
    print("Odds:", line[1:len(line):2])    

# Prints the line if it starts with any of the strings entered by the user    
def printIfStarts(line, sString):    
    if line[0] in sString:
        print("Starts with any of:", sString, line)

# Prints the line if it ends with any of the characters entered by the user        
def printIfEnds(line, eString):
    if line[-1] in eString:
        print("Ends with any of:", eString, line)        

# Prompts the user for entering the file name, start strings, end strings
# and calls other functions using that
def main():
    U_inputfile = input("Enter the file name:")
    sString = input('Enter the "starts string":')
    eString = input('Enter the "ends string":')
    
    my_file = open(U_inputfile)
    my_L = my_file.readlines()
    my_file.close
    
    for line in my_L:
        line = line[:-1]
        printIfNumeric(line)
        printIfComment(line)
        printIfStarts(line, sString)
        printIfEnds(line, eString)
        printOdds(line)

main()        