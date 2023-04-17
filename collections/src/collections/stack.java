package collections;
import java.util.*;

public class stack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> stk= new Stack<>();  
		boolean result = stk.empty();  
		System.out.println("Is the stack empty? " + result);  
		stk.push(78);  
		stk.push(113);  
		stk.push(90);  
		stk.push(120); 
		System.out.println(stk);
		stk.pop();
		System.out.println(stk);  
		result = stk.empty();  
		System.out.println("Is the stack empty? " + result);  
		}  
	}


