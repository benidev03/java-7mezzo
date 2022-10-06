import java.util.Random;

public class GiocoCarte {

	public static void main(String[] args) {
		
		int min = 1; int max = 40;
		int mazzoCarte[] = new int[max];
		Random r = new Random();
		
		
		System.out.println("Genera mazzo carte......");
		for(int i = 0; i < mazzoCarte.length; i++) {
			boolean presente = false;
			System.out.println(i);
			
			while(true) {
				presente = false;
				int cartaGenerata = r.nextInt(max) + 1;
//				System.out.println("\t generata: " + cartaGenerata);
				for(int j = 0; j < mazzoCarte.length; j++) {
					
					if(mazzoCarte[j] == cartaGenerata) {
						presente = true;
					}
				}
//				System.out.print(i + " La carta è ");
				if(!presente) {
					mazzoCarte[i] = cartaGenerata;
//					System.out.println(" non presente, inserita nel mazzo");
					break;
				} else {
//					System.out.println(" già presente, rigenero carta");
				}
				
			}
			
			
			
			
		}
		
		for(int i = 0; i < mazzoCarte.length; i++) {
			System.out.print(mazzoCarte[i]+ " ");
			
			
		}
	}

}
