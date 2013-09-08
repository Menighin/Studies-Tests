reaisHora = float(input("R$/h: "))
horasTrabalhadas = float(input("Horas trabalhadas no mês: "))

sBruto = reaisHora * horasTrabalhadas
iRenda = 11 * sBruto / 100
inss = 8 * sBruto / 100
sindicato = 5 * sBruto / 100
sLiquido = sBruto - iRenda - inss - sindicato

print ("+ Salário Bruto:R$%.2f" %sBruto)
print ("- IR(11%%): R$%.2f" %iRenda)
print ("- INSS(8%%): R$%.2f" %inss)
print ("- Sindicato(5%%): R$%.2f" %sindicato)
print ("= Salário Liquido: R$%.2f" %sLiquido)
