weight = input("How much weigh you are? ")
height = input("How much tall you are? ")
height = float(height) / 100
bmi = float(weight)/ float(pow(float(height),2))
print("Your BMI is %.1f\n" % float(bmi))
if float(bmi) < 18.5 :
    print("You need more weight")
elif float(bmi) > 25 :
    print("You are overweight.")
else :
    print("You are fine.")