package misao;

class A_0417_04{
	int a = 6;
	int b = 8;
	
	A_0417_04(int a, int b){
		System.out.println(a);//localのaの値をとってくる
		System.out.println(this.a);//localがあるがglobalのaがほしいときthis
	}
}
public class p0417_04_this {

	public static void main(String[] args) {
		A_0417_04 obj = new A_0417_04(10, 20);

	}

}
