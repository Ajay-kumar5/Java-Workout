package Workout;

public class Shopping {

	int Electronics = 10;
	int Mobiles = 15;
	int Home_Applications = 25;
	int Beauty = 30;
	
	String Username;
	String Address;
	String Mobilenumber;
    int Age;
    
    Shopping()
    {
    	System.out.println("Welcome to Flipkart");
    	this.offer();
    	
    }
    
    void offer()
    {
    	System.out.println("Electronics offers upto "+Electronics+"%");
    	System.out.println("Mobiles offers upto "+Mobiles+"%");
    	System.out.println("Home_Applications offers upto "+Home_Applications+"%");
    	System.out.println("Beauty offers upto "+Beauty+"%");

      }
    
    void Register(String Username,String Address,String Mobilenumber,int Age)
    {
    	
    	this.Username = Username;
    	this.Address = Address;
    	this.Mobilenumber = Mobilenumber;
    	this.Age = Age;
    	

    }
    
    void Register1(String Username,String Address,String Mobilenumber,int Age)
    {
    	this.Username = Username;
    	this.Address = Address;
    	this.Mobilenumber = Mobilenumber;
    	this.Age = Age;
    }
    
    void login()
    {
    	String Username = "xxxxak";
    	String Password = "xxxxx3589";
    	
    	System.out.println("Username: "+Username);
    	System.out.println("Password: "+Password);
    }
    
    void Profile()
    {
    	this.Register(Username, Address, Mobilenumber, Age);
    	this.Register1(Username, Address, Mobilenumber, Age);
    	
    	System.out.println("Username: "+Username);
    	System.out.println("Address: "+Address);
    	System.out.println("Mobilenumber: "+Mobilenumber);
    	System.out.println("Age: "+Age);
    }
    

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Shopping obj = new Shopping();
		obj.Register("Ajay","Palani", "8564792586", 25);
		obj.Register1("kumar", "Kovi","9157682224", 24);
		obj.Profile();
		
		
		Payment obj1 = new Payment();
		obj1.Cash(); 
	}

}
