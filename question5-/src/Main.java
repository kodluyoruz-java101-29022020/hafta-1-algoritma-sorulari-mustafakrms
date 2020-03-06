import java.util.Random;

public class Main {

	public static void main(String[] args) {
		int[] values=new int[100];
		Random random=new Random();
		for (int i = 0; i < values.length; i++) {
			 values[i]=random.nextInt(100);
			 
			 if ((values[i]%2)==0)
				 System.out.println((i+1)+".Sayý Çift : "+values[i]);
			 else
				 System.out.println((i+1)+".Sayý Tek : "+values[i]);
			 
			 
				
			
		}

	}

}
