amount = input("What is the principal amount? ")
rate = input("What is the rate? ")
years = input("What is the number of year? ")
interest = input("What is the number of times the interest is compounded per year? ")
result = float(amount) * pow((1+(float(rate)/100/int(interest))),int(interest)*int(years))
print("$",amount,"invested at", rate,"%% for",years,"years compounded",interest,"times per year is\n$%.2f" % float(result))
