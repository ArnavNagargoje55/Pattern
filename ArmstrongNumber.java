package com.pattern;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		
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
		if(c==arm) {
			System.out.println("Given no is Armstrong number");}
		else {
			System.out.println("Given no is not Armstrong");
			
		}
			
		
		
		
		
	}

}
