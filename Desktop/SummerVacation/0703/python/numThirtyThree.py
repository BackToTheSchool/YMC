import random
def switch(a) :
    return{
        0 : "Yes.",
        1 : "Maybe.",
        2 : "No.",
        3 : "Ask me later.",
    }.get(a,"")
question = input("What is the question? ")
print(switch(random.randrange(0,4)))