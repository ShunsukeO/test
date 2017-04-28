package misao;

public class p0405_10 {

	public static void main(String[] args) {
		
		int b = 5;
		
		for(int i = 1; i <= 5; i++){
			
			for(int a = 1; a <= b; a++){
				if(i > 2){
					b = 6;
				}
				System.out.print(a);
			}
						
			System.out.println("");
		}

	}

}
