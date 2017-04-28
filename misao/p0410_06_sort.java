package misao;

import java.util.Scanner;

public class p0410_06_sort {

	public static void main(String[] args) {
		Scanner shun = new Scanner(System.in);

		System.out.println("Enter 10 numbers.");
		int[] a = new int[10];
		for (int i = 0; i < 10; i++) {
			System.out.println("Enter number " + (i + 1) + ".");
			a[i] = shun.nextInt();
		}
		
		for(int i = 0; i < 10; i++){
			for(int j = 0; j < 9; j++){
				if(a[j] > a[j + 1]){
					int t = a[j];
					a[j] = a[j + 1];
					a[j + 1] = t;
				}
			}
		}
		
		System.out.println("Sorted numbers");
		for (int i = 0; i < 10; i++) {
			System.out.println(a[i]);
		}

	}

}
