package assignment2;

public class Pizza {
	int vegcost=400;
	int nonvegcost=500;
	boolean choice;
	int finalprice;
	public Pizza(boolean choice) {
		super();
		this.choice = choice;
		if(choice)
		{
			this.finalprice=400;
		}
		else
			this.finalprice=500;
	}
	
	public int extracheese()
	{
		this.finalprice+=100;
		return this.finalprice;
	}
	public int extratoping()
	{
		this.finalprice+=100;
		return this.finalprice;
	}
	public int takeaway()
	{
		this.finalprice+=20;
		return this.finalprice;
	}
	public void display()
	{
		System.out.println("final price of pizza - "+this.finalprice);
	}
	
	

}
