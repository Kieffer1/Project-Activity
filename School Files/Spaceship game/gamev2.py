import pygame
pygame.init()

class Character:
    def __init__(self, x, y, image,speed):
        self.x = x
        self.y = y
        self.width = 80
        self.height = 80
        self.image = image
        self.image = pygame.transform.scale(self.image, (self.width, self.height))
        self.speed = speed
        self.hitbox = pygame.Rect(self.x, self.y, self.width, self.height)
        self.health = 100

    
    def exist(self, screen):
        self.hitbox = pygame.Rect(self.x, self.y, self.width, self.height)
        pygame.draw.rect(screen, (100, 100, 100), self.hitbox)
        screen.blit(self.image, (self.x, self.y))
        self.movement()

        
    def movement(self):
        key = pygame.key.get_pressed()
        if key[pygame.K_w] and self.y > 0:
            self.y -= self.speed
        if key[pygame.K_s] and self.y < 520:
            self.y += self.speed

    def isGettingHit(self, enemies):
        colliding = pygame.Rect.colliderect(self.hitbox, enemies.hitbox)
        if colliding:
            self.health -= 2
            print(self.health)
class EnemyChar(Character):
    def movement(self):
        self.x += self.speed