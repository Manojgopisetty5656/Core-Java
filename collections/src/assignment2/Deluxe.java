package assignment2;

public class Deluxe extends Pizza {

	public Deluxe(boolean choice) {
		super(choice);
		// TODO Auto-generated constructor stub
		if(choice)
			this.finalprice=500;
		else
			this.finalprice=600;

	}
	public void display()
	{
		System.out.println("final price of deluxe - "+this.finalprice);
	}

}
