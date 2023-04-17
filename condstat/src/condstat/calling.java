package condstat;

public class calling {
	int k;
	void abc()
	{
		for(int i=1;i<=k;i++)
		{
			for(int j=k-1;j>i;j--)
			{
				System.out.print(i);
			}
			System.out.println();
		}
	}
	
	void cde()
	{
		for(int i=0;i<k;i++)
		{
			for(int j=0;j<i;j++)
			{
				System.out.print(i);
			}
			System.out.println();
		}
	}

	
	
	void triangle()
	{
		for (int i = 0; i <k; i++) {
		  
		      for (int j = 0; j < k - i - 1; j++) {
		        System.out.print(" ");
		      }
		    
		      for (int m = 0; m < 2 * i + 1; m++) {
		        System.out.print("*");
		      }
		      System.out.println();
		    }
	  }
	
	
	void right()
	{
		for(int i=0;i<k;i++)
		{
			for(int j=0;j<i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i=1;i<k;i++)
		{
			for(int j=k-1;j>i;j--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		calling a=new calling();
		a.k=5;
		a.abc();
		System.out.print("");
		a.cde();
		System.out.print("");
		a.triangle();
		System.out.print("");
		a.right();
		

	}

}
