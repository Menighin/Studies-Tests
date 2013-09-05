price = float(input('Price: '))
discount_percentage = float(input('Discount percentage: '))

discount = float((price * discount_percentage ) / 100.0)

print ('Discount of $%d' %discount)
print ('New price is $%.2f' %(price - discount))
