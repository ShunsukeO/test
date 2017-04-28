package misao;
import java.lang.Math.*;
//No.1
//interface shun {
//	void add();
//}
//
//class A_0420_02 implements shun {
//	public void add() {
//		System.out.println("add");
//	}
//}

//No.2
//interface shun{
//	void add();
//}
//
//interface raj extends shun{
//	void sub();
//}
//
//class A_0420_02 implements raj{
//	public void add(){
//		System.out.println("add2");
//	}
//	public void sub(){
//		System.out.println("sub2");
//	}
//}

//No.3
//interface shun{
//	void add();
//}
//
//interface shohei{
//	void sub();
//}
//
//class A_0420_02 implements shun, shohei{
//	public void add(){
//		System.out.println("add3");
//	}
//	public void sub(){
//		System.out.println("sub3");
//	}
//}

//No.4
interface shun{
	void add();
}

interface shohei{
	void sub();
}

interface raj extends shun, shohei{
	void mul();
}

class takeru implements raj{
	public void add(){
		System.out.println("add4");
	}
	public void sub(){
		System.out.println("sub4");
	}
	public void mul(){
		System.out.println("mul4");
	}
}

class A_0420_02 extends takeru{
	public void div(){
		System.out.println("div4");
	}
}

public class p0420_02 {

	public static void main(String[] args) {
		A_0420_02 obj = new A_0420_02();
		obj.add();
		obj.sub();
		obj.mul();
		obj.div();
	}
}
