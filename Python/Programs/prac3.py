# FIXME (1): Finish reading another word and an integer into variables. 
# Output all the values on a single line
favoriteColor = input('Enter favorite color: \n')
favoriteStar = input("Enter pet's name: \n")
favoriteNumber = int(input('Enter a number: \n'))

print("\n%s %s %d\n"%(favoriteColor, favoriteStar, favoriteNumber))

# FIXME (2): Output two password options
password1 = "%s_%s"%(favoriteColor, favoriteStar)
print('First password:', password1)

password2 = "%d%s%d"%(favoriteNumber, favoriteColor, favoriteNumber)
print('Second password:', password2)

# FIXME (3): Output the length of the two password options
p1 = len(password1)
p2 = len(password2)

print("\nNumber of characters in %s:"%password1, p1)
print("Number of characters in %s:"%password2, p2)