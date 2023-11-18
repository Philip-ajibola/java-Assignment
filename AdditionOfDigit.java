import java.util.Scanner;

public class AdditionOfDigit{
public static void main(String[] args){
     Scanner scr = new Scanner(System.in);

  System.out.println("Enter A Number from 0 to 1000");
    int userInput = scr.nextInt();

    int  firstDigit1 = userInput/1000;
    int  remainder1 = userInput%1000;
    int secondDigit1 = remainder1/100;
    int remainder11 = remainder1%100;
    int thirdDigit1 = remainder11/10;
    int remainder12 = remainder11%10;
    int forthDigit1 = remainder12%10;

       int sumOfUserInput1 = firstDigit1+secondDigit1+thirdDigit1+forthDigit1;

     int firstDigit2 = userInput/100;
    int remainder2 = userInput%100;
    int secondDigit2 = remainder2/10;
    int remainder21 = remainder2%10;
    int thirdDigit2 = remainder21%10;
       int sumOfUserInput2 = firstDigit2+secondDigit2+thirdDigit2;
     

     int firstDigit3 = userInput/10;
    int remainder3 = userInput%10;
    int secondDigit3 = remainder3%10;

         int sumOfUserInput3 = firstDigit3+secondDigit3;
     
  

     int firstDigit4 = remainder3%10;

           int sumOfUserInput4 = firstDigit4;

    
        
         if (userInput>1000){
             System.out.println("INVALID NUMBER");
         }

       if (userInput==1000){
      System.out.printf("The Sum Of The Digit Is: %d%n",sumOfUserInput1);          
       }

      if (userInput<1000){
      System.out.printf("The Sum Of The Digit Is: %d%n",sumOfUserInput2);                    
       }

                         
            

                   
       





    }





 }

