class character:
    def __init__ (self, name, age):
        self.name = name
        self.age = age
    
    def introduction(self):
        print("Hello my name is "+ self.name,)
        print("and I am ", self.age)
