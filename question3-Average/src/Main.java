import java.util.Random;
public class Main {

	public static void main(String[] args) {
		int[] values=new int[100];
		Random random=new Random();

		for (int i = 0; i < values.length; i++) {
			values[i]=random.nextInt(100);
			
		}
		System.out.println("Sayýlarýn Ortalamasý : " + avarage(values));
	}
	public static float avarage(int [] values) { 
		
			float avarage=0;
			for (int i = 0; i < values.length; i++) {
				avarage+=values[i];
			}
			return (avarage/values.length);
		
	}

}
