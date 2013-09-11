n = int(input("Número para verificar triangularidade: "))

triangular = False

factor = 2

while factor * (factor - 1) * (factor - 2) <= n:
    if factor * (factor - 1) * (factor - 2) == n:
        triangular = True
    factor += 1

if triangular:
    print ("O número %d é triangular!" %n)
else:
    print ("O número %d não é triangular!" %n)
