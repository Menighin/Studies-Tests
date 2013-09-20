result = 0

for i in range (18644, 33087):
    if str(i).find("2") != -1 and str(i).find("7") == -1:
        result += 1

print (result)
