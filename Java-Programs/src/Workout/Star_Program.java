package Workout;

public class Star_Program {

	
	void S()
	{
		
		for(int i =0; i<5;i++)
		{
			
			for(int j = 0;j<i;j++)
			{
				System.out.print("*");
			}
			
			System.out.println("*");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Star_Program obj = new Star_Program();
		obj.S();
	}

}
