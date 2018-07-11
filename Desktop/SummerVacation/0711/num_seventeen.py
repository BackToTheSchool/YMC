money = 0
finish = True
while finish  :
    bank = input("Enter command: ")
    command = bank.split(' ')
    if command[0] is 'D' :
        money+=int(command[1])
    elif command[0] is 'W' :
        if int(command[1]) < money or int(command[1]) == money :
            money -= int(command[1])
        else :
            print(str(money) + " is all you have. Enter properly.")
    elif command[0] is 'X' :
        finish = False
    else :
        print("Enter properly.")
    command.clear()
print(money)