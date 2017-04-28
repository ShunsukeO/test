package misao;

interface misAo{
	void add();
	void sub();
}

class A_0420_01 implements misAo{
	public void add(){
		System.out.println("add");
	}
	public void sub(){
		System.out.println("sub");
	}
}

public class p0420_01 {

	public static void main(String[] args) {
		A_0420_01 obj = new A_0420_01();
		obj.add();
	}

}
