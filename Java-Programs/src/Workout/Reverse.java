package Workout;

public class Reverse {

	void R()
	{
		String a = "Hollo! Welcome";
		
		String[] x = a.split(" ");
		
		for(int i = x.length-1;i>=0;i--)
		{
			System.out.println(x[i]);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Reverse obj = new Reverse();
		obj.R();
		
		
	}

}
