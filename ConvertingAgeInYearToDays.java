import java.util.Scanner;

public class ConvertingAgeInYearToDays{
      public static void main(String[] args){
          Scanner scr = new Scanner(System.in);
         
       System.out.print("Enter Your Age: ");
           int age = scr.nextInt();
       int yearsToDate = age*365;

        System.out.printf("%d Years To Days is %d ",age,yearsToDate);



      }




}