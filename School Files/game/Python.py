class Character:
    
    def __init__(self, name, health):
        self.name = name
        self.health = health
        
    def showHealth(self):
        print(self.name, "health left is", self.health)
        
    def attackedByPico(self):
        print(self.name, "Took a damage")
        self.health -= 1100
        print("Sora's hp left was", sora.health)
        if sora.health <= 0:
            print("Sora Died")
        
    def attackedBySora(self):
        print(self.name, "Took a damage")
        self.health -= 200
        print("Pico's hp left was", pico.health)
        if pico.health <= 0:
            print("Pico Died")
        
    def soraHealed(self):
        print(self.name, "Was healed")
        self.health += 500
        print("Sora's hp is", sora.health)
        
    def picoHealed(self):
        print(self.name, "Was healed")
        self.health += 500
        print("Pico's hp is", pico.health)
        
sora = Character("Sora", 1000)
sora.attackedByPico()
sora.soraHealed()

pico = Character("Pico", 700)