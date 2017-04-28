package misao;

import java.util.Scanner;

abstract class A_0419_02{
	Scanner shun = new Scanner(System.in);
	int a, b;
	
	A_0419_02(){
		System.out.println("Enter a 1st number.");
		a = shun.nextInt();
		System.out.println("Enter a 2nd number.");
		b = shun.nextInt();
	}
	
	public void add(){
		System.out.println("add is " + (a + b));
	}
	
	public void sub(){
		System.out.println("sub is " + (a - b));
	}
}

class B_0419_02 extends A_0419_02{
	public void mul(){
		System.out.println("mul is " + (a * b));
	}
}

public class p0419_02 {

	public static void main(String[] args) {
		B_0419_02 obj = new B_0419_02();
		obj.add();

//		A_0419_02 obj2 = new A_0419_02();
		
	}

}
