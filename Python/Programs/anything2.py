inputText = open('Lab5input.txt')
Text = inputText.read()
#my_list1 = Text.split()
#my_L = Text.lower()
Text.reverse()

new_L = []

for word in reversed(my_L):
    if word != '\n':
        word+= word        
        new_L.append(word)




print(Text)