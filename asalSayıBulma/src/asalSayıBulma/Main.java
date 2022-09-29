package asalSayıBulma;

public class Main {

	public static void main(String[] args) {
		// ASAL SAYI BULMA
		int sayi1 = 17  ;
		int remainder = sayi1 % 2  ;
		boolean isPrime = true ;
		if (sayi1<1) {
			System.out.println("geçersiz sayı");
			return;
			
		}
		if (sayi1 == 1 ) {
			System.out.println("Sayı asal değildir  ! ");
			return;
			
		}
		
		for (int i = 2 ; i<sayi1; i++) {
			if (sayi1 % i == 0) {
				isPrime = false ;
				
			}
			
		}if (isPrime == true ) {
			System.out.println("sayı asaldır ! ");
			
			
		}
		
		else {
			System.out.println("sayı asal değildir ! ");
		}
		
		
		

	}

}
