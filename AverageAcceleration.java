import java.util.Scanner;

public class AverageAcceleration{
  public static void main(String[] args){
   Scanner scr = new Scanner(System.in);

     System.out.print("Enter Your Initial Velocity (V1): ");
       float initialVelocity = scr.nextFloat();

      System.out.print("Enter Your Final Velocity (V2): ");
       float finalVelocity = scr.nextFloat();


      System.out.print("Enter Time in seconds(s): ");
       float time = scr.nextInt();


       float averageAcceleration = (finalVelocity-initialVelocity)/time;

        System.out.printf("The Average Acceleration is : %.2f%n",averageAcceleration);




     }



}