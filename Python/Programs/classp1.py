# -*- coding: utf-8 -*-
"""
Created on Sun Nov  6 20:17:28 2016

@author: maruv
"""

# Type code for classes here
class ItemToPurchase:
    
    def __init__(self, item_name = "none", item_price=0, item_quantity=0):
        self.item_name = item_name
        self.item_price = item_price
        self.item_quantity = item_quantity
    
    def getname(self):
        return self.item_name 

    def getprice(self):
        return self.item_price
    
    def getquantity(self):
        return self.item_quantity
#    
    def getcost(self):
        return self.item_price * self.item_quantity
        
    def __str__(self):
        return ("%s %d @ $%d = %d" %(item1.getname(), item1.getquantity(), item1.getprice(), item1.getcost()))
        
if __name__ == "__main__":
    # Type main s
    item1 = ItemToPurchase("Bottled Water", 10, 10)
 
    print(item1)