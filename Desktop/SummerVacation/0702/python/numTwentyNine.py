while True :
    answer = input("What is the rate of return? ")
    if answer.isdigit() and int(answer) != 0 :
        break;
    else :
        print("Sorry. That's not a valid input")
result = 72 / int(answer)
print("It will take %d years to double your inital investment." % result)