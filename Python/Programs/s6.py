inputText = open('Lab5input.txt')
Text = inputText.read()
my_list1 = Text.split()
m_L = Text.lower()

my_L1 = []

my_str = ''

i = 0

#def lc_reverse

for word in reversed(m_L):
    if word != '\n':
        my_str += word
#    elif word == '\n':
        my_L1[i].append(my_str)
#    elif i < len(my_str):
        i += 1    
print(my_L1)