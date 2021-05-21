# -*- coding: utf-8 -*-
"""
Created on Wed Sep 21 21:07:18 2016

@author: maruv
"""

my_str = "ABCD"
my_list = [my_str]
my_str1 = ""

for c in reversed(my_list):
    if c != " ":
        my_list.append(c)
        print(my_list)