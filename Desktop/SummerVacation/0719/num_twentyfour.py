def printstr(str, str2) :
    if len(str) > len(str2) :
        print(str)
    elif len(str) < len(str2) :
        print(str2)
    else :
        print(str)
        print(str2)

x = input("Input first string: ")
y = input("Input second string: ")
printstr(x,y)