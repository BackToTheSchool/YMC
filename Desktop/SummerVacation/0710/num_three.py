maximum = input("Input number: ")
result = {1 : 1}
for i in range(1,int(maximum) + 1) :
    result[i] = i*i
print(result)