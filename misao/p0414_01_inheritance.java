package misao;

class Aaa{
	int shun = 400;
}

class Baa extends Aaa{
	public void b(){
		shun++;
	}
}

public class p0414_01_inheritance  {

	public static void main(String[] args) {
		Baa obj = new Baa();
		System.out.println(obj.shun);
	}

}
