package anudip.com;

public class Employee{ 
	public static void main(String[] args) { 
		double basicSalary= 50000.0;
		double da = 0.12* basicSalary;

		double hra = 0.13 * basicSalary; 
		double pf = 0.15* basicSalary;
		System.out.println("Employee Allowances and Details: "); 
		System.out.println("Basic Salary:" + basicSalary);

		System.out.println("DA (Dearness Allowance):" + da);
        System.out.println("HRA (House Rent Allowance): " + hra);

		System.out.println("PF (Provident Fund): "+ pf);
		

	}
}
	