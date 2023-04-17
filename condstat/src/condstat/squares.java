package condstat;

public class squares {
	
	public static void main(String[] args)
	{
	int k=100;
	for(int i=1;i<=k;i++)
	{
		int m=i*i;
		if(m>=k)
		{
			break;
		}
		System.out.print((i*i)+" ");
	 }

}
}