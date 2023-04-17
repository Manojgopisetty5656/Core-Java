package condstat;
import java.util.*;

public class reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int k=sc.nextInt();
		int lr=0,sum=0;
		while(k!=0)
		{
			int res=k%10;
			//System.out.print(res);
			lr=lr*10+res;
			k=k/10;
			sum+=res;
		}
		System.out.println(lr+" "+sum);

	}

}
