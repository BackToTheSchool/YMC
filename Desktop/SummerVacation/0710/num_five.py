class String :
    def getString(self):
        self.string = input("Input the string: ")
    def printString(self):
        print(self.string.upper())

test = String()
test.getString()
test.printString()