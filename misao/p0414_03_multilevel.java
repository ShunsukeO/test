package misao;

import java.util.Scanner;

class A_041403{
	Scanner shun = new Scanner(System.in);
	int a;
	public void getinfo(){
		System.out.println("Enter a 1st number.");
		a = shun.nextInt();
	}
}

class B_041403 extends A_041403{
	int b;
	public void getinfo2(){
		System.out.println("Enter a 2nd number.");
		b = shun.nextInt();
	}
}

class C_041403 extends B_041403{
	public void cal(){
		System.out.println("Add:" + (a + b));
		System.out.println("Sub:" + (a - b));
		System.out.println("Mul:" + (a * b));
		System.out.println("Div:" + (a / b));
		System.out.println("Rem:" + (a % b));
	}
}

public class p0414_03_multilevel {

	public static void main(String[] args) {
		C_041403 obj = new C_041403();
		obj.getinfo();
		obj.getinfo2();
		obj.cal();
	}

}
