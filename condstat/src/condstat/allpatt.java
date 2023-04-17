package condstat;

public class allpatt {
	int s;
	void Tra()
	{
		for (int i = 0; i < s; i++) {
		    
		      for (int j = 0; j < s - i - 1; j++) {
		        System.out.print(" ");
		      
		      for (int k = 0; k < 2 * i + 1; k++) {
		        System.out.print("*");
		      }
		      System.out.println();
		      }
		}
	}
	
	

}
