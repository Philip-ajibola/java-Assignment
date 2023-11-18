import java.util.Scanner;

public class BmiCalculation{
  public static void main(String[] args){
   Scanner scr = new Scanner(System.in);

     System.out.print("Enter Your Weight(in pounds): ");
       double weight = scr.nextDouble();

      


      System.out.print("Enter Your Height(in inches): ");
       double height = scr.nextDouble();
          double heightSquare = height*height;

       double result = weight/heightSquare;

    System.out.printf("Your BMI is %.3f%n",result);