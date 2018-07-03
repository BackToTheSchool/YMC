password = input("Input your password: ")
if len(password) < 8 :
    if password.isdigit() :
        print(password,"is very weak password.")
    elif password.isalpha() :
        print(password, "is weak password.")
    else :
        print(password,"is just enough.")
else :
    if password.isdigit() or password.isalpha() :
        print(password,"is just enough.")
    elif password.isalnum() :
        print(password,"is strong password.")
    else :
        print(password, "is very strong password.")