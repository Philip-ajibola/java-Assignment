import java.util.Scanner;

public class SeperationOfIntergers{
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
     
    System.out.printf("%d  %d  %d  %d  %d%n",firstDigit,secondDigit,thirdDigit,forthDigit,fifthDigit);     
      
}



}