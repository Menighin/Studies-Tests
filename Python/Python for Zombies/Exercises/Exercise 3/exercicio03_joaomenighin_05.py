a, b = map(int, input("Digite dois inteiros: ").split())

if b > a:
    dividendo = b
    divisor = a
else:
    dividendo = a
    divisor = b

while dividendo % divisor != 0:
    c = dividendo % divisor
    dividendo = divisor
    divisor = c

print ("MDC entre %d e %d é %d" %(a, b, divisor))
    
