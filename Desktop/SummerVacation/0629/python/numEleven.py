euro = input("How much Euro do you have? ")
rate = input("What is the rate? ")
result = float(euro) * float(rate) / 1113.58575
if (float(result) * 1000) - int(float(result) * 100) > 1 :
    print("%.2f Euro is %.2f dollar" %(float(euro),float(result)+0.01))
else :
    print("%.2f Euro is %.2f dollar" %(float(euro),float(result)))