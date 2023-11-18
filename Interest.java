import java.util.Scanner;

public class Interest{
  public static void main(String[] args){
   Scanner scr = new Scanner(System.in);

     System.out.print("Enter Your Interest Rate (%): ");
       float interestRate = scr.nextFloat();

      System.out.print("Enter Your Balance: ");
       float balance = scr.nextFloat();

        float  interest = balance*(interestRate/1200);

        System.out.printf("The Interest is : %.2f%n",interest);




     }



}