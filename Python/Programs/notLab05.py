inputText = open('Lab5input.txt')
Text = inputText.read()
my_list = Text.split()
#def lc_reverse 
#my_str = Text.lower()
#print(my_str)

Alp = ["ABCDEFGHIJKLMNOPQRSTUVWXYZ"]

my_L = []

for c in reversed(my_str):
    if c in Alp:
       # my_L[i] += c
        my_L.append(c)

print(my_L)

