oz = input("How much oz did you drink? ")
weight = input("How much weigh you are? ")
sex = input("If you are a man input 'm', you are a woman input 'w'")
hour = input("When did you drink? ")
if sex == 'm' :
    result = (float(oz) * 5.14/ (float(weight) * 0.73)) - (0.015*int(hour))
else :
    result = (float(oz) * 5.14/ (float(weight) * 0.6)) - (0.015*int(hour))
if float(result) < 0.08 :
    print("Your BAC is %.2f\nIt is legal for drive." % float(result))
else :
    print("Your BAC is %.2f\nIt is illegal for drive." % float(result))
