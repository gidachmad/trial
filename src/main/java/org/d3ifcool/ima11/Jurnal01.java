package org.d3ifcool.ima11;
import java.util.*;

public class Jurnal01 {

	public static void main(final String[] args) {
		// Kerjakan soalnya di sini
		Scanner input = new Scanner(System.in);

		ArrayList<String> namaList = new ArrayList<String>();

		boolean kondisi = true;
		while (kondisi) {
			String namaInput = input.nextLine();
			char kondisi0 = namaInput.charAt(0);
			if (kondisi0 == '-') {
				kondisi = false;
			}else{
				namaList.add(namaInput);
			}
		}

		int max = namaList.size() - 1;
		int min = 0;
		int range = max - min + 1;
		kondisi = true;

		int pemenang = (int)(Math.random() * range) + min;
		System.out.print(namaList.get(pemenang));

	}
}
