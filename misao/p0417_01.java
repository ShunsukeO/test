package misao;

import java.util.Scanner;

class A_0417_01 {

	int a;
	int b;
	A_0417_01(){
		Scanner shun = new Scanner(System.in);
		System.out.println("Enter a 1st number.");
		a = shun.nextInt();
		System.out.println("Enter a 2nd number.");
		b = shun.nextInt();
		System.out.println(a + b);
		
	}


}

public class p0417_01 {

	public static void main(String[] args) {
		A_0417_01 obj = new A_0417_01();
		
	}

}
