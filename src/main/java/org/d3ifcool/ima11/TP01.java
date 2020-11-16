package org.d3ifcool.ima11;
import java.util.*;

public class TP01 {

	public static void main(final String[] args) {
		// Kerjakan soalnya di sini
		Scanner input = new Scanner(System.in);

		int banyakOrang = input.nextInt();
		String[] arisan = new String[banyakOrang+1];

		for (int i = 0; i < arisan.length; i++) {
			arisan[i] = input.nextLine();
		}

		// penghitungan range
		int max = banyakOrang;
		int min = 1;
		int range = max - min + 1;
		int pemenang = (int)(Math.random() * range) + min;

		System.out.print(arisan[pemenang]);
	}
}
