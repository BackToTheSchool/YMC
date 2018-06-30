liters = input("How much square meters will you paint? ")
if int(liters) % 9 > 0 :
    liters = int(liters) / 9 + 1
else :
    liters = int(liters) / 9
print("You need",int(liters))