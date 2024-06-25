  package Workout;

public class Fibonacci {
	
	void F()
	{
		int a = 0;
		int b = 1;
		int temp = 0;
		
		
		
		System.out.println(a);
		System.out.println(b);
		
		for(int i =0;i<10;i++)
		{
			temp = a+b;
			
			a=b;
			b=temp;
			
			
			
			System.out.println(temp);
		}
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Fibonacci obj = new Fibonacci();
		obj.F();
	}

}
