import java.util.Scanner;

public class DivisionOfNumberByThree{
  public static void main(String[] args){
     Scanner scr = new Scanner(System.in);
   
   System.out.print("Enter A Number: ");
     int num = scr.nextInt();
    
     if((num%3)==0){
        System.out.print("The Number Is Divisible By 3");
      }
       if((num%3)>0){
        System.out.print("The Number Is Not Divisible By 3");
       }


   }


}
      