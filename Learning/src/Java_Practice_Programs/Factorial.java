package Java_Practice_Programs;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int i ;
		int fact = 1;
		System.out.print("enter your number :");
		int number = sc.nextInt();
		for(i=1; i<=number; i++){
				fact = fact*i;
		}
		System.out.print("factorial of "+number+"is"+fact);
		}
		
		
	}


