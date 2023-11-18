import java.util.Scanner;

public class CountingOfPositiveNegativeANdZeroNumbers{
  public static void main(String[] args){
   Scanner scr = new Scanner(System.in);

     System.out.print("Enter Your First Interger: ");
       int num1 = scr.nextInt();

      System.out.print("Enter Your Second Interger: "); 
       int num2 = scr.nextInt();


      System.out.print("Enter Your Third Interger: ");
       int num3 = scr.nextInt();

      System.out.print("Enter Your Forth Interger: ");
       int num4 = scr.nextInt();


      System.out.print("Enter Your Fifth Interger: ");
       int num5 = scr.nextInt();

      
      int totalPositive = 0;
      int totalNegative = 0;
      int totalZero     =0;

     if(num1>=1){
        totalPositive=totalPositive+1;
     }
     
     if(num2>=1){
       totalPositive=totalPositive+1;
     }
        if(num3>=1){
        totalPositive=totalPositive+1;
     }
       if(num4>=1){
          totalPositive=totalPositive+1;
     }
       if(num5>=1){
         totalPositive=totalPositive+1;
     }
       if(num1<0){
          totalNegative=totalNegative+1;
     }
        if(num2<0){
       totalNegative=totalNegative+1;
     }
         if(num3<0){
       totalNegative=totalNegative+1;
     } 
        if(num4<0){
       totalNegative=totalNegative+1;
     }
        if(num5<0){
       totalNegative=totalNegative+1;
     }
       if(num1==0){
       totalZero=totalZero+1;
     }
       if(num2==0){
       totalZero=totalZero+1;
     }
         if(num3==0){
          totalZero=totalZero+1;
     } 
        if(num4==0){
       totalZero=totalZero+1;
     }
        if(num5==0){
       totalZero=totalZero+1;
     }

         System.out.printf("The total number of  positive Number is: %d%n ", totalPositive);
         System.out.printf("The total number of  Negative Number is: %d%n ", totalNegative);
          System.out.printf("The total number of  Zero Number is: %d%n ", totalZero);



  }



 }