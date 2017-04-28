package misao;

import java.util.Scanner;

class A_0418_02 {
	Scanner shun = new Scanner(System.in);
	int[] a = new int[7];
	String []b = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

	A_0418_02(int n) {
		switch (n) {
		case 1:
			System.out.println("Enter a 1st number(1~7).");
			a[0] = shun.nextInt();
			break;
		case 2:
			System.out.println("Enter a 1st number(1~7).");
			a[0] = shun.nextInt();
			System.out.println("Enter a 2nd number(1~7).");
			a[1] = shun.nextInt();
			break;
		case 3:
			System.out.println("Enter a 1st number(1~7).");
			a[0] = shun.nextInt();
			System.out.println("Enter a 2nd number(1~7).");
			a[1] = shun.nextInt();
			System.out.println("Enter a 3rd number(1~7).");
			a[2] = shun.nextInt();
			break;
		case 4:
			System.out.println("Enter a 1st number(1~7).");
			a[0] = shun.nextInt();
			System.out.println("Enter a 2nd number(1~7).");
			a[1] = shun.nextInt();
			System.out.println("Enter a 3rd number(1~7).");
			a[2] = shun.nextInt();
			System.out.println("Enter a 4th number(1~7).");
			a[3] = shun.nextInt();
			break;
		case 5:
			System.out.println("Enter a 1st number(1~7).");
			a[0] = shun.nextInt();
			System.out.println("Enter a 2nd number(1~7).");
			a[1] = shun.nextInt();
			System.out.println("Enter a 3rd number(1~7).");
			a[2] = shun.nextInt();
			System.out.println("Enter a 4th number(1~7).");
			a[3] = shun.nextInt();
			System.out.println("Enter a 5th number(1~7).");
			a[4] = shun.nextInt();
			break;
		case 6:
			System.out.println("Enter a 1st number(1~7).");
			a[0] = shun.nextInt();
			System.out.println("Enter a 2nd number(1~7).");
			a[1] = shun.nextInt();
			System.out.println("Enter a 3rd number(1~7).");
			a[2] = shun.nextInt();
			System.out.println("Enter a 4th number(1~7).");
			a[3] = shun.nextInt();
			System.out.println("Enter a 5th number(1~7).");
			a[4] = shun.nextInt();
			System.out.println("Enter a 6th number(1~7).");
			a[5] = shun.nextInt();
			break;
		case 7:
			System.out.println("Enter a 1st number(1~7).");
			a[0] = shun.nextInt();
			System.out.println("Enter a 2nd number(1~7).");
			a[1] = shun.nextInt();
			System.out.println("Enter a 3rd number(1~7).");
			a[2] = shun.nextInt();
			System.out.println("Enter a 4th number(1~7).");
			a[3] = shun.nextInt();
			System.out.println("Enter a 5th number(1~7).");
			a[4] = shun.nextInt();
			System.out.println("Enter a 6th number(1~7).");
			a[5] = shun.nextInt();
			System.out.println("Enter a 7th number(1~7).");
			a[6] = shun.nextInt();
			break;
		}
		
		for(int i = 0; i < a.length; i++){
			if(a[i] == 0){
				break;
			}
			System.out.print(b[a[i] - 1] + " ");
		}
	}

}

public class p0418_02 {

	public static void main(String[] args) {
		Scanner shun = new Scanner(System.in);
		
		System.out.println("Enter a input number(1~7)");
		int n = shun.nextInt();
		A_0418_02 obj = new A_0418_02(n);

	}

}
