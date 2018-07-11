number = input("Enter the number: ")
result = list()
for count in range(1,5) :
    x = 0
    for y in range(0,count) :
        x+= pow(10,y)
    result.append(int(number) * x)
print(sum(result))