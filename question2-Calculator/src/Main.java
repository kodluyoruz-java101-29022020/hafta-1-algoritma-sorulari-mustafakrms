import java.util.Scanner;

import com.sun.xml.internal.ws.api.ha.StickyFeature;
public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("L�tfen ��lem Yapmak �stedi�iniz 2 Adet Say� Giriniz... :");
		System.out.print("1. Say�... : ");
		int number1=input.nextInt();
		System.out.print("2. Say�... : ");
		int number2=input.nextInt();
		System.out.println("L�tfen Yapmak �stedi�iniz i�lemi Se�in...");
		System.out.println("1- Toplama i�in");
		System.out.println("2- ��karma i�in");
		System.out.println("3- �arpma i�in");
		System.out.println("4- B�lme i�in ");
		System.out.print("L�tfen Se�iniz...: ");
		int secim = input.nextInt();
		switch (secim) {
		case 1:
			System.out.println("Toplama ��leminin Sonucu : "+(number1+number2));
			break;
		case 2:
			System.out.println("��karma ��leminin Sonucu : "+(number1-number2));
			break;
		case 3:
			System.out.println("�arpma ��leminin Sonucu : "+(number1*number2));
			break;
		case 4:
			if (number2==0) {
				System.out.println("Herhangi Bir Say�y� '0' a B�lemezsin..");
			}
			else {
				System.out.println("B�lme ��leminin Sonucu"+((double)number1/(double)number2));
			}
			break;
		default:
			System.out.println("Yanl�� Se�im Yapt�n�z...");
			break;
		}
				
		
	}

}
