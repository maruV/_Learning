# Lab04

# The following will read words from a file named "words.txt" which must
# exist in the same folder as this program. Do NOT modify this code.
wordsFile = open("words.txt", 'r')
words = wordsFile.read()
wordsFile.close()
wordList = words.split()

print("Words:",len(wordList)) # prints number of words in the file.

# Your code should replace the FIXME lines below but not change anything else.
a_words = 0
#  Used enumerate function to find how many words start with 'a'
for (indx, str1) in enumerate(wordList):
    if 'a' in str1[0]:
        a_words += 1
print(a_words, "start with the letter 'a'.")

long_words = 0
# used enumerate function to find the words that are longer than 10 letters
for (indx, str1) in enumerate(wordList):
    if len(str1) >= 11:    
        long_words += 1
print(long_words, "words are longer than 10 letters.")

indices = []
#used enumerate function to find the indices of words containing 'x'
for (indx, str1) in enumerate(wordList):
    if 'x' in str1:
        indices.append(indx)
print("These locations contain words containing the letter 'x':\n",indices)

lengths = []
# print a list with locations of all the words that contain 'x'
for (indx, str1) in enumerate(wordList):
    lengths.append(len(str1))
for i in range(10):
    if i >= len(lengths):
        break
    print(lengths[i], end = ' ') #print the lengths of strings
print("\nThe sum of all the lengths is:", sum(lengths)) #print the sum of al lengths

print("\nSelected words are:")
#Print the words form the List untill the length of a word reaches 4.
i = 0

while len(wordList[i]) != 4:
    print(wordList[i])    # prints words from list untill the length of a word reaches 4
    i += 1