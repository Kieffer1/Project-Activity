class combat:
    def __init__(self, name, health, damage, skills):
        self.name = name
        self.damage = damage
        self.skills = skills
        self.health = health
    
    def nagAttack(self, ginAttack):
        self.damage -= ginAttack.health