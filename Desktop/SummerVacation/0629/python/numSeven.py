import math
length = input("What is the length of the room in feet? ")
width = input("What is the width of the room in feet? ")
result = int(length) * int(width)
resInMeter = pow(int(result),2) * 0.09290304
resInMeter = math.sqrt(resInMeter)
print("You entered dimensions of",length,"feet by",width,"feet\nThe area is\n",result,"square feet\n",resInMeter,"square meters.");