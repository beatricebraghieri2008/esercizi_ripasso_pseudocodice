#SCRIVERE UNA PROCEDURA SCAMBIA(A,B) CHE TENTA DI SCAMBIARE DUE NUMERI, PRIMA CON PASSAGGIO PER VALORE E POI PER RIFERIMENTO
#NOTANDO LA DIFFERENZA
def scambia_valore(a, b):
    temp = a
    a = b
    b = temp
    print("Dentro scambia_valore: a =", a, ", b =", b)

#PROCEDURA CHE MODIFICA UN ELEMENTO DI UN ARRAY
def modifica_array(arr, index, new_value):
    if 0 <= index < len(arr):
        arr[index] = new_value
    else:
        print("Indice fuori dai limiti")  