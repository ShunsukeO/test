package misao;

import java.util.Scanner;

public class p0407_07 {

	public static void main(String[] args) {
		Scanner shun = new Scanner(System.in);
		
		System.out.println("How many x in one side of square?");
		int a = shun.nextInt();
		
		int i = 1;
		while(i <= 2 * a - 1){
			System.out.print("x");
			i++;
		}
		
		System.out.println();
		
		i = 1;
		while(i < a){
			int j = i;
			while(j < a){
				System.out.print("x");
				j++;
			}
			int k = 1;
			while(k <= 2 * i - 1){
				System.out.print(" ");
				k++;
			}
			j = i;
			while(j < a){
				System.out.print("x");
				j++;
			}
			
			System.out.println();
			i++;
			
		}
		
		i = 2;
		while(i < a){
			int j = 1;
			while(j <= i){
				System.out.print("x");
				j++;
			}
			int k = 2 * i + 1;
			while(k < 2 * a){
				System.out.print(" ");
				k++;
			}
			j = 1;
			while(j <= i){
				System.out.print("x");
				j++;
			}
			
			System.out.println();
			i++;
		}
		
		i = 1;
		while(i <= 2 * a - 1){
			System.out.print("x");
			i++;
		}
	
		
		
	}

}
