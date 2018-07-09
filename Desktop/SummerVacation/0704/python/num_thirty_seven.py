import random
length = input("What's the minimum length? ")
special = input("How many special characters? ")
numbers = input("How many numbers? ")
special_word = ['!','@','#','$','%','^','&','*','~']
password = '\0'
length = int(length) - int(special) - int(numbers);
for count in range(0,int(special)) :
    password = password + random.choice(special_word)
for count in range(0,int(numbers)) :
    password = password + str(random.randrange(0,10))
if length < 1 :
    for count in range(0,random.randrange(1,6)) :
        password = password + chr(random.randrange(97,123))
else :
    for count in range(0,length)  :
        password = password + chr(random.randrange(97,123))
print(password)