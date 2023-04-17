package Sorting;

import java.util.*;

public class test {
	public static void main(String[] args)
	{
		List<sortingSalary> list=new ArrayList<>();
		list.add(new sortingSalary(1,"manoj",50000));
		list.add(new sortingSalary(2,"kumar",60000));
		list.add(new sortingSalary(1,"tharun",70000));
		
		Collections.sort(list,new Mysal());
        System.out.println(list);
	}
}

class Mysal implements Comparator<sortingSalary>{
    @Override
    public int compare(sortingSalary s1,sortingSalary s2) {
        return (int)(s2.getSalary()-s1.getSalary());    }
    
        }
        
 
         

		
		
