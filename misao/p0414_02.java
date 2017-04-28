package misao;

class A_041402{
	int a = 1;
	int b = 3;

}

class B_041402 extends A_041402{
	public void add(){
	
		int c = a + b;
		System.out.println(c);
	}
	public void sub(){
	
		int c = a - b;
		System.out.println(c);
	}
}

public class p0414_02 {

	public static void main(String[] args) {
		B_041402 obj = new B_041402();
		obj.add();
		obj.sub();
	}

}
