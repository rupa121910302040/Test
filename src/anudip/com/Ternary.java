package anudip.com;

import java.util.Scanner;

public class Ternary {
	public static void main(String[] args) {
		int age;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter age to check eligibility");
		age=sc.nextInt();
		String res;
		res=(age>=18?"Eligible":"Not Eligible");
		System.out.println(res);

			}

		}


	