package demo;

public class construct {
	String a;
	int b;
	construct(String m, int n)
	{
		this.a=m;
		this.b=n;
		System.out.println(a+" "+b);
	}
	public static void main(String[] args)
	{
		construct c=new construct("man",5656);
		
	}

}
