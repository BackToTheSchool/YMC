number = list()
result = "\0"
for count in range(2000,3201) :
    if count % 7 == 0 :
        if count % 5 != 0 :
            number.append(count)
result = str(number[0])
del number[0]
for count in number :
    result = result + "," + str(count)
print(result)