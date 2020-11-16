package org.d3ifcool.ima11;
import java.util.*;

public class Jurnal03 {

	public static void main(final String[] args) {
		// Kerjakan soalnya di sini
		Scanner input = new Scanner(System.in);

		int inputData = input.nextInt();
		int[] data = new int[inputData];
		int banyakData = data.length;

		for (int i = 0; i < banyakData; i++) {
			data[i] = input.nextInt();
		}

		int modus = 0;
		int jumlahMuncul = 0;
		for (int i = 0; i < banyakData; i++) {
			int muncul = 0;
			for (int j = 0; j < banyakData; j++) {
				if(data[i]==data[j]){
					muncul++;
				}
				if (muncul > jumlahMuncul) {
					jumlahMuncul = muncul;
					modus = data[i];
				}else if (muncul == jumlahMuncul) {
					if (modus < data[i]) {
						modus = data[i];
					}
				}
			}

		}
		System.out.println(modus);

	}
}
