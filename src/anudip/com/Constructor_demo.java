package anudip.com;

public class Constructor_demo {

	int age;
	String name;
		public Constructor_demo(int a) {
		super();
//		this keyword helps me to refer the class variable
		this.age = a;
	}
	public Constructor_demo(String name) {
			super();
			this.name = name;
		}

		public Constructor_demo() {
			System.out.println("Constructor Invoked");
		}

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Constructor_demo ob=new Constructor_demo();
			Constructor_demo obj2=new Constructor_demo(21);
			Constructor_demo obj3=new Constructor_demo("roopa");
			System.out.println(obj2.age);
			System.out.println(obj3.name);
		}

	}