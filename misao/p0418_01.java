package misao;

import java.util.Scanner;

class A_0418_01{
	int n;
	A_0418_01(){
		Scanner shun = new Scanner(System.in);
		System.out.println("Enter a number (1~7)");
		n = shun.nextInt();
	}
}

class B_0418_01 extends A_0418_01{
	B_0418_01(){
		switch(n){
		case 1: System.out.println("Monday is 1st day of a week."); break;
		case 2: System.out.println("Tuesday is 2nd day of a week."); break;
		case 3: System.out.println("Wednesday is 3rd day of a week."); break;
		case 4: System.out.println("Thursday is 4th day of a week."); break;
		case 5: System.out.println("Friday is 5th day of a week."); break;
		case 6: System.out.println("Saturday is 6th day of a week."); break;
		case 7: System.out.println("Sunday is 7th day of a week."); break;
		}
	}
}

class C_0418_01 extends B_0418_01{
	C_0418_01(){
		switch(n){
		case 1: System.out.println("January is 1st month of a year."); break;
		case 2: System.out.println("February is 2nd month of a year."); break;
		case 3: System.out.println("March is 3rd month of a year."); break;
		case 4: System.out.println("April is 4th month of a year."); break;
		case 5: System.out.println("May is 5th month of a year."); break;
		case 6: System.out.println("June is 6th month of a year."); break;
		case 7: System.out.println("July is 7th month of a year."); break; 
		}
	}
}

public class p0418_01 {

	public static void main(String[] args) {
		C_0418_01 obj = new C_0418_01();

	}

}
