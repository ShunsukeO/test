package misao;

import java.util.Scanner;

public class p0405_08_num {

	public static void main(String[] args) {
		Scanner shun = new Scanner(System.in);
		
//		System.out.println("Enter an odd number.");
//		int a = shun.nextInt();
//		
//		if(a % 2 == 1){
//			for(int i = a + 1; i < a * a; i = i + 2){
//				System.out.println(i);
//			}
//		}else{
//			System.out.println("Enter an ODD number.");
//		}
		
		System.out.println("Enter a 1st number.");
		int a = shun.nextInt();
		System.out.println("Enter a 2nd number.");
		int b = shun.nextInt();
		
		if(a > b){
			int t = a;
			a = b;
			b = t;
		}
		
		for(; a <= b; a++){
			if(a % 2 == 0){
				System.out.println(a);
			}
		}
	}

}
