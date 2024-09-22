import pygame
import Characters
import random
pygame.init()
window = pygame.display.set_mode((1000, 600))

EneShip = pygame.image.load('EnemyShip.JPG')
ship = pygame.image.load('Falcon.JPG')
ship = pygame.transform.rotate(ship, 270)
characterList = []

janin = Characters.Character(850, 250, ship,5)

fps = pygame.time.Clock()
spawnTime = 100
lvlspeed = 5
speedincrease = 200
run = True
while run:
    fps.tick(60)
    for event in pygame.event.get():
        if event.type == pygame.QUIT:
            run = False
    window.fill((100, 100, 100))
    

    for i in characterList:
        i.exist(window)
        janin.isGettingHit(i)

        
    if speedincrease == 0:
        lvlspeed += 1
        janin.speed +=1
        speedincrease = 200
    
            
    if spawnTime <= 0:
        enemyShips = Characters.EnemyChar(0, random.randrange(0, 500), EneShip,lvlspeed)
        characterList.append(enemyShips)
        spawnTime = 100

    speedincrease -=1
    spawnTime -= 2
    janin.exist(window)

    
    pygame.display.update()



pygame.quit()