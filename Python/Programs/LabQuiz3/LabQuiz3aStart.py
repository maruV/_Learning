# Vishal Maru
# Lab Quiz 3

# A class for building colored circles at various (x,y) coordinates
class Dot():
    def __init__(self, x=0, y=0, radius=1, color="black"):
        self._x = x
        self._y = y
        self._radius = radius
        self._color = color

    def setX(self, x):
        return self._x# FIXME

    def setY(self, y):
        return self._y # FIXME

    def setRadius(self, rad):
        return (self._x * self._x) + (self._y * self._y) # FIXME
        
    def setColor(self, color):
        return self._color # FIXME

    def getX(self):
        return self._x # FIXME

    def getY(self):
        return self._y # FIXME

    def getRadius(self):
        return self._radius # FIXME

    def getColor(self):
        return self._color # FIXME

    def getArea(self):
        return self._x*self._x*self._y*self._y*3.141592653589793 # FIXME

    def getCircumference(self):
        return self._x*self._y*3.141592653589793*2 # FIXME

    def __str__(self):
        return ("dark " + dot.getColor() + " dot at " + "( , )" + " with radius " + str(dot.getRadius())) # FIXME

if __name__ =="__main__":
    dots = []
    dots.append(Dot())
    dots.append(Dot(2,3,4,"red"))
    dots.append(Dot(-3,6,5,"blue"))
    dots.append(Dot(4,5,6,"sky blue"))

    for dot in dots:
        print(dot)

    for dot in dots:
        newX = dot.getX() + 1
        dot.setX(newX)
        newY = dot.getY() - 3
        dot.setY(newY)
        newR = dot.getRadius() + 2
        dot.setRadius(newR)
        newColor = "dark " + dot.getColor()
        dot.setColor(newColor)

    print("\nAfter changes:")
    for dot in dots:
        print(dot)

    print("\nArea and Circumference:")
    for dot in dots:
        print(dot.getArea(), dot.getCircumference())

