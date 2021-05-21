def printOdds(pa_line):
    if (len(pa_line) % 2) == 0:
       print('Odds:',(pa_line[1:-1:2]+pa_line[-1]))
    else:
        print('Odds:',pa_line[1:-1:2])

def printIfEnds(pa_line, end_s):
    for char in end_s:
        if char in pa_line[-1]:
            print('Ends with any of:',end_s,pa_line)
    
def printIfStarts(pa_line, begin_s):
    for char in begin_s:
        if char in pa_line[0]:
            print('Starts with any of:',begin_s,pa_line)

def printIfComment(pa_line):
    if '#' in pa_line[0]:
        print('Comment:',pa_line)

def printIfNumeric(pa_line,numlist=0):
    numlist=['0','1','2','3','4','5','6','7','8','9']
    for num in numlist:
        if num in pa_line[0]:
            print('Numeric:',pa_line)
    
def main():
    pa_input = input('Enter the file name:')
    begin_s = input('Enter the "starts string":')
    end_s = input('Enter the "ends string":')
    
    open_pa = open(pa_input)
    pa_line = open_pa.readline()
    open_pa.close
    while pa_line:
        pa_line = pa_line[:-1]
        printIfNumeric(pa_line)
        printIfComment(pa_line)
        printIfStarts(pa_line, begin_s)
        printIfEnds(pa_line, end_s)
        printOdds(pa_line)
        pa_line = open_pa.readline()
        
main()

