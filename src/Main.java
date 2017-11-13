import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Wie viele Aufgaben sollen es sein? ");
		int anzahl = Integer.valueOf(scanner.nextLine());

		int richtige = 0;
		for (int i = 0; i < anzahl; i++) {
			System.out.println();
			int zahl1 = (int) (Math.random() * 10);
			int zahl2 = (int) (Math.random() * 10) + 10;
			System.out.print("Wieviel ist " + zahl1 + " * " + zahl2 + " ? ");
			int ergebnis = Integer.valueOf(scanner.nextLine());
			if (zahl1 * zahl2 == ergebnis) {
				System.out.println("Richtig!");
				richtige++;
			}else {
				System.out.println("Leider daneben!");
			}
		}
		System.out.println();
		System.out.println("Sie haben unter " + anzahl + " Aufgabe(n) " + richtige + " richtig beantwortet!");
		System.out.println("Ergebnis erzielt. Erfolgsquote: " + (anzahl * 100 / richtige) + "%");
	}

}
