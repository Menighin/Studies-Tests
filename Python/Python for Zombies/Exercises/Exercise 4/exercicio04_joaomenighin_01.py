import random

ints = []
bottom, top = (101, 0)

for i in range (0, 10):
    ints.append(random.randint(1, 100))

print (ints)

for i in ints:
    if i < bottom:
        bottom = i
    if i > top:
        top = i

print ("Maior: %d\nMenor: %d" %(top, bottom))
