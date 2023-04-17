package collections;
import java.util.*;

public class Arraylist {
	public static void main(String[] args)
	{
      ArrayList<Integer> list=new ArrayList<Integer>();
      list.add(1);
      list.add(2);
      list.add(5);
      list.add(21);
      list.add(4);
      //Collections.sort(list);
      //list.set(0, 3);
      //list.remove(2);
      //System.out.println(list.isEmpty());
      //System.out.println(list.size());
      ArrayList<Integer> list2=new ArrayList<Integer>();
      /*list2.add(101);
      list2.add(201);
      list2.addAll(list);*/
      ArrayList<Integer> Clone = (ArrayList<Integer>)list.clone();
      //Clone.clear();
     // System.out.println(Clone.get(2));
      //System.out.println(Clone.contains(2));
      //System.out.println(Clone.indexOf(21));
      //removeAll
    /*  Iterator itr=list.iterator();
      while(itr.hasNext())
      {
    	  System.out.println(itr.next());
      }*/
      
      
     /* for(int i:Clone)
      {
    	  System.out.println(i);
      }
      */
      for(int i=0;i<list.size();i++)
      {
    	  System.out.println(list.get(i));
      }
	}

}
