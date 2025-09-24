#FATTORIALE CON FUNZIONE
def calcolaFattoriale(n):
    fattoriale = 1
    for i in range(1, n + 1):
        fattoriale *= i
    return fattoriale

n = int(input("Inserisci un numero intero positivo: "))
print(f"Il fattoriale di {n} è: {calcolaFattoriale(n)}")


#PROCEDURA STAMPA
def stampaArray(A):
    for elemento in A:
        print(elemento, end=' ')
    print()

#FUNZIONE TROVAMASSIMO
def trovaMassimo(A):
    if len(A) == 0:
        return None 
    massimo = A[0]
    for elemento in A:
        if elemento > massimo:
            massimo = elemento
    return massimo