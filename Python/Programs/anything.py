inputText = open('Lab5input.txt')
Text = inputText.read()
my_list1 = Text.split()
#m_L1 = Text.lower()

A = ['QWERTYUIOPLKJHGFDSAZXCVBNM']
new_list = []
new_str = ""
for c in reversed(my_list1):
    if c in A:
        new_list.append(c)
    else:
        (new_str) += c
        #print(c)                
    for b in reversed(my_str):
        if b != '\n':
            b += b            
        else:   
            new_list.append(b)
                
print(new_list)