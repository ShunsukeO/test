package misao;

class A_0417_02{
	String name;
	int age;
	
	A_0417_02(String name, int age){
		this.name = name;
		this.age = age;
		System.out.println("My name is " + name + ".");
		System.out.println("I'm " + age + ".");
	}
}

public class p0417_02 {

	public static void main(String[] args) {
		A_0417_02 obj = new A_0417_02("Shun", 24);

	}

}
