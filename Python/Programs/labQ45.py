# FUCKBOY

words = ["zero", "one", "two", "three", "four", "five"]

for index, word in enumerate(words):
    if len(word) < index:
        print("%%word: %s; index: %d" %(word, index))
    else:
        print("word: %s; index: %d" %(word, index))
            