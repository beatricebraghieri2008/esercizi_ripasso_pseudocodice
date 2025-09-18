#GIORNO 1#

#area rettangolo
base = int(input("inserisci la base: "))
altezza = int(input("inserisci l'altezza: "))
area=(base*altezza)/2
print("L'area del rettangolo è:", area)


#scambio valori di due variabili
x = int(input("Inserisci x: "))
y = int(input("Inserisci y: "))

z = x
x = y
y = z

print("Dopo lo scambio: x =", x, ", y =", y)


#conversione celsius fahrenheit
celsius = float(input("Inserisci la temperatura in gradi Celsius: "))

fahrenheit = (celsius + 17.7) * (9/5)
print("La temperatura in gradi Fahrenheit è:", fahrenheit)

