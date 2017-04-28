package misao;

import java.util.Scanner;

public class p0411_06_function_cal {

	public int add(int a, int b){
		int c = a + b;
		return c;
	}
	
	public int sub(int a, int b){
		int c = a - b;
		return c;
	}
	
	public int mul(int a, int b){
		int c = a * b;
		return c;
	}
	
	public int div(int a, int b){
		int c = a / b;
		return c;
	}
	
	public int rem(int a, int b){
		int c = a % b;
		return c;
	}
	
	public static void main(String[] args) {
		Scanner shun = new Scanner(System.in);
		p0411_06_function_cal misao = new p0411_06_function_cal();
		
		System.out.println("Enter a 1st number.");
		int a = shun.nextInt();
		System.out.println("Enter a 2nd number.");
		int b = shun.nextInt();
		
		int addition = misao.add(a, b);
		System.out.println(addition);
		
		int substraction = misao.sub(addition, 2);
		System.out.println(substraction);
		
		int multiplication = misao.mul(substraction, 6);
		System.out.println(multiplication);
		
		int division = misao.div(multiplication, 2);
		System.out.println(division);
		
		int reminder = misao.rem(division, 2);
		System.out.println(reminder);

	}

}
