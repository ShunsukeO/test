package misao;

class A_0417_04{
	int a = 6;
	int b = 8;
	
	A_0417_04(int a, int b){
		System.out.println(a);//local‚Ìa‚Ì’l‚ð‚Æ‚Á‚Ä‚­‚é
		System.out.println(this.a);//local‚ª‚ ‚é‚ªglobal‚Ìa‚ª‚Ù‚µ‚¢‚Æ‚«this
	}
}
public class p0417_04_this {

	public static void main(String[] args) {
		A_0417_04 obj = new A_0417_04(10, 20);

	}

}
