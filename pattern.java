package com.pattern;

public class pattern {
	
	

	public static void main(String[] args) {
		
		//Rows=6
		//Columns=6
		
      int rowcount=6;

		//Outer loop for Rows
		for (int i=1;i<rowcount;i++)
		{   
			//Inner loop for Columns
			for(int j=1;j<=i;j++)
					
			{
				System.out.print("*");
			}
			System.out.println();		
		}
				
			
	}

}
