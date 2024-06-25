package Workout;

import java.util.Scanner;

public class Weekin2_for {
	
	
	void week()
	{
		for(int i =1;i<=5;i++)
		{
			System.out.println("Week: "+i);

			
			for(int j=1;j<=7;j++)
			{
				System.out.println("Days: "+j);
			}
		}
	}
	
	void star()
	{
		
		String a = "*";
		
		for(int i=4;i>=0;i--)
		{
			
			for(int j=0;j<i;j++)
			{
				System.out.print(a);
							
			}
			System.out.println(a);

		}
	}
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Weekin2_for obj = new Weekin2_for();
		//obj.week();
		//obj.star();
	}
	

}
