# Vishal Maru
# Lab 05

textFile = open("Lab5input.txt")
text = textFile.read()
just_a_list = text.split()

# lc_reversereturns a string converted to lower case and	with the
# order of the characters of the string reversed.
def lc_reverse(some_string):
    str1 = ''
    for letter in reversed (some_string):
        str1 += letter
        if len(str1) == len(some_string):
            return(str1.lower())

# is_palindrome calls the lc_reverse function, changes some_string
# and compares the result with lower case version of original string
# if they are same then return true, if not then return false.

def is_palindrome(just_a_list):    
    if just_a_list == lc_reverse(just_a_list):
        return("True")
    else:
        return('False')

print("Reversed lower-case words")

# used a for loop to process wach word in the list and print the output
# produced by calling lc_reverse on it.
for word in just_a_list:
    print(lc_reverse(word))

# used a for loop to process each word in the list and print the word
# followed by the result of calling is_palindrome on it.
print("\nTesting for palindromes")

for word1 in just_a_list:
    print(word1, is_palindrome(word1))