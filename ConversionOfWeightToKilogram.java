import java.util.Scanner;

public class ConversionOfWeightToKilogram{
  public static void main(String[] args){
     Scanner scr = new Scanner(System.in);
   
   System.out.print("Enter Your Weight in Pounds: ");
     float weight = scr.nextFloat();
    
       double weightInKilogram = weight*0.454;

         System.out.printf("Your Weight in Kilogram is %.3f: ",weightInKilogram);




    }
 



}