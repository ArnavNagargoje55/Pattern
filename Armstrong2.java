package com.pattern;

import java.util.Scanner;

public class Armstrong2 {

	static void add() {
		 //Is it ArmstrongNumber ??
			int n,arm=0,rem,c;
			System.out.println("Print any number:-");
			
			Scanner sc=new Scanner(System.in);
			 n=sc.nextInt();
			c=n;
			while(n>0) { //3 times revolve loop:-For n=153,15,5
				rem=n%10; //modulus
				arm=(rem*rem*rem)+arm;
				n=n/10; //Division
			}
			if(c==arm)
			{
				System.out.println("Armstrong number");
				add();
				}
			else {
				System.out.println("Not Armstrong number");
				add();
				
			}
	}
	
	public static void main(String[] args) {
		add();

	}

}
