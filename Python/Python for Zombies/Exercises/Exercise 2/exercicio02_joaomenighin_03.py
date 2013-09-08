weight = float(input('Qual o peso do peixe em Kg? '))

multa, excesso = (0, 0);

if weight > 50:
    excesso = weight - 50.0
    multa = excesso * 4.0

print ('Peso excedido: %.2f kilos\nMulta a ser paga: R$%.2f' %(excesso, multa))
