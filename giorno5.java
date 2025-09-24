//FATTORIALE CON FUNZIONE
import java.util.Scanner;

public class Main {

    public static int calcolaFattoriale(int n) {
        int fattoriale = 1;
        for (int i = 1; i <= n; i++) {
            fattoriale *= i;
        }
        return fattoriale;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Inserisci un numero intero positivo: ");
        int n = scanner.nextInt();

        System.out.println("Il fattoriale di " + n + " è: " + calcolaFattoriale(n));

        scanner.close();
    }
}


//PROCEDURA STAMPA
import java.util.Scanner;

public class StampaArray {

    public static void stampaArray(int[] A) {
        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i] + " ");
        }
        System.out.println();
    }
}

//FUNZIONE TROVAMASSIMO
public static int trovaMassimo(int[] A) {
int max = A[0];
for (int i = 1; i < A.length; i++) {
if (A[i] > max) {
max = A[i];
}
}
return max;
}