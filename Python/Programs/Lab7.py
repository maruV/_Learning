# Vishal Maru
# Payne Robinson
# Lab 7

import math

def upnote(frequency):
    twlth_rt_two = math.pow(2, (1/12))
    print("Going up:\n"'%.4f' % frequency)    
    while frequency <= 880:
        frequency *= twlth_rt_two
        print('%.4f' % frequency)
        
def downnote(frequency):
    twlth_rt_two = math.pow(2, (1/12))
    print("\nGoing down:\n"'%.4f' % frequency)    
    while frequency >= 220:
        frequency /= twlth_rt_two
        print('%.4f' % frequency)
    
def main():
    upnote(440)
    downnote(440)
    
main()
    