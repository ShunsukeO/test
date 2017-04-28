package misao;

import java.util.Scanner;

class A {
	public void add(int a, int b) {
		int c = a + b;
		System.out.println("The addition is " + c + ".");
	}
}

class B {
	public void sub(int a, int b) {
		int c = a - b;
		System.out.println("The substraction is " + c + ".");
	}
}

class C {
	public void mul(int a, int b) {
		int c = a * b;
		System.out.println("The multiplication is " + c + ".");
	}
}

class D {
	public void div(int a, int b) {
		int c = a / b;
		System.out.println("The division is " + c + ".");
	}
}

class E {
	public void rem(int a, int b) {
		int c = a % b;
		System.out.println("The reminder is " + c + ".");
	}
}

public class p0412_01_class_cal {

	public static void main(String[] args) {
		Scanner shun = new Scanner(System.in);
		
		System.out.println("Enter a 1st number.");
		int a = shun.nextInt();
		System.out.println("Enter a 2nd number.");
		int b = shun.nextInt();
		
		A objA = new A();
		objA.add(a, b);
		
		B objB = new B();
		objB.sub(a, b);
		
		C objC = new C();
		objC.mul(a, b);
		
		D objD = new D();
		objD.div(a, b);
		
		E objE = new E();
		objE.rem(a, b);
		

	}

}
