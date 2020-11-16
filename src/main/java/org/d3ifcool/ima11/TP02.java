package org.d3ifcool.ima11;
import java.util.*;

public class TP02 {

	public static void main(final String[] args) {
		// Kerjakan soalnya di sini
		Scanner input = new Scanner(System.in);

		int peserta = input.nextInt();
		int[] nilai = new int[peserta];
		for (int i = 0; i < nilai.length; i++) {
			nilai[i] = input.nextInt();
		}

		Arrays.sort(nilai);
		int max = nilai.length - 1;

		for (int j = max; j >= 0; j--) {
			System.out.print(nilai[j] + " ");
		}

	}
}
