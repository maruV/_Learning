# Vishal Maru

# Place your code below this line
#Enter the int
int1 = int(input('Enter int1:'))
int2 = int(input('Enter int2:'))
int3 = int(input('Enter int3:'))

#Enter the string
s1 = input('Enter s1:')
s2 = input('Enter s2:')

#Enter the float
f1 = float(input('Enter f1:'))
f2 = float(input('Enter f2:'))

#Create List1
list1 = [int1, int2, int3]

#Create List2
list2 = [s1, s2]

#Create List3
list3 = list1 + list2

#Append a string with your name int it
list3.append('Vishal Maru')

#create an empty dictionary
dict1 = {}

#add an antry with int1 as key and s1 as value to dict1
dict1[int1] = s1

#add an entry with s1 as key and list1 as value to dict1
dict1[s1] = list1

#create a tuple with f1 and f2 in it
tup1 = (f1, f2)
# Place your code above this line

##### CHANGE ABSOLUTELY NOTHING BELOW THIS LINE #####

# When your Python code is working correctly, output will match the results on your
# assignment sheet for the inputs specified.

print("list1 is:", list1)
print("list2 is:", list2)
print("list3 is:", list3)
print("dict1 is:", dict1)
print("tup1 is:", tup1)
