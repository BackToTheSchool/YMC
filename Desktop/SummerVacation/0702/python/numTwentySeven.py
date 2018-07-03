def validateInput(fi_name,la_name,code,employee) :
    message = "\0"
    if len(fi_name) < 2 :
        message = message + fi_name + " is too short.\n"
    if len(la_name) < 2 :
        message = message + la_name + " is too short.\n"
    if not code.isdigit() :
        message = message + code + " isn't number.\n"
    if len(employee) == 7 :
        if not (employee[0].isalpha() and  employee[1].isalpha()) :
            message = message + employee + "'s first two letter will be letter.\n"
        if employee[2] != '-' :
            message = message + employee + "'s third letter will be -.\n"
        if not( employee[3].isdigit() and employee[4].isdigit() and employee[5].isdigit() and employee[6].isdigit()) :
            message = message + employee + "'s fourth to last letter will be number.\n"
    else :
        message = message + employee + "i s too short.\n"
    if message == "\0" :
        message = "There are no errors."
    return message
first_name = input("Enter the first name: ")
last_name = input("Enter the last name: ")
zip_code = input("Enter the zip code: ")
employee_id =input("Enter an employee ID: ")
result = validateInput(first_name,last_name,zip_code,employee_id)
print(result)