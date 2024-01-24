import java.util.Scanner;

public class State{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);


	System.out.println("Enter Your State (Ogun):");
		String state = input.next();
		String toUpperCase = state.toUpperCase();
switch(toUpperCase){
		case "KEBBI":
		case "SOKOTO":
		case "KATSINA":
		case "KADUNA":
		case "KANO":
		case "ZAMFARA":
			System.out.print("You are from the North West(NW)");
			break;

		case "BORNO":		
		case "ADAMAWA":
		case "YOBE":
		case "TARABA":
		case "GOMBE":
		case "JIGAWA":
			System.out.print("You are from the North East(NE)");
			break;
		case "KOGI":
		case "KWARA":
		case "PLATEAU":
		case "NIGER":
		case "BENUE":
		case "FCT":
		case "NASARAWA":
			System.out.print("You are from the North Central(NC)");
			break;
		case "OGUN":
		case "OSUN":
		case "ONDO":
		case "LAGOS":
		case "EKITI":
		case "OYO":
			System.out.print("You are from the South West(Sw)");
			break;
		case "ANAMBRA":		
		case "ABIA":
		case "ENUGU":
		case "EBONYI":
		case "IMO":
			System.out.print("You are from the South East(SE)");
			break;
		case "RIVERS":
		case "AKWA-IBOM":
		case "BAYELSA":
		case "DELTA":
		case "CROSS-RIVER":
		case "EDO":
			System.out.print("You are from the South South(SS)");
			break;
}



		}


}
	