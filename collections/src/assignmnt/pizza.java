package assignmnt;

public class pizza {
    boolean choice;
    int Cost=400;
    int flag=0;
    int ec,et=0;
    //int nonvezcost=500;

	public pizza(boolean choice) {
		super();
		this.choice = choice;
		if(choice)
			{
			System.out.println("cost of vez pizza: "+vez());
					
			}
		else
		{
			System.out.println("cost of Non-vez pizza: "+nonvez());
		}
	}
    public int vez()
    {
    	return this.Cost;
    }
    public int nonvez()
    {
    	return this.Cost+100;
    }
    
    public void extracheese()
    {
    	this.ec=1;
    	this.flag=100;
    	if(choice)
    	//return this.Cost+100;
    		System.out.println("vez pizza with extracheese-"+(this.Cost+100));
    	else
    	//return this.Cost+200;	
    		System.out.println("Nonvez pizza with extracheese-"+(this.Cost+200));
    }
    public void extratoping()
    {
    	this.et=1;
    	if(choice)
    	//return this.Cost+100;
    	System.out.println("vez pizza with extratoping-"+(this.Cost+100+flag));
    	else
    	//return this.Cost+200;
    	System.out.println("Nonvez pizza with extratoping-"+(this.Cost+200+flag));
    }
     
    public void takeaway()
    {
    	if(choice) {
    		if(this.ec==0 && this.et==0)
    		{System.out.println("vez pizza with takeaway-"+(this.Cost+20));}
    		else if(this.ec==1 && this.et==1)
    		{System.out.println("vez pizza with takeaway-"+(this.Cost+220));}
    		else
    			{System.out.println("vez pizza with takeaway-"+(this.Cost+120));}
 
    	}
    	else
    	{
    		if(this.ec==0 && this.et==0)
    		{System.out.println("Nonvez pizza with takeaway-"+(this.Cost+120));}
    		else if(this.ec==1 && this.et==1)
    		{System.out.println("Nonvez pizza with takeaway-"+(this.Cost+320));}
    		else
    			{System.out.println("Nonvez pizza with takeaway-"+(this.Cost+220));}
    		}
    }
	
}
