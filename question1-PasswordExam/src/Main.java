import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		String password="123456789";
		System.out.print("L�tfen �ifrenizi giriniz..: ");
		Scanner girdi = new Scanner(System.in);
		String sifre = girdi.nextLine();
		if (password.equals(sifre)) {
			System.out.println("Girilen �ifre '"+sifre+"' do�ru!");
		}
		else {
			System.out.println("Girdi�iniz �ifre '"+sifre+"' hatal�d�r!!!");
		}
		
		

	}

}
