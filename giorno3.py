#fattoriale
n = int(input("Inserisci un numero intero positivo: "))

fattoriale = 1
for i in range(1, n + 1):
    fattoriale *= i  

print(f"Il fattoriale di {n} è: {fattoriale}")


#somma primi n numeri pari

n = int(input("Inserisci un numero: "))

somma = 0
print("I primi", n, "numeri pari sono:")

for i in range(1, n + 1):
    pari = 2 * i  # Deve essere indentato
    print(pari, end=" ")
    somma += pari

print("\nLa somma è:", somma)

