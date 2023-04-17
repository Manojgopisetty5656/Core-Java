package condstat;

import java.util.Scanner;

class cal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		char ch=sc.next().charAt(0);
		int a=sc.nextInt();
		int b=sc.nextInt();
		switch(ch)
		{
		case '+':
			int k=sc.nextInt();
			System.out.println(k);
			System.out.println("add"+" "+(a+b));
			break;
		case '-':	
			System.out.println("sub"+" "+(a-b));
			break;
		case '*':	
			System.out.println("mul"+" "+(a*b));
			break;
		default:
			System.out.println("wrong");
			break;
			
			
			
			
		}
			

	}

}
