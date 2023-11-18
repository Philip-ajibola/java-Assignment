import java.util.Scanner;

public class LargestAndSmallest{
  public static void main(String[] args){
   Scanner scr = new Scanner(System.in);

     System.out.print("Enter Your First Number: ");
       int num1 = scr.nextInt();

      System.out.print("Enter Your Second Number: ");
       int num2 = scr.nextInt();


      System.out.print("Enter Your Third Number: ");
       int num3 = scr.nextInt();

       System.out.print("Enter Your  forth Second: ");
   
         int num4 = scr.nextInt();


       System.out.print("Enter Your fifth Number: ");
   
         int num5 = scr.nextInt();

          int largest = 0;
          int smallest = num5;

       if(num1>largest){
             largest=num1;
       }
        if(num2>largest){
            largest = num2;
       }
          if(num3>largest){
            largest = num3;
       }
         if(num4>largest){
            largest = num4;
       }
          if(num5>largest){
            largest = num5;
       }
         if(num1<smallest){
            smallest = num1;
       }
          if(num2<smallest){
            smallest = num2;
       }
          if(num3<smallest){
            smallest = num3;
       }
           if(num4<smallest){
            smallest = num4;
       }


        if(num5<smallest){
            smallest = num5;
       }

         System.out.printf("%d is the largest %n",largest);

       System.out.printf("%d is the smallest",smallest);




    }




}