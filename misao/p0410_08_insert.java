package misao;

import java.util.Scanner;

public class p0410_08_insert {

	public static void main(String[] args) {
		Scanner shun = new Scanner(System.in);
		
		System.out.println("Enter 9 numbers of 10.");
		int[] a = new int[10];
		for (int i = 0; i < 9; i++) {
			System.out.println("Enter number " + (i + 1) + ".");
			a[i] = shun.nextInt();
		}
		
		for(int i = 0; i < 8; i++){
			for(int j = 0; j < 8; j++){
				if(a[j] > a[j + 1]){
					int t = a[j];
					a[j] = a[j + 1];
					a[j + 1] = t;
				}
			}
		}
		
		for (int i = 0; i < 10; i++) {
			System.out.println(a[i]);
		}
		
		System.out.println("\nEnter last 1 number.");
		int n = shun.nextInt();
		
		int index = -1;
		for(int i = 0; i < 9; i++){
			if(a[i] > n){
				index = i;
				break;
			}
		}
		
		if(index >= 0){
			for(int i = 9; i > index; i--){
				a[i] = a[i - 1];
			}
			a[index] = n;
		}else{
			a[9] = n;
		}
		
		for (int i = 0; i < 10; i++) {
			System.out.println(a[i]);
		}
	}

}
