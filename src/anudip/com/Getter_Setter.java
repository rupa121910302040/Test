package anudip.com;

public class Getter_Setter {

	private int id;
	private String name;
	
public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

public static void main(String[] args) {
	Getter_Setter obj=new Getter_Setter();
	obj.setId(35);
	obj.setName("Andhra");
	System.out.println(obj.getId());
	System.out.println(obj.getName());
}
}