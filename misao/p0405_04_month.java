package misao;

import java.util.Scanner;

public class p0405_04_month {

	public static void main(String[] args) {
		Scanner shun = new Scanner(System.in);
		
		System.out.println("Enter 3 characters of month (ex. Jan, Feb).");
		String a = shun.next();
		
		String num = "0";
		
		switch(a){
		case "Jan": num = "1st"; break;
		case "Feb": num = "2nd"; break;
		case "Mar": num = "3rd"; break;
		case "Apr": num = "4th"; break;
		case "May": num = "5th"; break;
		case "Jun": num = "6th"; break;
		case "Jul": num = "7th"; break;
		case "Aug": num = "8th"; break;
		case "Sep": num = "9th"; break;
		case "Oct": num = "10th"; break;
		case "Nov": num = "11st"; break;
		case "Dec": num = "12nd"; break;
		default: System.out.println("Enter characters correctly.");
		}
		
		if(!num.equals("0")){
			System.out.println("It's " + num + " month of a year.");	
		}
		
	}

}
