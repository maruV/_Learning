# Code from 3:00 class on Tuesday November 1
# Testing with control-C as input does not work inside iPython by works
# at the command line or in a regular python shell

print("Enter integers until an empty string.")
ints = []
anInt = input("int: ")

while anInt != "":
    try:
        ints.append(int(anInt))
        anInt = input("int: ")

    except ValueError:
        print("Try it again!!")
        anInt = input("int: ")

    except:  # Should get here if you type control-C
        print("Unknown error.")
        anInt = input("int: ")

print(ints)
