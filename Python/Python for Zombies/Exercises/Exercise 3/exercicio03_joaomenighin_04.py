f = int(input("Digite um número: "))

n1 = 1
n2 = 1
n = 2

while n < f:
    n1, n2 = (n2, n1)
    n2 += n1
    n += 1

print ("F%d = %d" %(f, n2))
