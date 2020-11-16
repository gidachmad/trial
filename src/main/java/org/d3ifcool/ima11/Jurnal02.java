package org.d3ifcool.ima11;
import java.util.*;

public class Jurnal02 {

	public static void main(final String[] args) {
		// Kerjakan soalnya di sini

		Scanner input = new Scanner(System.in);
		ArrayList<Integer> poin = new ArrayList<Integer>();

		boolean kondisi = true;
		while (kondisi) {
			int nilai = input.nextInt();
			if (nilai == -1) {
				kondisi = false;
			}else {
				poin.add(nilai);
			}
		}

		Collections.sort(poin, Collections.reverseOrder());

		for (int i = 0; i < poin.size(); i++) {
			System.out.print(poin.get(i) + " ");
		}
		System.out.print("\n");

	}
}
