package Workout;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner a = new Scanner(System.in);
		System.out.println("Enter a Num");
		int n = a.nextInt();
		
		int count=0;

		
		for(int i=2;i<=n/2;i++)
		{
			if(n%i==0)
			{
				count++;
			}
		}
		if(count==0 && n !=1)
		{
			System.out.println("Prime num");

		}else
		{
			System.out.println("Not a Prime num");

		}
	}

}
