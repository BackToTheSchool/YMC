lines = input("How many lines do you want to input: ")
result = list()
for i in range(0,int(lines)) :
    result.append(input("Input your sentence: "))
for i in range(0,int(lines)) :
    sentence = str(result[i])
    print(sentence.upper())