package misao;

import java.util.Scanner;

public class p0410_03_search {

	public static void main(String[] args) {
		Scanner shun = new Scanner(System.in);

		int[] a = new int[5];
		a[0] = 6;
		a[1] = 8;
		a[2] = 12;
		a[3] = 14;
		a[4] = 18;

		System.out.println("Enter a number.");
		int n = shun.nextInt();

		int misao = 0;
		for (int i = 0; i < 5; i++) {
			if (a[i] == n) {
				misao++;
			}
		}

		if (misao > 0) {
			System.out.println("I have it!");
		} else {
            System.out.println("I don't have.");
		}
	}

}
