a, b, c = map(int, input("Digite os 3 lados do triangulo: ").split())

if abs(b - c) < a and a < b + c and abs (a - c) < b and b < a + c and abs(a - b) < c and c < a + b:
    result = "Os lados formam um triângulo "
    if a == b and b == c:
        result += "equilátero"
    elif a == b or b == c or a == c:
       result += "isósceles"
    elif a != b and b != c and a != c:
        result += "escaleno"
else:
    result = "Os lados não formam um triângulo"

print (result)
