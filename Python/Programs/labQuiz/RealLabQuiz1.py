# Vishal Maru
# Lab Quiz

def getList(filename):
    open_file = open(filename, 'r')
    
    strList = open_file.readlines()
    global S_list    
    S_list = []
    
    for str in strList:
        S_list.append(str.rstrip())

def LongestStr(S_list):
    Lstring = len(max(S_list, key=len))
    print("Index of the longest line:")
    L_index = 0
    
    for (index, string) in enumerate(S_list):
        if len(string) == Lstring:
            L_index = index
    print(L_index)
            
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
    print(LongestStr(S_list))
    ifOne(S_list)
    ifSpaces(S_list)
    print("Done")
    
main()