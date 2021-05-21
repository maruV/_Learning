# Vishal Maru

# First programming assignment - convert pounds to other units of weight

# Get input in pounds
# Note that the input function always give a string
lbsStr = input("Enter the number of pounds: ") 
lbs = float(lbsStr) # Convert the string to a float

# Compute other units of weight
ozs = lbs * 16
tons = lbs / 2000
drams = lbs * 256
grams = lbs * 453.592

# Output the results of the calculation
print() # Prints a blank line 
print(lbs, "pounds is the same as:")
print(ozs, "ounces")
print(tons, "tons")
print(drams, "drams")
print(grams, "grams")
