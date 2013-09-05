salary = float(input('Salary: '))
percentage = float(input('Percentage: '))

rise = (percentage*salary)/100.0
print ('Salary was rise by $%d' %rise)
print ('New salary is $%.2f' %(salary + rise))
