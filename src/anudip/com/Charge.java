package anudip.com;
import java.util.Scanner;

public class Charge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the weight of the parcel in grams: ");
        int weightInGrams = scanner.nextInt();
        double weightInKg = weightInGrams / 1000.0;
        double charge = 15.0; 
        if (weightInKg > 1) {
            double additionalWeightInKg = weightInKg - 1;
            int additionalCharges = (int) Math.ceil(additionalWeightInKg * 2) * 8;
            charge += additionalCharges;
        }
        System.out.println("Charge: " + (int) charge);
        scanner.close();
    }
}


	
	