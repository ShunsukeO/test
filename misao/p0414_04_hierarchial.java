package misao;

import java.util.Scanner;

class A_041404 {
	Scanner shun = new Scanner(System.in);
	int a;
	int b;
	public void getinfo(){
		System.out.println("Enter a 1st number.");
		a = shun.nextInt();
		System.out.println("Enter a 2nd number.");
		b = shun.nextInt();
	}
}

class B_041404 extends A_041404{
	public void addsub(){
		System.out.println("Add:" + (a + b));
		System.out.println("Sub:" + (a - b));	
	}
}

class C_041404 extends A_041404{
	public void muldiv(){
		System.out.println("Mul:" + (a * b));
		System.out.println("Div:" + (a / b));
	}
}

public class p0414_04_hierarchial {

	public static void main(String[] args) {
		B_041404 objb = new B_041404();
		C_041404 objc = new C_041404();
		
		objb.getinfo();
		objb.addsub();
		objc.getinfo();
		objc.muldiv();
	}

}
