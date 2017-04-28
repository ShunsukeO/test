package misao;

//‘‚Ü‚Æ‚ß
import java.util.Scanner;

class Retry {
	public int retry() {
		Scanner shun = new Scanner(System.in);
		String n;
		int retry = 0;
		do {
			System.out.println("Again? (yes or no)");
			n = shun.next();
		} while (!n.equals("yes") && !n.equals("no"));
		if (n.equals("yes")) {
			retry = 1;
		} else if (n.equals("no")) {
			retry = 2;
		}
		return retry;
	}
}

class appA {
	Scanner shun = new Scanner(System.in);
	Retry rty = new Retry();

	public void check() {
		int retry = 0;
		main: do {
			System.out.println("+ NUMBER CHECK -----------+");
			System.out.println("|1. EVEN or ODD           |");
			System.out.println("|2. Driver Licence Checker|");
			System.out.println("|                         |");
			System.out.println("|0. Home                  |");
			System.out.println("+-------------------------+");
			int a = 0;
			while (true) {
				System.out.println("Enter a number (0~2)");
				a = shun.nextInt();
				if (a == 1 || a == 2 || a == 0) {
					break;
				}
				System.out.println("Enter 0, 1 or 2.");
			}

			switch (a) {
			case 1:
				evenodd();
				break;
			case 2:
				validDL();
				break;
			case 0:
				break main;
			}

			System.out.println("\n1...Back || 0...Home");
			retry = shun.nextInt();
		} while (retry == 1);
		System.out.println();
	}

	public void evenodd() {
		System.out.println("Checking your number is even or odd.");
		int retry = 0;
		do {
			System.out.println("Enter a number.");
			int a = shun.nextInt();

			if (a % 2 == 0) {
				System.out.println("It's EVEN.");
			} else {
				System.out.println("It's ODD.");
			}

			System.out.println();
			retry = rty.retry();
		} while (retry == 1);
	}

	public void validDL() {
		System.out.println("Checking if you can get drivers licence.");
		int retry = 0;
		do {
			int a = 0;
			while (true) {
				System.out.println("Enter your age.");
				a = shun.nextInt();
				if (a >= 0) {
					break;
				}
			}

			if (a >= 20) {
				System.out.println("Congratulations! You can drive!");
			} else {
				System.out.println("I'm sorry, you cannot get it.");
			}

			System.out.println();
			retry = rty.retry();
		} while (retry == 1);
	}
}

class appB {
	Scanner shun = new Scanner(System.in);
	Retry rty = new Retry();

	public void cal() {
		int retry = 0;
		do {
			System.out.println("-- Calculator --");
			System.out.println("Enter a 1st number.");
			int a = shun.nextInt();
			System.out.println("Enter a 2nd number.");
			int b = shun.nextInt();
			System.out.println("Which answer do you want?");
			System.out.println("add? sub? mul? div? rem?");
			String n = shun.next();

			switch (n) {
			case "add":
				System.out.println("The addition is " + add(a, b) + ".");
				break;
			case "sub":
				System.out.println("The substraction is " + sub(a, b) + ".");
				break;
			case "mul":
				System.out.println("The multiplication is " + mul(a, b) + ".");
				break;
			case "div":
				System.out.println("The division is " + div(a, b) + ".");
				break;
			case "rem":
				System.out.println("The reminder is " + rem(a, b) + ".");
				break;
			}

			System.out.println();
			retry = rty.retry();
		} while (retry == 1);
	}

	public int add(int a, int b) {
		int c = a + b;
		return c;
	}

	public int sub(int a, int b) {
		int c = a - b;
		return c;
	}

	public int mul(int a, int b) {
		int c = a * b;
		return c;
	}

	public int div(int a, int b) {
		int c = a / b;
		return c;
	}

	public int rem(int a, int b) {
		int c = a % b;
		return c;
	}
}

class appC {
	Scanner shun = new Scanner(System.in);
	Retry rty = new Retry();

	public void pattern() {
		int retry = 0;
		do {
			System.out.println("-- Pattern drawer --");
			String type;
			do {
				System.out.println("What figure type do you want?");
				System.out.println(" T (Triangle)    D (Diamond)     DC (Diamond case)  C (Corn)");
				System.out.println("OC (Open corn)  RC (Right corn)  LC (Left corn)    ");
				System.out.println("\n0: Home\n--------------------");
				type = shun.next();
			} while (!type.equals("T") && !type.equals("C") && !type.equals("OC") && !type.equals("RC")
					&& !type.equals("LC") && !type.equals("D") && !type.equals("DC") && !type.equals("0"));

			if (type.equals("0")) {
				break;
			}

			int step = 0;
			while (true) {
				System.out.println("How many steps?");
				step = shun.nextInt();
				if (step >= 0) {
					break;
				}
			}

			int n = 0;
			while (true) {
				System.out.println("How many figures?");
				n = shun.nextInt();
				if (n >= 0) {
					break;
				}
			}

			switch (type) {
			case "T":
				triangle(step, n);
				break;
			case "C":
				corn(step, n);
				break;
			case "OC":
				Ocorn(step, n);
				break;
			case "RC":
				Rcorn(step, n);
				break;
			case "LC":
				Lcorn(step, n);
				break;
			case "D":
				diamond(step, n);
				break;
			case "DC":
				diamondC(step, n);
				break;
			}

			System.out.println();
			retry = rty.retry();
		} while (retry == 1);
	}

	public void triangle(int step, int n) {
		for (int i = 1; i <= n; i++) {

			for (int j = 1; j <= step; j++) {

				for (int k = 1; k <= j; k++) {
					System.out.print("x");
				}
				System.out.println();
			}
			System.out.println();
		}
	}

	public void corn(int step, int n) {
		for (int i = 1; i <= n; i++) {

			for (int j = 1; j <= step; j++) {

				for (int k = step; k > j; k--) {
					System.out.print(" ");
				}
				for (int k = 1; k <= j; k++) {
					System.out.print("x");
				}
				for (int k = 2; k <= j; k++) {
					System.out.print("x");
				}
				System.out.println();
			}
			System.out.println();
		}
	}

	public void Ocorn(int step, int n) {
		for (int i = 1; i <= n; i++) {

			for (int j = 1; j <= step; j++) {

				for (int k = 2; k <= j; k++) {
					System.out.print(" ");
				}
				for (int k = j; k <= step; k++) {
					System.out.print("x");
				}
				for (int k = j + 1; k <= step; k++) {
					System.out.print("x");
				}
				System.out.println();
			}
			System.out.println();
		}
	}

	public void Rcorn(int step, int n) {
		for (int i = 1; i <= n; i++) {

			for (int j = 1; j <= 2 * step - 1; j++) {

				if (j <= step) {
					for (int k = 1; k <= j; k++) {
						System.out.print("x");
					}
				} else {
					for (int k = j; k < 2 * step; k++) {
						System.out.print("x");
					}
				}
				System.out.println();
			}
			System.out.println();
		}
	}

	public void Lcorn(int step, int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= 2 * step - 1; j++) {
				if (j <= step) {
					for (int k = j; k < step; k++) {
						System.out.print(" ");
					}
					for (int k = 1; k <= j; k++) {
						System.out.print("x");
					}
				} else {
					for (int k = 1; k <= j - step; k++) {
						System.out.print(" ");
					}
					for (int k = j; k < 2 * step; k++) {
						System.out.print("x");
					}
				}
				System.out.println();
			}
			System.out.println();
		}
	}

	public void diamond(int step, int n) {
		for (int i = 1; i <= n; i++) {

			for (int j = 1; j <= 2 * step - 1; j++) {

				if (j <= step) {
					for (int k = j; k < step; k++) {
						System.out.print(" ");
					}
					for (int k = 1; k <= j; k++) {
						System.out.print("x");
					}
					for (int k = 2; k <= j; k++) {
						System.out.print("x");
					}
				} else {
					for (int k = 1; k <= j - step; k++) {
						System.out.print(" ");
					}
					for (int k = j; k < 2 * step; k++) {
						System.out.print("x");
					}
					for (int k = j + 1; k < 2 * step; k++) {
						System.out.print("x");
					}
				}
				System.out.println();
			}
			System.out.println();
		}
	}

	public void diamondC(int step, int n) {
		for (int i = 1; i <= n; i++) {

			for (int j = 1; j <= 2 * step - 1; j++) {
				System.out.print("x");
			}
			System.out.println();
			for (int j = 2; j < 2 * step - 1; j++) {

				if (j <= step) {
					for (int k = j; k <= step; k++) {
						System.out.print("x");
					}
					for (int k = 2; k < 2 * j - 1; k++) {
						System.out.print(" ");
					}
					for (int k = j; k <= step; k++) {
						System.out.print("x");
					}
				} else {
					for (int k = 1; k <= j - step + 1; k++) {
						System.out.print("x");
					}
					for (int k = 2 * (j - step) + 3; k < 2 * step; k++) {
						System.out.print(" ");
					}
					for (int k = 1; k <= j - step + 1; k++) {
						System.out.print("x");
					}
				}
				System.out.println();
			}
			for (int j = 1; j <= 2 * step - 1; j++) {
				System.out.print("x");
			}
			System.out.println();
			System.out.println();
		}
	}
}

class appD {
	Scanner shun = new Scanner(System.in);
	Retry rty = new Retry();

	public void switches() {
		int retry = 0;
		main: do {
			System.out.println("+ SWITCH -+");
			System.out.println("|1. DAY   |");
			System.out.println("|2. MONTH |");
			System.out.println("|         |");
			System.out.println("|0. Home  |");
			System.out.println("+---------+");
			int a = 0;
			while (true) {
				a = shun.nextInt();
				if (a == 1 || a == 2 || a == 0) {
					break;
				}
				System.out.println("Enter 0, 1 or 2.");
			}

			switch (a) {
			case 1:
				day();
				break;
			case 2:
				month();
				break;
			case 0:
				break main;
			}
			System.out.println("1...Back || 0...Home");
			retry = shun.nextInt();
		} while (retry == 1);
	}

	public void day() {
		int a = 0;
		int retry = 0;
		do {
			while (true) {
				System.out.println("-- DAY SWITCH --");
				System.out.println("Enter a number (1~7).");
				a = shun.nextInt();
				if (a >= 1 && a <= 7) {
					break;
				}
			}

			switch (a) {
			case 1:
				System.out.println("Sunday");
				break;
			case 2:
				System.out.println("Monday");
				break;
			case 3:
				System.out.println("Tuesday");
				break;
			case 4:
				System.out.println("Wednesday");
				break;
			case 5:
				System.out.println("Thursday");
				break;
			case 6:
				System.out.println("Friday");
				break;
			case 7:
				System.out.println("Saturday");
				break;
			}

			System.out.println();
			retry = rty.retry();
		} while (retry == 1);
	}

	public void month() {
		int a = 0;
		int retry = 0;
		do {
			while (true) {
				System.out.println("-- MONTH SWITCH --");
				System.out.println("Enter a number (1~12).");
				a = shun.nextInt();
				if (a >= 1 && a <= 12) {
					break;
				}
			}

			switch (a) {
			case 1:
				System.out.println("January");
				break;
			case 2:
				System.out.println("February");
				break;
			case 3:
				System.out.println("March");
				break;
			case 4:
				System.out.println("April");
				break;
			case 5:
				System.out.println("May");
				break;
			case 6:
				System.out.println("June");
				break;
			case 7:
				System.out.println("July");
				break;
			case 8:
				System.out.println("August");
				break;
			case 9:
				System.out.println("September");
				break;
			case 10:
				System.out.println("October");
				break;
			case 11:
				System.out.println("November");
				break;
			case 12:
				System.out.println("December");
				break;
			}

			System.out.println();
			retry = rty.retry();
		} while (retry == 1);
	}
}

public class p0412_02_app {

	public static void main(String[] args) {
		Scanner shun = new Scanner(System.in);
		appA misaoa = new appA();
		appB misaob = new appB();
		appC misaoc = new appC();
		appD misaod = new appD();

		int retry = 1;
		do {
			System.out.println("Welcome to Shun's App!\nChoose an application");
			System.out.println("-----------------");
			System.out.println("1. NUMBER CHECK");
			System.out.println("2. Calculator");
			System.out.println("3. Pattern drawer");
			System.out.println("4. SWITCH");
			System.out.println("\n0. Exit");
			System.out.println("-----------------");
			System.out.println("Enter a number (0~4)");
			int a = shun.nextInt();

			switch (a) {
			case 1:
				misaoa.check();
				break;
			case 2:
				misaob.cal();
				break;
			case 3:
				misaoc.pattern();
				break;
			case 4:
				misaod.switches();
				break;
			case 0:
				retry = 2;
			}

		} while (retry == 1);

		System.out.println("\nBYE-BYE (^o^)/~~");
	}
}
