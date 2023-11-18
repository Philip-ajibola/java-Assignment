import java.util.Scanner;

public class AdditionOfEvenAndOdd{
public static void main(String[] args){
     Scanner scr = new Scanner(System.in);

  System.out.println("Enter A Number That Has 5 Digits");
    int userInput = scr.nextInt();
 
    int firstDigit = userInput/10000;
    int theRemainder = userInput%10000;
    int  secondDigit = theRemainder/1000;
    int  theRemainder2 = theRemainder%1000;
    int thirdDigit = theRemainder2/100;
    int theRemainder3 = theRemainder2%100;
    int forthDigit = theRemainder3/10;
    int theRemainder4 = theRemainder3%10;
    int fifthDigit = theRemainder4%10;
     

     int evenNumber=0;
     int oddNumber=0;
    System.out.printf("%d  %d  %d  %d  %d%n",firstDigit,secondDigit,thirdDigit,forthDigit,fifthDigit);     
      

   if((firstDigit%2)==0){
              evenNumber=firstDigit;
    }

    if((secondDigit%2)==0){
              evenNumber=evenNumber+secondDigit;
    }
   if((thirdDigit%2)==0){
              evenNumber=evenNumber+thirdDigit;
    }
     if((forthDigit%2)==0){
              evenNumber=evenNumber+forthDigit;
     }
      if((fifthDigit%2)==0){
              evenNumber=evenNumber+fifthDigit;
      }
          if((firstDigit%2)!=0){
              oddNumber=firstDigit;
           }
            if((secondDigit%2)!=0){
              oddNumber=oddNumber+secondDigit;
           } 
           if((thirdDigit%2)!=0){
              oddNumber=oddNumber+thirdDigit;
           }
           if((forthDigit%2)!=0){
              oddNumber=oddNumber+forthDigit;
           } 
           if((fifthDigit%2)!=0){
              oddNumber=oddNumber+fifthDigit;
           }
         System.out.printf("The Sum of The Even Number Among The You Input Is:  %d%n",evenNumber);
          System.out.printf("The Sum of The Odd Number Among The You Input Is:  %d%n",oddNumber);


      }





}