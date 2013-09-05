cigday = int(input('Cigarretes per day: '))
years = int(input('For how long you smoke (years): '))

totalSmoked = cigday * years * 365
minutesLost = totalSmoked * 10
daysLost = float(minutesLost / (60.0*24.0))

print ('You lost %.1f days of your life' %daysLost)
