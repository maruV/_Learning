# Vishal Maru
# Lab Quiz

def getList(filename):
    open_file = open(filename, 'r')
    
    strList = open_file.readlines()
    global S_list    
    S_list = []
    
    for str in strList:
        if str[-1] == '\n' or str[-1] == " ":      
            str = str[:-1]
        S_list.append(str)

def LongestStr(S_list):
    Lstring = max(S_list)
    print("Index of the longest line:")
    L_index = 0
    
    for (index, string) in enumerate(S_list):
        if len(string) == max(len(S_list)):
            L_index = index
            print(index)
            
def ifOne(S_list):
    print("Lines with '1' digits:")
    
    for str in S_list:
        if '1' in str:
            print(str)
        
def ifSpaces(S_list):
    print("Indices of strings with 4 or more consecutive spaces:")
    
    for (i, str) in enumerate(S_list):
        if "    " in str:
            print(i)
        
def main():
    filename = input("Which file?")
    
    getList(filename)
    LongestStr(S_list)
    ifOne(S_list)
    ifSpaces(S_list)
    print("Done")
    
main()