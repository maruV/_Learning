# Vishal Maru
# Lab Quiz 4 back

def toInches(measurement, unit):
    
    ConversionDict = {"cm":0.3937, "in":1.0, "ft":12, "yd":36}    
    
    for unitFactor, ConvFactor in ConversionDict.items():
        if unit == unitFactor:
            measurement *= ConvFactor
            return measurement
            
print(toInches(3.4, "ft"))