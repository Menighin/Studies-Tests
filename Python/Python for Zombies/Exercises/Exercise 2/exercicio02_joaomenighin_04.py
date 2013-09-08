a, b, c = map(int, input("Digite os 3 números A, B e C: ").split())

if a > b and a > c:
    print ("A é o maior!")
elif b > a and b > c:
    print ("B é o maior!")
elif c > a and c > b:
    print ("C é o maior!")
else:
    print ("Há um empate!");
