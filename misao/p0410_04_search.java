package misao;

import java.util.Scanner;

public class p0410_04_search {

	public static void main(String[] args) {
		Scanner shun = new Scanner(System.in);
		
		System.out.println("Enter 10 numbers.");
		int []a = new int[10];
		for(int i = 0; i < 10; i++){
			System.out.println("Enter number " + (i + 1) + ".");
			a[i] = shun.nextInt();
		}
		
		System.out.println("\nEnter a number you want to find.");
		int n = shun.nextInt();
		
		int index = -1;
		for(int i = 0; i < 10; i++){
			if(a[i] == n){
				index = i;
				break;
			}
		}
		
		if(index >= 0){
			System.out.println(n + " is found in index number of " + index + ".");
		}else{
			System.out.println(n + "is not found.");
		}
		

		
		
	}

}
