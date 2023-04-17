package condstat;
import java.util.*;

public class salary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		float sa=sc.nextFloat();
		double DA=0.2*sa;
		double HRA=0.4*sa;
		double sal=sa+DA+HRA;
		System.out.println(sal);

	}

}
