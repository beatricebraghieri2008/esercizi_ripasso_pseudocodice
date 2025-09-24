//SCRIVERE UNA PROCEDURA SCAMBIA(A,B) CHE TENTA DI SCAMBIARE DUE NUMERI, PRIMA CON PASSAGGIO PER VALORE E POI PER RIFERIMENTO
//NOTANDO LA DIFFERENZA
import java.util.Scanner;
public class Scambia {
public static void scambiaPerValore(int a, int b) {
int temp = a;
a = b;
b = temp;
System.out.println("Dentro scambiaPerValore: a = " + a + ", b = " + b);
}

//PROCEDURA CHE MODIFICA UN ELEMENTO DI UN ARRAY
public static void scambiaPerRiferimento(int[] arr, int index1, int index2) {
int temp = arr[index1];
arr[index1] = arr[index2];
arr[index2] = temp;
System.out.println("Dentro scambiaPerRiferimento: arr[" + index1 + "] = " + arr[index1] + ", arr[" + index2 + "] = " + arr[index2]);
}  
