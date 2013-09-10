n = int(input ("Digite um número entre 0 e 10, inclusive: "))

while n < 0 or n > 10:
    n = int(input("Número inválido! Digite outro: "))

print ("Número válido:", n)
