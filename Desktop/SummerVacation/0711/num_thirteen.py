sentence = input("Enter your sentence: ")
number = 0
letter = 0
for i in range(0,len(sentence)) :
    if sentence[i].isdigit() :
        number = number + 1
    elif sentence[i].isalpha() :
        letter = letter + 1

print("LETTERS : " + str(letter) + "\nDIGITS: " + str(number))

