import math
command = input()
x = 0
y = 0
while command != "exit" :
    word = command.split()
    if word[1].isdigit():
        if word[0] == "UP" :
            y = y + int(word[1])
        elif word[0] == "DOWN" :
            y = y - int(word[1])
        elif  word[0] == "LEFT" :
            x = x - int(word[1])
        elif word[0] == "RIGHT" :
            x = x + int(word[1])
    else :
        print("Input properly.")
    command = input()
    word.clear()
x = pow(x,2)
y = pow(y,2)
result =  math.sqrt(x + y)
print(int(result))