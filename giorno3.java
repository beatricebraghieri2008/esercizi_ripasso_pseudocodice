//fattoriale
import java.util.Scanner;

public class Fattoriale {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
System.out.print("Inserisci un numero intero positivo: ");
int n = input.nextInt();

long fattoriale = 1;
for (int i = 1; i <= n; i++) {
fattoriale *= i;
}

System.out.println("Il fattoriale di " + n + " è: " + fattoriale);
input.close();
}
}


//somma primi n numeri pari

import java.util.Scanner;

public class SommaNumeriPari {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);

System.out.print("Inserisci un numero: ");
int n = input.nextInt();

int somma = 0;
System.out.println("I primi " + n + " numeri pari sono:");

for (int i = 1; i <= n; i++) {
int pari = 2 * i;
System.out.print(pari + " ");
somma += pari;
}

System.out.println("\nLa somma è: " + somma);
input.close();
}
}