package collections;
import java.util.*;

public class linkedlists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> s1=new LinkedList<String>();
		s1.add("abc");
		s1.add("def");
		s1.add("56");
		for(String ch:s1)
		{
			System.out.print(ch+" ");
		}
		s1.addFirst("manoj");
		System.out.println();
		for(String ch:s1)
		{
			System.out.print(ch+" ");
		}
		

	}

}
