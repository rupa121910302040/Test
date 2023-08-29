package anudip.com;

public class Tostr {
	
	int empcode; 

	String name;

	String city;
	
	Tostr(int empcode,String name,String city)
	{
		this.empcode=empcode;
		this.name= name;
		this.city=city;
		
		
		
	}
	
	
	public String toString()
	{
		return empcode+" "+name+" "+city;
		
	}

	
	public static void main(String[] args) {
		
		Tostr t1= new Tostr(40,"roopa" ,"bobbili");
		Tostr t2= new Tostr(24,"udaya" ,"vizag");
		System.out.println(t1);
		System.out.println(t2);
	}
}


	