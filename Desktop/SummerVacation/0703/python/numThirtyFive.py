import random
name = list()
finish = True
while finish :
    player = input("Enter a name: ")
    if len(player) == 0 :
        finish = False
    else :
        name.append(player)

if len(name) != 0 :
    print("The winner is",name[random.randrange(0,len(name))])
else :
    print("You need more player.")
