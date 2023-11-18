import java.util.Scanner;

 public class CurrencyChange{
     public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the exchange rate from dollars to RMB: ");
              double exchangeRate = input.nextDouble();

         System.out.print("Enter 0 to convert dollars to RMB and 1 Vice versa: ");
             int number = input.nextInt();

            if(number == 0){
           System.out.print("Enter the dollar amount: ");
             double moneyInDollar = input.nextDouble();
           double dollarToRMB = exchangeRate* moneyInDollar ;
          System.out.printf("$%.1f is %.1fyuan",moneyInDollar,dollarToRMB);
          }

           if(number == 1){
           System.out.print("Enter the RMB amount: ");
             double moneyInRMB = input.nextDouble();
            double RMBToDollar =  moneyInRMB/exchangeRate;
           System.out.printf("%.1f yuan   is $%.2f",moneyInRMB,RMBToDollar);
           }
           
            



      }
      


 }