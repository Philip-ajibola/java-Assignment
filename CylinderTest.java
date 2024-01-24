import java.util.InputMismatchException;

import java.util.Scanner;

public class CylinderTest{

	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		Cylinder cylinder = new Cylinder();
	
		boolean condition = true;

		while(condition){
		
		try{
			System.out.println("Enter Radius ");
			double radius = input.nextDouble();
			cylinder.setRadius(radius);
			condition = false;
		}

		catch(InputMismatchException e){
			System.out.println("Enter numeric value ");
				input.next();
		}
			
		}
		System.out.println("Enter Height ");
			double height = input.nextDouble();
			cylinder.setHeight(height);

		double volume = cylinder.calculateCylinderVolume();
		
		System.out.printf("The Volume of the cylinder is approximately %.2f",volume);
		
	}



}