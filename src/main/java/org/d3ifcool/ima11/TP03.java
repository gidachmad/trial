package org.d3ifcool.ima11;
import java.util.*;

public class TP03 {

	public static void main(final String[] args) {
		// Kerjakan soalnya di sini
		Scanner input = new Scanner(System.in);

		ArrayList<Integer> nilai = new ArrayList<Integer>();

		boolean kondisi = true;
		while (kondisi) {
			int bil = input.nextInt();

			if (bil == -1) {
				kondisi = false;
			}else{
				nilai.add(bil);
			}
		}

		int modus = 0;
		int jumlahMuncul = 0;
		for (int i = 0; i < nilai.size(); i++) {

			int muncul = 0;
			for (int j = 0; j < nilai.size(); j++) {
				if (nilai.get(i) == nilai.get(j)) {
					muncul++;
				}
				if (muncul > jumlahMuncul) {
					jumlahMuncul = muncul;
					modus = nilai.get(i);
				}else if(muncul == jumlahMuncul){
					if (modus < nilai.get(i)) {
						modus = nilai.get(i);
					}
				}
			}

		}
		System.out.print(modus + "\n");
	}
}
