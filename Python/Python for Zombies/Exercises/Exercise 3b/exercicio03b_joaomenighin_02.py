total = float(input("Total da conta: "))
pago = float(input("Total pago: "))

troco = int(pago - total)
money = [50, 20, 10, 5, 2, 1]
notas = [0,  0,  0,  0, 0, 0]

print ("Seu troco é de %d" %troco)

for idx, cel in enumerate(money):
    while troco - cel >= 0:
        notas[idx] += 1
        troco -= cel

print ("Quant.\tValor")
for idx, cel in enumerate(money):
    print ("%d\t%d" %(notas[idx], cel))
