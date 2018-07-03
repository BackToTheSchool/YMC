while True :
    pulse = input("Enter your resting pulse: ")
    age = input("Engter your age: ")
    if age.isdigit() and pulse.isdigit() :
        break;
print("Intensity        | Rate")
print("-----------------|-----")
for num in range(11,20) :
    intensity = num * 5
    rate = ((220 - int(age))-int(pulse)) * intensity / 100 + int(pulse)
    print("%d               | %d" %(intensity,rate))
