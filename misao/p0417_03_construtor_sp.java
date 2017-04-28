package misao;

import java.util.Scanner;

class A_0417_03{
	Scanner shun = new Scanner(System.in);
	int a;
	int b;
	A_0417_03(){
		System.out.println("Enter a 1st number.");
		a = shun.nextInt();
		System.out.println("Enter a 2nd number.");
		b = shun.nextInt();
	}
}

class B_0417_03 extends A_0417_03{
	B_0417_03(){
		System.out.println("The add is " + (a + b));
	}
}

class C_0417_03 extends B_0417_03{
	C_0417_03(){
		System.out.println("The sub is " + (a - b));
	}
}

class D_0417_03 extends C_0417_03{
	D_0417_03(){
		System.out.println("The mul is " + (a * b));
	}
}

class E_0417_03 extends D_0417_03{
	E_0417_03(){
		System.out.println("The div is " + (a / b));
	}
}

class F_0417_03 extends E_0417_03{
	F_0417_03(){
		System.out.println("The rem is " + (a % b));
	}
}

public class p0417_03_construtor_sp {

	public static void main(String[] args) {
		F_0417_03 obj = new F_0417_03();
	}

}
