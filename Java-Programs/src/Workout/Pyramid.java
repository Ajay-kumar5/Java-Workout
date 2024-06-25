package Workout;

public class Pyramid {
	
	
	void P()
	{
		
		for(int i = 0;i<5;i++)
		{
				for(int j =0;j<5-i-1;j++)
				{
					System.out.print(" ");
				}
					for(int z = 0;z<i+1;z++)
					{
						System.out.print("* ");

					}
					System.out.println();

		}
	}
		
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Pyramid obj = new Pyramid();
		obj.P();
	}

}
