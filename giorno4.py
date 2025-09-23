#array di 10 numeri da stampare al contrario
numeri = []

for i in range(10):
numero = int(input(f"Inserisci il numero {i+1}: "))
numeri.append(numero)

print("Numeri al contrario:")
for i in range(9, -1, -1):
print(numeri[i])
