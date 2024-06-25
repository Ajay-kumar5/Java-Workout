package Workout;

import java.util.Arrays;

public class Duplicate_count {

	
	int visited = -1;

	void D()
	{
		int[] num = {10,20,30,10,20,50};
		
		Arrays.sort(num);
		
		for(int i = 0;i<num.length;i++)
		{
			if(num[i]!=-1)
			{
				int count = 1;
				for(int j =i+1;j<num.length;j++)
				{
					if(num[i]==num[j])
					{
					count++;
					num[j]=visited;
					}
				}
				if(count>1)
				{
				System.out.println(num[i]+" count "+count);
				}
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Duplicate_count obj = new Duplicate_count();
		obj.D();
	}

}
