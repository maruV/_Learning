import os

my_file = open("Lab5input.txt", "r")

file_stats = os.stat("Lab5input.txt")

print(file_stats)