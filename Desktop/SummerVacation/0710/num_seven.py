x = input("Input x: ")
y = input("Input y: ")
result = list()
for a in range(0,int(x)) :
    line = list()
    for b in range(0,int(y)) :
        line = line + [a*b]
    result.append(line)
print(result)