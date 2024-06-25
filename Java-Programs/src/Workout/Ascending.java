package Workout;

public class Ascending {

	void Asec()
	{
		
		int[] v = {22,33,11,05,35,17};
		
		int temp = 0;
		
		for(int i = 0;i<v.length;i++)
		{
			
			for(int j = 0;j<i;j++)
			{
				if(v[i]<v[j])
				{
					temp = v[j];
					v[j] = v[i];
					v[i] = temp;					
				}
				
			}
		}
		
		System.out.println(v[0]);
		System.out.println(v[1]);
		System.out.println(v[2]);
		System.out.println(v[3]);
		System.out.println(v[4]);
		System.out.println(v[5]);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Ascending obj = new Ascending();
		obj.Asec();
	}

}
