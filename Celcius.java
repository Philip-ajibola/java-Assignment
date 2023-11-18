import java.util.Scanner;

public class Celcius{
  public static void main(String[] args){
      Scanner scr = new Scanner(System.in);
     System.out.print("Enter Celcius: ");
        double userInput = scr.nextDouble();
       
       double fahrenheit = (9.0/5)*userInput+32;

           System.out.printf("%.2f Celsius is %.2f Fahrenheit ",userInput,fahrenheit);




}


}