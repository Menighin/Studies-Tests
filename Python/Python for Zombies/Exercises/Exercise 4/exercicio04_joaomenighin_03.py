import random

ints1 = []
ints2 = []
inter = []

for i in range (0, 10):
    ints1.append(random.randint(1, 100))
    ints2.append(random.randint(1, 100))
    inter.append(ints1[-1])
    inter.append(ints2[-1])



print ("Primeiro: ", ints1)
print ("Segundo: ", ints2)
print ("Intercalado: ", inter)
