//ARRAY DI 10 NUMERI DA STAMPARE AL CONTRARIO
import java.util.Scanner;

public class NumeriReverse {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
int[] numeri = new int[10];

for (int i = 0; i < 10; i++) {
System.out.print("Inserisci il numero " + (i + 1) + ": ");
numeri[i] = scanner.nextInt();
}

System.out.println("Numeri al contrario:");
for (int i = 9; i >= 0; i--) {
System.out.println(numeri[i]);
}

scanner.close();
}
}


//MINIMO E MASSIMO IN UN ARRAY

import java.util.Scanner;

public class MinMaxArray {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

System.out.print("Quanti numeri vuoi inserire? ");
int n = scanner.nextInt();

int[] numeri = new int[n];

for (int i = 0; i < n; i++) {
System.out.print("Inserisci il numero " + (i + 1) + ": ");
numeri[i] = scanner.nextInt();
}

int h_min = numeri[0];
int h_max = numeri[0];

for (int i = 1; i < n; i++) {
if (numeri[i] < h_min) {
h_min = numeri[i];
}
if (numeri[i] > h_max) {
h_max = numeri[i];
}
}

System.out.println("Il minimo è: " + h_min);
System.out.println("Il massimo è: " + h_max);

scanner.close();
}
}


//CONTARE QUANTO UN DATO NUMERO SI RIPETE NELL'ARRAY 
public class Main {
public static void main(String[] args) {
int[] dato = {5, 3, 5, 7, 5};
Integer G = null;

int primo = dato[0]; 
for (int x : dato) {
if (x == primo) {
G = 2;
break; 
}
}

System.out.println("G = " + G);
}
}
