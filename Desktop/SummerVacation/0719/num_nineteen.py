def sort(a) :
    for count in range(0,len(a)) :
        for num in range(0,len(a) -1) :
            if a[num][0] > a[num+1][0] :
                b = a[num]
                a[num] = a[num +1]
                a[num + 1] = b
            elif a[num+1][0] == a[num][0] :
                if a[num][1] > a[num+1][1] :
                    b = a[num]
                    a[num] = a[num + 1]
                    a[num+1] = b
                elif a[num][1] == a[num+1][1] :
                    if a[num][2] > a[num+1][2] :
                        b = a[num]
                        a[num] = a[num+1]
                        a[num+1]= a[num]

person = []
person.append(("Tom",19,80))
person.append(("John",20,90))
person.append(("Jony",17,91))
person.append(("Jony",17,93))
person.append(("Json",21,85))
sort(person)
print(person)
