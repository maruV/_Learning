#Vishal Maru
#Lab 03

#1 Input 3 integers and assign them to variables named:int1, int2, int3.
int1 = int(input("Enter int1:"))
int2 = int(input("Enter int2:"))
int3 = int(input("Enter int3:"))

my_list = [int1, int2, int3] 
my_list2 = [4, 5, 9, 12, 22, 0]

#2 Print  the sum of the three integers.
print("The sum of the integers is", sum(my_list))

#3 Print the largest of the three integers.
print("The max of the integers is", max(my_list))

#4 Test and print whether int2 is even or odd.
if (int2 % 2) == 0:
    print(int2, "is even")
else:
    print(int2, "is odd")
    
#5 Test and print whether int1 and int3 are equal
if int1 == int3:
    print("%d and %d are equal"%(int1, int3)) 
else:
    print("%d and %d are not equal"%(int1, int3))

#6 Test and print whether all three integers are equal.
if int1 == int3 == int2:
    print("All 3 integers are equal")
else:
    print("All 3 integers are not equal")

#7 Test and print whether int3 is a one of 4, 5, 9, 12, 22 or 0.
if int3 in my_list2:
    print("%d is a member"%int3)
else:
    print("%d is not a member"%int3)

#8 Test and print whether int1 is a multiple of 10.
if (int1 % 10) == 0:
    print("%d is a multiple of 10"%int1)
else:
    print("%d is not a multiple of 10"%int1)

#9 Test and print whether int2 is a single non-negative digit.
if 0 <= int2 <= 9:
    print("%d is a single non-negative digit"%int2)
else:
    print("%d is not a single non-negative digit"%int2)    
    