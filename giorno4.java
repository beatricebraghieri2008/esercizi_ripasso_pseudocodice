//array di 10 numeri da stampare al contrario
import java.util.Scanner;

public class NumeriReverse {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
int[] numeri = new int[10];

// Inserimento
for (int i = 0; i < 10; i++) {
System.out.print("Inserisci il numero " + (i + 1) + ": ");
numeri[i] = scanner.nextInt();
}

// Stampa al contrario
System.out.println("Numeri al contrario:");
for (int i = 9; i >= 0; i--) {
System.out.println(numeri[i]);
}

scanner.close();
}
}