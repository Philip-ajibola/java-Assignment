import java.util.Scanner;

public class SquareNumber{
  public static void main(String[] args){
   Scanner scr = new Scanner(System.in);
    System.out.print("Enter Your First Number: ");
      int num1 = scr.nextInt();
       System.out.print("Enter Your Second Number: ");
        int num2 = scr.nextInt();

       int squareNum1=num1*num1;
    System.out.printf("The Square Of The First Number Is %d%n: ", squareNum1);
     
    int squareNum2=num2*num2;

   System.out.printf("The Square Of The Second Number Is %d%n: ", squareNum2);
     
    int sumOfSquare=squareNum1+squareNum2;

      System.out.printf("The Sum of The Squared Number Is %d%n: ", sumOfSquare);
     
    int differenceOfSquare=squareNum1-squareNum2;

    System.out.printf("The Difference of The Squared Number Is %d: ", differenceOfSquare);
     


}

}







