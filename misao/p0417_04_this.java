package misao;

class A_0417_04{
	int a = 6;
	int b = 8;
	
	A_0417_04(int a, int b){
		System.out.println(a);//local��a�̒l���Ƃ��Ă���
		System.out.println(this.a);//local�����邪global��a���ق����Ƃ�this
	}
}
public class p0417_04_this {

	public static void main(String[] args) {
		A_0417_04 obj = new A_0417_04(10, 20);

	}

}
