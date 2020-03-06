import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		String password="123456789";
		System.out.print("Lütfen Þifrenizi giriniz..: ");
		Scanner girdi = new Scanner(System.in);
		String sifre = girdi.nextLine();
		if (password.equals(sifre)) {
			System.out.println("Girilen þifre '"+sifre+"' doðru!");
		}
		else {
			System.out.println("Girdiðiniz Þifre '"+sifre+"' hatalýdýr!!!");
		}
		
		

	}

}
