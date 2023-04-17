package condstat;
import java.util.*;

public class app {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		Random rc= new Random();
		int ran=rc.nextInt(1,1005);
		int count=0,i=1,a=0;
		while(i<=5)
		{
			count+=1;
			int guess=sc.nextInt();
			if(ran==guess)
			{
				a=1;
				System.out.println("great, num is "+ran+" count is "+count);
				break;
			}
			i++;
		}
		if(a==0)
		{
			System.out.println("you are not guessed in 5 choices");
		}
	}

}
