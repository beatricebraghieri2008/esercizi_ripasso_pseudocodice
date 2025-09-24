#DATI TRE NUMERI, TROVARE IL PIU GRANDE
n_max = float('-inf')

for i in range(3): 
    n = float(input("Inserisci un numero: "))
    if n > n_max:
        n_max = n

print("Il numero più grande è:", n_max)

#VERIFICARE SE UN ANNO E' BISESTILE
anno = int(input("Inserisci un anno: "))

if anno % 400 == 0:
    print("anno bisestile")
elif anno % 100 == 0:
    print("anno non bisestile")
elif anno % 4 == 0:
    print("anno bisestile")
else: 
    print("anno non bisestile")


#MENU TESTUALE 
 
import datetime

while True:
print("\n--- Menu Principale ---")
print("1 = Saluta")
print("2 = Mostra giorno e data")
print("3 = Calcola somma di tre numeri")
print("0 = Esci")

scelta = input("Scegli: ")

match scelta:
case "1":
print("Ciao, Benvenuto!")
case "2":
oggi = datetime.date.today()
print("Oggi è:", oggi)
case "3":
x = int(input("Inserisci primo numero: "))
y = int(input("Inserisci secondo numero: "))
z = int(input("Inserisci terzo numero: "))
somma = x + y + z
print("La somma è:", somma)
case "0":
print("Arrivederci!")
break
case _:
print("Scelta non valida!")