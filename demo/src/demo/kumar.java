package demo;

public class kumar {
	String name;
	String address;
	int id=25;
	public void walk()
	{
		System.out.println("walking...");
	}
	public void dance()
	{
		System.out.println("dancing..."+id);
	}

 public static void main(String[] args)
 {
	 kumar k=new kumar();
	 k.name="manoj";
	 k.address="bangalore";
	 k.id=25;
	 k.dance();
 }
}
