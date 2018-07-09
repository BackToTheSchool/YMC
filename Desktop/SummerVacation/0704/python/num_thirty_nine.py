class Human :
    def __init__(self,data):
        data = data.split(",")
        self.first_name = data[0]
        self.last_name = data[1]
        self.position = data[2]
        self.date = data[3]
        self.next = None
        self.before = None
    def sort(self, data):
        new_Human = Human(data)
        if new_Human.last_name > self.last_name :
            if self.next is None :
                new_Human.before = self
                self.next = new_Human
            else :
                if self.next.last_name > new_Human.last_name :
                    new_Human.next = self.next
                    new_Human.before = self
                    self.next.before =new_Human
                    self.next = new_Human
                else :
                    Human.sort(self.next,data)
        else :
            if self.before is None :
                self.before = new_Human
                new_Human.next = self
            else :
                if self.before.last_name < new_Human.last_name :
                    new_Human.before = self.before
                    self.before.after = new_Human
                    new_Human.after = self
                    self.before = new_Human
                else :
                    Human.sort(self.before,data)
    def show(self):
        while self.before is not None :
            self = self.before
        while self.next is not None :
            print(self.first_name +"\t"+ self.last_name +"\t"+ self.position +"\t" + self.date)
            self = self.next
        print(self.first_name + "\t" + self.last_name + "\t" + self.position + "\t" + self.date)
john = Human("John,Johnson,Manger,2016-12-31")
john.sort("Tou,Xiong,Software Engineer,2016-10-15")
john.sort("Michaela,Michaelson,District Manager,2015-12-19")
john.sort("Jake,Jacobson,Programmer, ")
john.sort("Jacquelyn,Jackson,DBA, ")
john.sort("Sally,Weber,Web Developer,2015-12-18")
john.show()

