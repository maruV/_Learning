def main():

    pa_input = input("Which file?")
    
    global myData
    
    if pa_input[0] is "q" or pa_input is "Q":
        print("Done")
    else:
        myfile = open(pa_input)
        myData = myfile.read()   
        print_square()
        ifSumRow()
        ifSumColmn()
        ifSumDiag()
        NumsOnce()
        
        if bad_diagonal_sum == 0 and bad_sum_row == 0 and bad_sum_col == 0 and num_count == 0:
            print("It is a magic square.")

def print_square():
    
    myIntList = [int(item) for item in myData.split()]    

    global data    
    
    myList = []      
    data = []    
    i=0    
    while i < len(myIntList):
        myList.append(myIntList[i])
        i+=1
        if len(myList)==4:
            data.append(myList)
            myList = []
   
    for row in data:
        for num in row:
            if num <= 9:
                print("", num, end=' ')
            else:
                print(num, end=' ')
        print("\n", end='')    
    print("")
                
def ifSumDiag():
    
    global bad_diagonal_sum

    sum1 = 0
    sum2 = 0

    i = 0
    c = 0
    a = 3    
    
    for i in range(4):
        sum1 += data[i][i]
        i += 1
    
    for c in range(4):
        sum2 += data[c][a]
        c += 1
        a -= 1
                
    if sum1 != 34:
        print("Bad Diagonal Sum =", sum1)
        bad_diagonal_sum += 1

    if sum2 != 34:
        print("Bad Diagonal Sum =", sum2)
        bad_diagonal_sum += 1
    else:
        bad_diagonal_sum = 0
        
def ifSumRow():
    
    global bad_sum_row

    bad_sum_row = 0
    
    for row in data:
        if sum(row) != 34:
            print("Bad row sum =", sum(row))
            bad_sum_row += 1

def ifSumColmn():
    
    global bad_sum_col

    bad_sum_col = 0
    
    sum_col = 0
    i = 0
    c = 0

    int_list = []
    
    for c in range(4):
        for i in range(4):
            sum_col += data[i][c]
            i +=1    
        c += 1
        int_list.append(sum_col)    
        sum_col = 0
    
    for num in int_list:
        if num != 34:
            bad_sum_col += 1
            print("Bad column sum =", num)            

def NumsOnce():
    
    global num_count    
    
    new_list = []
    num_count = 0
    
    for num_list in data:
        for num in num_list:
            new_list.append(num)
            
    for num1 in new_list:
        if new_list.count(num1) > 1:
            num_count += 1
    
    if num_count > 1:
        print("Not every integer used exactly once.")  
    
main()        
    

