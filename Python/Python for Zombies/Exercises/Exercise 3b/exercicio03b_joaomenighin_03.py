import math

n = int(input("Número: "))

primo = True

for i in range(2, int(math.sqrt(n)) + 1):
    if n % i == 0:
        primo = False
        break

if primo:
    print ("%d é primo!" %n)
else:
    print ("%d não é primo!" %n)
