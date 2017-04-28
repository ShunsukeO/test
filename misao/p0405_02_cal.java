package misao;

import java.util.Scanner;

public class p0405_02_cal {

	public static void main(String[] args) {
		Scanner shun = new Scanner(System.in);
		
		System.out.println("Enter a 1st number.");
		int a = shun.nextInt();
		
		System.out.println("Enter a 2nd number.");
		int b = shun.nextInt();
		
		System.out.println("Which answer do u want?");
		System.out.println("Add? Sub? Mul? Div? Or Rem?");
		String c = shun.next();
		
		switch(c){
		case "Add": System.out.println("The addition is " + (a + b) + "."); break;
		case "Sub": System.out.println("The Substraction is " + (a - b) + "."); break;
		case "Mul": System.out.println("The Multiplication is " + (a * b) + "."); break;
		case "Div": System.out.println("The Division is " + (a / b) + "."); break;
		case "Rem": System.out.println("The Reminder is " + (a % b) + "."); break;
		default: System.out.println("Enter Add, Sub, Mul, Div or Rem.");
		}
	}

}
