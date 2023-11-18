import java.util.Scanner;

public class Arithmetic{
  public static void main(String[] args){
   Scanner scr = new Scanner(System.in);

     System.out.print("Enter Your First Interger: ");
       int num1 = scr.nextInt();

      System.out.print("Enter Your Second Interger: ");
       int num2 = scr.nextInt();


      System.out.print("Enter Your Third Interger: ");
       int num3 = scr.nextInt();

        int product = num1*num2*num3;
        int addition = num1 +num2+num3;
        double average = addition/3; 

     System.out.printf("The Product of the Three Interger is: %d%n",product);
      System.out.printf("The Sum of the Three Interger is: %d%n",addition);
        System.out.printf("The Average of the Three Interger is: %.2f%n",average);
          
             
         if(num1>num2 & num1>num3){
          System.out.printf("%d is The largest Number Between %d,%d and %d%n",num1,num1,num2,num3);
          }
           
         if( num1<num2 & num1<num3){
           System.out.printf("%d is The Smallest Number Between %d,%d and %d%n",num1,num1,num2,num3);
          }
  
         if(num2>num1 & num2>num3){
          System.out.printf("%d is The largest Number Between %d,%d and %d%n",num2,num1,num2,num3);
          }
            
         if( num2<num1 & num2<num3){
           System.out.printf("%d is The Smallest Number Between %d, %d and %d%n",num2,num1,num2,num3);

          }

         if(num3>num2 & num3>num1){
          System.out.printf("%d is The largest Number Between %d,%d and %d%n",num3,num1,num2,num3);
          }
            
         if( num3<num2 & num3<num1){
           System.out.printf("%d is The Smallest Number Between %d,%d and %d%n",num3,num2,num1,num3);
          }
  
  
}



}