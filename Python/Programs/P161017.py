# In Class Practice

def main():
    list1 = [4, 8, 2, 6, 9, 34]
    list2 = [-3, -1, 4, 7, 12, 23]
    list3 = [4, 9, 9]
    list4 = [103, 98, 54, 32, 12, 6, 2]

    all = [list1, list2, list3, list4]

    lengths = [len(lis) for lis in all]
    print(lengths)

    # Propositions to test:
    print("\nThe list is in sorted order.")
    for lis in all:
        print(lis == sorted(lis))

    print("\nThe list is in reverse sorted order.")
    for lis in all:
        print(lis == sorted(lis, reverse=True))

    print("\nThe last value in the longest list is:", end=" ")
    long_index = 0
    long_len = len(all[0])
    for i in range(1, len(all)):
        if len(all[i]) > long_len:
            long_len = len(all[i])
            long_index = i
    print(all[long_index][-1])

    print("\nThis list has at least one duplicate value.")
    for lis in all:
        print(len(set(lis)) != len(lis))


    print("\nThis list contains the number 4.")
    for lis in all:
        print(4 in lis)


    print("\nThis list contains a number greater than 30.")
    for lis in all:
        print(max(lis) > 30)

    print("\nAll the unique values in all lists:")
    allSet = set()
    for lis in all:
        allSet = allSet.union(set(lis))
    print(sorted(allSet))




main()
