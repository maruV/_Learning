# Vishal Maru
# Programming Assignment 3

import random

class Bug:

    def __init__(self, initPos=0, initDir="R"):
        self.initPos = initPos
        self.initDir = initDir

    def move(self):        
        self.initPos += 1

    def moveRandom(self):        
        self.initPos += random.randint(1, 10)        
        
    def setPos(self, intPosition):
        self.initPos = intPosition        
        
    def getPos(self):
        return self.initPos
        
    def setDir(self, dirStr):        
        self.initDir = dirStr
        
    def getDir(self):
        return self.initDir
        
    def __str__(self):
        return ("Bug at %d facing %s" %(self.getPos(), self.getDir()))   
        
    def __eq__(self, other):
        if self.initPos == other.initPos:
            return True
        else:
            return False
        
    def __ne__(self, other):
        if self.initPos != other.initPos:
            return True
        else:
            return False
        
    def __lt__(self, other):
        if self.initPos < other.initPos:
            return True
        else:
            return False            
            
    def __le__(self, other):
        if self.initPos <= self.initPos:
            return True
        else:
            return False
            
    def __gt__(self, other):
        if self.initPos > other.initPos:
            return True
        else:
            return False
            
    def __ge__(self, other):
        if self.initPos >= other.initPos:
            return True
        else:
            return False
        
if __name__ == "__main__":
    a = Bug()
    b = Bug(5)
    c = Bug(-2, "Left")
    d = Bug(0,'-')

    print("a:", a)
    print("b:", b)
    print("c:", c)
    print("d:", d)

    print("Testing comparisons: Bug a compared to b, c, and d")
    bcd = [b,c,d]
    print("== test")
    for bug in bcd:
        print(a == bug, end = " ")
    print()

    print("!= test")
    for bug in bcd:
        print(a != bug, end = " ")
    print()

    print("< test")
    for bug in bcd:
        print(a < bug, end = " ")
    print()

    print("<= test")
    for bug in bcd:
        print(a <= bug, end = " ")
    print()

    print("> test")
    for bug in bcd:
        print(a > bug, end = " ")
    print()

    print(">= test")
    for bug in bcd:
        print(a >= bug, end = " ")
    print()

    a.move()
    d.move()
    b.moveRandom()
    c.moveRandom()
    print("a:", a)
    print("b:", b)
    print("c:", c)
    print("d:", d)

    try:
        e = Bug(10,"Wrong")
    except ValueError as err:
        print("Caught bad data in constructor:",err)

    a.setPos(100)
    a.setDir("leftward")
    print(a)
    print(a.getDir())
    print(a.getPos())

