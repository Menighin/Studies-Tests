year = int(input('Introduza o ano: '))

if year % 4 == 0:
    if year % 100 == 0:
        if year % 400 == 0:
            print ('É bissexto')
        else:
            print ('Não é bissexto')
    else:
        print ('É bissexto')
else:
    print ('Não é bissexto')
