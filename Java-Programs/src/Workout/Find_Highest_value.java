package Workout;

public class Find_Highest_value {
	
	void F()
	{
		
		int[] v = {22,33,05,11,35,17};
		
		int temp = 0;
		int temp1 = 0;
		
		for(int i = 0;i<v.length;i++)
		{
			for(int j = 0;j<i;j++)
			{
				if(v[i]>v[j])
				{
					temp=v[j];
					v[j]=v[i];
					v[i]=temp;
				}
			}
		}
		
		temp1 = v[0] + v[1] + v[2];
		
		System.out.println(temp1);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Find_Highest_value obj = new Find_Highest_value();
		obj.F();
	}

}
