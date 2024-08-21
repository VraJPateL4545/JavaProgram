package Java_Practice_Programs;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner r=new Scanner(System.in);
		int a=0,b=1,c,n;
		System.out.print("enter your number: ");
		n = r.nextInt(); 
		
		for (int i =1;i<=n;i++) {
			System.out.print(" " +a );
			c=a+b;
			a=b;
			b=c;
			    

		}

	}

}
