numbers = input("Input the 4 binary numbers: ")
numbers = numbers.split(",")
for i in numbers :
    token = int(i)
    if int(bin(token),2) % 5 ==0 :#why 0100 % 5 is 0?
        print(i)