package anudip.com;

import java.util.*;

class Sample

{

public static void main(String args[])

{

double s1, scheme1,s2, scheme2, price;

Scanner demo = new Scanner(System.in);

System.out.println("Enter the amount");

price = demo.nextDouble();

scheme1 = price * 30/100;

s1 = price - scheme1;

scheme2 = price * 20/100;

s2 = (price - scheme2) * (1 - 10/100);

if(s1 > s2)

{

System.out.println("1st scheme  is better");

}

else

{

System.out.println("2nd scheme  is better");

}

}

}

