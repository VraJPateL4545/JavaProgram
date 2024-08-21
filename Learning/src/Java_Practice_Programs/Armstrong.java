package Java_Practice_Programs;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n ,arm=0,rem,c;
		Scanner sc= new Scanner(System.in);
		n= sc.nextInt();
		c=n;
		while(n>0) {
			rem = n%10;
			arm=(rem*rem*rem)+arm;
			n=n/10;
		}
		if(c==arm) {
			System.out.print(arm + "is an Armstrong number");}
		else {
			System.out.print(arm + "is not a Armstrong number");
		}

	}

}
