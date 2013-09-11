n = int(input("Número: "))

factors = []

for i in range(2, n+1):
    while n % i == 0:
        if len(factors) == 0 or factors[-1][0] != i:
            factors.append([i, 1])
        else:
            factors[-1][1] += 1
        n /= i

print ("Primo\t|   Multiplicidade")
for i in factors:
    print("%d\t|   %d" %(i[0], i[1]))
