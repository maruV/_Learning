textFile = open("Lab5input.txt")
text = textFile.read()
textFile.close
textList = text.split()

newtext_list = []

for w in reversed(textList):    
    newtext_list.append(w)
print(newtext_list)


print(text)
