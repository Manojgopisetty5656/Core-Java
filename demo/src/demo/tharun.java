package demo;

public class tharun {
 String name;
 int id;
 void details()
 {
	 System.out.println("name"+name);
	 System.out.println("id"+id);
 }
 void cgs(int sal)
 {
	 double hra= sal*0.4;
	 double dr= sal*0.2;
	 double res=(hra+dr);
	 System.out.println(name);
	 System.out.println(id);
	 System.out.println(hra);
	 System.out.println(dr);
	 System.out.println(res);
	 
 }
 
 public static void main(String[] args)
 {
	 tharun pt=new tharun();
	 pt.name="manoj";
	 pt.id=5;
	 //pt.details();
	 pt.cgs(50000);
	 
 }
 
}
