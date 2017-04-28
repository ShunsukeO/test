package misao;

import java.util.Scanner;

public class p0405_03_day_switch {

	public static void main(String[] args) {
        Scanner shun = new Scanner(System.in);
		
		System.out.println("Enter a number (1~7).");
		int a = shun.nextInt();
		
		switch(a){
		case 1: System.out.println("Monday Tuesday Wednesday Thursday Friday Saturday Sunday"); break;
		case 2: System.out.println("Tuesday Wednesday Thursday Friday Saturday Sunday"); break;
		case 3: System.out.println("Wednesday Thursday Friday Saturday Sunday"); break;
		case 4: System.out.println("Thursday Friday Saturday Sunday"); break;
		case 5: System.out.println("Friday Saturday Sunday"); break;
		case 6: System.out.println("Saturday Sunday"); break;
		case 7: System.out.println("Sunday"); break;
		default: System.out.println("Enter from 1 to 7.");
		}

	}

}
