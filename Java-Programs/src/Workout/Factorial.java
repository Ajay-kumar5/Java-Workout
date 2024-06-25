package Workout;

public class Factorial {

	
	void G()
	{
		int a = 5;
		
		int temp = 0;
		
		
		for(int i = 4;i>0;i--)
		{
			 temp = a*i;		
			 a=temp;
			 
		}
		
		
		
		System.out.println(temp);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Factorial obj = new Factorial();
		obj.G();
	}

}
