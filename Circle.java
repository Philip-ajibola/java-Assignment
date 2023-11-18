import java.util.Scanner;

public class Circle{
  public static void main(String[] args){
     Scanner scr = new Scanner(System.in);
   
   System.out.print("Input the Radius of the Circle: ");
     int radius = scr.nextInt();
     double pi = 3.14159;
      
     System.out.printf("The Diameter of a Circle is %d%n",(2*radius));
     System.out.printf("The Circumference of a Circle is %.5f%n",(2*pi*radius));
     System.out.printf("The Area of a Circle is %.5f%n",(pi*(radius*radius)));




}


}