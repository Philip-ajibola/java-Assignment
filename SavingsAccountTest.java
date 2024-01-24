import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.NumberFormat;

public class SavingsAccountTest{


	public static void main(String[] args){
		SavingsAccount myAccount1 = new SavingsAccount( BigDecimal.valueOf(2000.00));
		SavingsAccount myAccount2 = new SavingsAccount( BigDecimal.valueOf(3000.00));
		String[] array = {"January","Febuary","Maech","April","May","June","July","August","September","October","November","December"};
			
			SavingsAccount.modifyInterestRate( BigDecimal.valueOf(4));
		
			System.out.printf("%12s\t%10s\t%10s\n","Month","Account1","Account2");
			for(int count = 1 ; count<= 12; count++){
				BigDecimal monthlyBalance1 = myAccount1.CalculateMonthlyInterest(myAccount1.getSavingsBalance()).setScale(2,RoundingMode.HALF_UP);
				BigDecimal monthlyBalance2 = myAccount2.CalculateMonthlyInterest(myAccount2.getSavingsBalance()).setScale(2,RoundingMode.HALF_UP);

			System.out.printf("%12s\t%10s\t%10s\n",array[count-1],NumberFormat.getCurrencyInstance().format(monthlyBalance1),NumberFormat.getCurrencyInstance().format(monthlyBalance2));

				
			
			}
	}


}