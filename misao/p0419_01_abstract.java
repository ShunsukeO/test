package misao;

import java.util.Scanner;

abstract class A_0419{
	Scanner shun = new Scanner(System.in);
	int a, b;
	
	//constructor
	A_0419(){
		System.out.println("Enter a 1st number.");
		a = shun.nextInt();
		System.out.println("Enter a 2nd number.");
		b = shun.nextInt();
	}
	
	abstract int add();
	abstract int sub();
	abstract int mul();
	abstract int div();
	abstract int rem();
	
	public void display(String cal, int answer){
		System.out.println("The " + cal + " is " + answer);
	}
}

class B_0419 extends A_0419{
	//overriding
	int add(){
		int c = a + b;
		return c;
	}
	int sub(){
		int c = a - b;
		return c;
	}
	int mul(){
		int c = a * b;
		return c;
	}
	int div(){
		int c = a / b;
		return c;
	}
	int rem(){
		int c = a % b;
		return c;
	}
	
	
}

public class p0419_01_abstract {

	public static void main(String[] args) {
		B_0419 obj = new B_0419();
		
		obj.display("addition", obj.add());
		obj.display("substraction", obj.sub());
		obj.display("multiplication", obj.mul());
		obj.display("division", obj.div());
		obj.display("reminder", obj.rem());

	}

}
