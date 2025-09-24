#ARRAY DI 10 NUMERI DA STAMPARE AL CONTRARIO
numeri = []

for i in range(10):
numero = int(input(f"Inserisci il numero {i+1}: "))
numeri.append(numero)

print("Numeri al contrario:")
for i in range(9, -1, -1):
print(numeri[i])

#MINIMO E MASSIMO IN UN ARRAY
n = int(input("Quanti numeri vuoi inserire? "))

numeri = []
for i in range(n):
numero = int(input(f"Inserisci il numero {i+1}: "))
numeri.append(numero)

h_min = numeri[0]
h_max = numeri[0]

for i in range(1, n):
if numeri[i] < h_min:
h_min = numeri[i]
if numeri[i] > h_max:
h_max = numeri[i]

print("Il minimo è:", h_min)
print("Il massimo è:", h_max)

#CONTARE QUANTO UN DATO NUMERO SI RIPETE NELL'ARRAY 
dato = [5, 3, 5, 7, 5]
G = None

primo = dato[0]
for x in dato:
if x == primo:
G = 2
break 

print("G =", G)