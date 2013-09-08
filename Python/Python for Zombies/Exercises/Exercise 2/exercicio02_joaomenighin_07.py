import math

area = float(input ("Área em metros a ser pintada: "))

litrosGastos = area / 3
latasGastas = math.ceil(litrosGastos / 18)

print ("Serão gastas %d latas e custará R$%.2f" %(latasGastas, latasGastas * 80))
