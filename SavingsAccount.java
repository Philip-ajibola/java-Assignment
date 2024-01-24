import java.math.BigDecimal;
import java.math.RoundingMode;

public class SavingsAccount{

	private BigDecimal savingsBalance;

	private static BigDecimal annualInterestRate;

	public SavingsAccount(BigDecimal balance){
			savingsBalance = balance;
	}

	public void setSavingsBalance(BigDecimal balance){
		savingsBalance = balance;
	}
	
	public BigDecimal getSavingsBalance(){
		return savingsBalance;
	}

	public static void modifyInterestRate(BigDecimal interest){
			annualInterestRate = interest.divide(BigDecimal.valueOf(1200),4,RoundingMode.HALF_UP);
			//System.out.println(annualInterestRate);
	}

	public BigDecimal CalculateMonthlyInterest(BigDecimal balance){
			BigDecimal monthlyInterest = getSavingsBalance().multiply(annualInterestRate);
		
			 savingsBalance = getSavingsBalance().add(monthlyInterest);
			//setSavingsBalance(monthlyBalance);
			return savingsBalance;
		}


}