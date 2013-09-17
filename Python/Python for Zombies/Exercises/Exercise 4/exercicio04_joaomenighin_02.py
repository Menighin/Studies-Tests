import random

ints = []
odd = []
even = []

for i in range (0, 20):
    ints.append(random.randint(1, 100))
    if ints[-1] % 2 == 0:
        even.append(ints[-1])
    else:
        odd.append(ints[-1])

print ("Todos: ", ints)
print ("Pares: ", even)
print ("Ímpares: ", odd)
