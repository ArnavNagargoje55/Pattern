package com.pattern;

import java.util.Scanner;

public class SumOfDigits {
	
	void add() {
		
int n=111,arm=0,rem;


System.out.println("Enter any Number:- ");
Scanner sc=new Scanner(System.in);
n=sc.nextInt();

while(n>0)
{
	rem=n%10;
	arm=rem+arm;
	n=n/10;	
	
}

	System.out.println("Sum of digits:-" +arm);

	}

	public static void main(String[] args) {

		SumOfDigits s=new SumOfDigits ();
		s.add();
		s.add();
		s.add();
		s.add();
	}

}
