package hz3;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class k2_1 {

	public static void main(String[] args) {

		// ggt(45,25);
		// printTower();
		printXO();
	}

	static void ggt(int a, int b) {
		int ta = a;
		int tb = b;

		while ((ta % tb) != 0) {
			int temp = ta;
			ta = tb;
			tb = temp % ta;
		}

		System.out.printf("Der ggt der Zahlen %d und %d ist %d", a, b, tb);
	}

	static void printTower() {
		for (int i = 0; i < 10; i++) {
			for (int b = 0; b < i; b++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	// Auf 10 Zeilen sollen jeweils 10 Zeichen ("X" oder "O") ausgegeben werden.
	// Dabei soll die Anzahl der auszugebenden X durch Zufall bestimmt
	// werden. Die Anzahl X soll zwischen 1 und 4 variieren. Als erstes Zeichen
	// soll immer ein X ausgegeben werden. Die weiteren X sollen
	// möglichst gleichmässig verteilt werden. Ihr Programm soll dazu
	// berechnenen, wieviele O hierzu zwischen zwei X stehen müssen.
	// Am Schluss soll das Programm die Zeile mit O auf 10 Zeichen auffüllen.
	static void printXO() {
		Random rnd = new Random();
		int min = 1;
		int max = 5;

		ArrayList<String> lines = new ArrayList<String>();

		Row: for (int a = 0; a < 10; a++) {
			double rndXcount;
			double rndOCount;
			double linespace = 9;
			double charInterval = 0;
			String toAdd = "";
			DecimalFormat df = new DecimalFormat("#");

			rndXcount = rnd.nextInt(max - min) + min;
			rndOCount = 10 - rndXcount;

			charInterval = Math.round(linespace / (rndXcount));

			if (rndXcount == 2) {
				charInterval = 4;
			}

			toAdd += "X";
			rndXcount--;
			boolean oTurn = true;
			boolean xTurn = false;
			int counter = 0;

			while (toAdd.length() < 10) {
				if (xTurn && rndXcount != 0) {
					toAdd += "X";
					rndXcount--;
					xTurn = false;
				} else if (!xTurn) {
					if (counter == charInterval) {
						xTurn = true;
						counter = 0;
					} else {
						toAdd += "O";
						counter++;
					}
				}
			}

			// while(toAdd.length() != 10)


			lines.add(toAdd);
		}

		System.out.println("AUSGABE--------------------------------");

		for (String s : lines) {
			System.out.println(s);
		}
	}
}
