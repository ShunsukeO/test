package misao;
 
import java.util.Scanner;
 
public class p0405_01_day {

	public static void main(String[] args) {
		Scanner shun = new Scanner(System.in);
		
		System.out.println("Enter a number (1~7).");
		int a = shun.nextInt();
		
		switch(a){
		case 1: System.out.println("Monday"); 
		case 2: System.out.println("Tuesday");
		case 3: System.out.println("Wednesday");
		case 4: System.out.println("Thursday"); 
		case 5: System.out.println("Friday"); 
		case 6: System.out.println("Saturday"); 
		case 7: System.out.println("Sunday"); break;
		default: System.out.println("Enter from 1 to 7.");
		}
	}

}
