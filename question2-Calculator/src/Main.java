import java.util.Scanner;

import com.sun.xml.internal.ws.api.ha.StickyFeature;
public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Lütfen Ýþlem Yapmak Ýstediðiniz 2 Adet Sayý Giriniz... :");
		System.out.print("1. Sayý... : ");
		int number1=input.nextInt();
		System.out.print("2. Sayý... : ");
		int number2=input.nextInt();
		System.out.println("Lütfen Yapmak Ýstediðiniz iþlemi Seçin...");
		System.out.println("1- Toplama için");
		System.out.println("2- Çýkarma için");
		System.out.println("3- Çarpma için");
		System.out.println("4- Bölme için ");
		System.out.print("Lütfen Seçiniz...: ");
		int secim = input.nextInt();
		switch (secim) {
		case 1:
			System.out.println("Toplama Ýþleminin Sonucu : "+(number1+number2));
			break;
		case 2:
			System.out.println("Çýkarma Ýþleminin Sonucu : "+(number1-number2));
			break;
		case 3:
			System.out.println("Çarpma Ýþleminin Sonucu : "+(number1*number2));
			break;
		case 4:
			if (number2==0) {
				System.out.println("Herhangi Bir Sayýyý '0' a Bölemezsin..");
			}
			else {
				System.out.println("Bölme Ýþleminin Sonucu"+((double)number1/(double)number2));
			}
			break;
		default:
			System.out.println("Yanlýþ Seçim Yaptýnýz...");
			break;
		}
				
		
	}

}
