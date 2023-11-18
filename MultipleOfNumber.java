import java.util.Scanner;

public class MultipleOfNumber{
  public static void main(String[] args){
     Scanner scr = new Scanner(System.in);
   
   System.out.print("Enter First Number: ");
     int num1 = scr.nextInt();
    
  
   System.out.print("Enter Second Number: ");
     int num2 = scr.nextInt();
      int cubeNum1 = num1*num1*num1;
      int squareNum2 = num2*num2;

     if((cubeNum1%squareNum2)==0){
        System.out.print("The First Number Tripled is A Mutiple Of Second Number Square");
      }
       if((cubeNum1%squareNum2)>0){
        System.out.print("The First Number Tripled is Not A Mutiple Of Second Number Square");
       }


   }


}
      