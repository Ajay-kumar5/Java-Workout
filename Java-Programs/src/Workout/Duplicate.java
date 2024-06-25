package Workout;

public class Duplicate {
	
	void D()
	{
		
		int[] N = {10,20,30,10,20,50,30};
		
		int count = 0;
		
		for(int i = 0;i<N.length;i++)
		{
			for(int j = i+1;j<N.length;j++)
			{
				if(N[i]==N[j])
				{
					System.out.println(N[j]);

				}
				count++;
				
			}
			
		}
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Duplicate ob = new Duplicate();
		ob.D();
	}

}
