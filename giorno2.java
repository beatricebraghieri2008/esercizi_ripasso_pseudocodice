//DATI TRE NUMERI, TROVARE IL PIU GRANDE

let n_max = -Infinity;

for (let i = 0; i < 3; i++) {
  let n = parseFloat(prompt("Inserisci un numero:")); 
  if (n > n_max) {
    n_max = n;
  }
}

console.log("Il numero più grande è: " + n_max);

//VERIFICARE SE UN ANNO E' BISESTILE

import java.util.Scanner;

public class Bisestile {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);

System.out.print("Inserisci un anno: ");
int anno = input.nextInt();

if (anno % 400 == 0) {
  System.out.println("Anno bisestile");
} else if (anno % 100 == 0) {
  System.out.println("Anno non bisestile");
} else if (anno % 4 == 0) {
  System.out.println("Anno bisestile");
} else {
System.out.println("Anno non bisestile");
}

input.close();
}
}


//MENU TESTUALE
import java.time.LocalDate;
import java.util.Scanner;

public class Menu {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
int scelta;

do {
System.out.println("\n--- Menu Principale ---");
System.out.println("1 = Saluta");
System.out.println("2 = Mostra giorno e data");
System.out.println("3 = Calcola somma di tre numeri");
System.out.println("0 = Esci");
System.out.print("Scegli: ");
scelta = input.nextInt();

switch (scelta) {
case 1:
System.out.println("Ciao, Benvenuto!");
break;

case 2:
LocalDate oggi = LocalDate.now();
System.out.println("Oggi è: " + oggi);
break;

case 3:
System.out.print("Inserisci primo numero: ");
int x = input.nextInt();
System.out.print("Inserisci secondo numero: ");
int y = input.nextInt();
System.out.print("Inserisci terzo numero: ");
int z = input.nextInt();
int somma = x + y + z;
System.out.println("La somma è: " + somma);
break;

case 0:
System.out.println("Arrivederci!");
break;

default:
System.out.println("Scelta non valida!");
}
} while (scelta != 0);

input.close();
}
}

