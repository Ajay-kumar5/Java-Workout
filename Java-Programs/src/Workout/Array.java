package Workout;

public class Array {

	void A()
	{
		
		int[] num = {10,20,30,10,20,50};
		
		for(int i = 0 ; i<num.length;i++)
		{
			
			for(int j = 0;j<i;j++)
			{
				if(num[i]==num[j])
				{
					System.out.println(num[j]);
				}
				
			}
				
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Array obj = new Array();
		obj.A();
	}

}
