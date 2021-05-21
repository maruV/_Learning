# -*- coding: utf-8 -*-
"""
Created on Sun Oct  2 22:08:47 2016

@author: maruv
"""

list1 = ["abcd!", 'efg']
s = '.,!'
for chars in list1:
    i = len(chars)
    if chars[-1] in s:
        print(chars)