package condstat;
import java.util.*;


public class patterns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int k=sc.nextInt();
		//int m=sc.nextInt();
		for(int i=0;i<k;i++)
		{
			for(int j=k-1;j>i;j--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		

	}

}
