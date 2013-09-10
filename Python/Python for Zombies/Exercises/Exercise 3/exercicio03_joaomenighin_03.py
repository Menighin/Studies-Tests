a = 80000
b = 200000
y = 0

while a < b:
    a += a * (3 / 100)
    b += b * (1.5 / 100)
    y += 1

print ("Levará %d anos para que A ultrapasse B" %y)
