class School :
    def __init__(self):
        self._name = ''

    def set_school(self,name):
        self._name = name

    def get_name(self):
        return self._name


class Department :

    def __init__(self):
        self._name = ''
        self._name_of_building = ''
        self._school = School()

    def set_department(self,name,building,name_of_school):
        self._name = name
        self._name_of_building = building
        self._school.set_school(name_of_school)

    def get_name(self) :
        return self._name

    def get_name_of_building(self):
        return self._name_of_building

    def get_school(self) :
        return self._school.get_name()


class Office :

    def __init__(self):
        self._name = ''
        self._room_number = ''
        self._school = School()

    def set_office(self,name,roomnumber,name_of_school):
        self._name = name
        self._room_number = roomnumber
        self._school.set_school(name_of_school)

    def get_name(self):
        return self._name

    def get_room_number(self):
        return self._room_number

    def get_school(self):
        return self._school.get_name()

class Person :

    def __init__(self):
        self._name = ''
        self._age = 0
        self._sex = ''

    def set_person(self,name,age,sex):
        self._name = name
        self._age = age
        self._sex = sex

    def get_name(self):
        return self._name

    def get_age(self) :
        return self._age

    def get_sex(self) :
        return self._sex

class Student(Person) :

    def __init__(self):
        super().__init__()
        self._major = ''
        self.department = Department()
    def set_student(self,name,age,sex,major,name_of_department,building_name,name_of_school):
        super().set_person(name,age,sex)
        self._major = major
        self.department.set_department(name_of_department,building_name,name_of_school)

    def show(self) :
        print(super().get_name() + " is " + str(super().get_age()) + " years old.\n" + super().get_sex() + " major is " + self._major
              + " and department is " + self.department.get_name() + ".\nIt's in "+ self.department.get_name_of_building()
              +".\n"+super().get_sex() + " school is " + self.department.get_school())

class Professor(Person) :

    def __init__(self):
        super().__init__()
        self._department = Department()
        self._number_of_class = 0

    def set_professor(self,name,age,sex,name_of_department,building_name,name_of_school):
        super().set_person(name,age,sex)
        self._department.set_department(name_of_department,building_name,name_of_school)

    def show(self):
        print(super().get_name()+" is "+str(super().get_age())+" years old and teach "+str(self._number_of_class)+" classes.\n"+
              super().get_sex()+" department is "+self._department.get_name()+".\nIt's in "+self._department.get_name_of_building()
              + ".\n "+super().get_sex() + " school is "+ self._department.get_school())


class Faculty(Person) :

    def __init__(self):
        super().__init__()
        self._office = Office()

    def set_faculty(self,name,age,sex,name_of_office,room_number,name_of_school):
        super().set_person(name,age,sex)
        self._office.set_office(name_of_office,room_number,name_of_school)

    def show(self):
        print(super().get_name()+" is "+str(super().get_age())+" years old.\n"+super().get_sex() +" office is "+self._office.get_name()
              +" and it's in "+self._office.get_room_number()+".\n "+super().get_sex()+" school is "+self._office.get_school())

class Alumni(Student) :

    def __init__(self):
        super().__init__()
        self._job = ''

    def set_alumni(self,name,age,sex,major,name_of_department,name_of_building,name_of_school,job):
        super().set_student(name,age,sex,major,name_of_department,name_of_building,name_of_school)
        self._job = job

