user = input ("Usuário: ")
password = input ("Senha: ")

while user == password:
    print ("Usuário e senha devem ser diferentes entre si!")
    user = input ("Usuário: ")
    password = input ("Senha: ")

print ("Usuário cadastrado com sucesso!")
