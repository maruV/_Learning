# Vishal Maru
# Lab Quiz 4 front

class FastFood:
    
    def __init__(self, name, price, calories, protein):
        
        self.name = name
        self.price = price
        self.calories = calories
        self.protein = protein
    
    def __str__(self):
        
        return "%s: $%.2f; Calories=%.0f, Protein= %.0f grams"%(self.name, self.price, self.calories, self.protein)
        
if __name__ == "__main__":
    burger1 = FastFood("Big Mac", 3.99, 550, 25)
    print(burger1)