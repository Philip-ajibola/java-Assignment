import java.util.Scanner;

public class NokiaPhone2{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
			int userInput = 0;
			int userInput1 = 0;
			int userInput2 = 0;
			int userInput3 = 0;
			int userInput4 = 0;
			int userInput5 = 0;
			int userInput6 = 0;
			int  continuation = 0;
			int  selectNumber = 0;
    
	System.out.print("Menu Function\n");
	System.out.print("1. Phone Book\n");
	System.out.print("2. Messages\n");
	System.out.print("3. Chat\n");
	System.out.print("4. Call Register\n");
	System.out.print("5. Tones\n");
	System.out.print("6. Settings\n");
	System.out.print("7. Call Divert\n");
	System.out.print("8. Games\n");
	System.out.print("9. Calculator\n");
	System.out.print("10. Reminders\n");
	System.out.print("11. Clock\n");
	System.out.print("12. Profiles \n");
	System.out.print("13. SIM services\n");

		System.out.print("Select the number for the page you want to open \n");
			 userInput = input.nextInt();

	switch(userInput/1){
		case 1:
			System.out.println();
			System.out.println("\tPhone Book ");
			System.out.print("1. Search\n");
			System.out.print("2. Services Nos\n");
			System.out.print("3. Add name\n");
			System.out.print("4. Erase\n");
			System.out.print("5. Edit\n");
			System.out.print("6. Assign Tone\n");
			System.out.print("7. Send b'card \n");
			System.out.print("8. Options \n");
			System.out.print("9. Speed dials\n");
			System.out.print("10. Voice tags\n");

		System.out.print("Select the number for the page you want to open  \n");
			 userInput1 = input.nextInt();

			System.out.println();
		switch(userInput1/1){
				
			case 1:
				System.out.print("Search\n");
			break;
		
			case 2:
				System.out.print("Service Nos\n");
			break;

			case 3:
				System.out.print("Add name \n");
			break;

			case 4:
				System.out.print("Erase \n");
			break;

			case 5:
				System.out.print("Edit\n");
			break;

			case 6:
				System.out.print("Assign Tone\n");
			break;

			case 7:
				System.out.print("Send B'Card \n");
			break;

			case 8:
				System.out.println();
				System.out.println("\tOptions");
				System.out.print("1. Type of view\n");
				System.out.print("2. Memory Status\n");
			break;

			case 9:
				System.out.print("Speed dials\n");
			break;

			case 10:
				System.out.print("Voice Tags\n");
			break;

			}	
		break;
		case 2:
			System.out.println();
			System.out.println("\tMessages ");
			System.out.print("1. write messages\n");
			System.out.print("2. inbox \n");
			System.out.print("3. Outbox\n");
			System.out.print("4. Pictures messages\n");
			System.out.print("5. Templates\n");
			System.out.print("6. Smileys\n");
			System.out.print("7. Message Setting \n");
			System.out.print("8. Info Service\n");
			System.out.print("9. Voice mailbox number\n"); 
			System.out.print("10. Service Command editor\n");
			
		System.out.print("Select the number for the page you want to open \n");
			 userInput2 = input.nextInt();

				System.out.println();

		switch(userInput2/1){
				
			case 1:
				System.out.print("Write messages\n");
			break;
		
			case 2:
				System.out.print("Inbox\n");
			break;

			case 3:
				System.out.print("Outbox \n");
			break;

			case 4:
				System.out.print("Picture messages\n");
			break;

			case 5:
				System.out.print("Templates\n");
			break;

			case 6:
				System.out.print("Smileys\n");
			break;

			case 7:
				System.out.println("\tMessage Settings");
				System.out.println();
				System.out.print("1. set 1 \n");
				System.out.print("2. common  3 \n");

				System.out.print("Select the number for the page you want to open \n");
					 selectNumber = input.nextInt();
				if(selectNumber ==1){
					System.out.println();
					System.out.println("\tSet 1");
					System.out.println(" Message centre number");
					System.out.println(" Message sent as");
					System.out.println(" Message validity");
				}
				
				if(selectNumber==2){
					System.out.println();
					System.out.println("\tcommon 3");
					System.out.println(" Delivery reports");
					System.out.println(" Reply via Same centre");
					System.out.println(" Character support");
				}

			break;

			case 8:
				System.out.print("Info Service\n");
				
			break;

			case 9:
				System.out.print("Voice mailbox number\n");
			break;

			case 10:
				System.out.print("Service command editor\n");
			break;

		}
	break;

	case 3:
		System.out.print("Chat\n");	

	break;

	case 4:
		System.out.println();
		System.out.println("\tCall Register ");

		System.out.println("1. Missed calls ");
		System.out.println("2. Recieved calls ");
		System.out.println("3. Dailed Number ");
		System.out.println("4. Erase recent call list");
		System.out.println("5. Show call duration ");
		System.out.println("6. show call cost");
		System.out.println("7. cost call setting");
		System.out.println("8. Prepaid credit");
		
		System.out.print("Select the number for the page you want to open \n");
					 userInput3 = input.nextInt();

			System.out.println();
	switch(userInput3/1){
				
			case 1:
				System.out.println(" Missed calls ");
			break;
			case 2:
				System.out.println(" Recieved calls ");
			break;
			case 3:
				System.out.println(" Dailed Number ");
			break;
			case 4:
				System.out.println(" Erase recent call list");
			break;
			case 5:
				System.out.println("\tShow call duration ");
				System.out.println("1.Last call duration ");
				System.out.println("2. All calls' duration ");
				System.out.println("3. Received calls' duration ");
				System.out.println("4. Dialed Calls' duration");
				System.out.println("5. Clear timers  ");
				

		
			break;
			case 6:
				System.out.println();
				System.out.println("\tshow call cost");
				System.out.println("1. Last call cost ");
				System.out.println("2. All calls' cost ");
				System.out.println("3. Clear counters");
			break;
			case 7:	
				System.out.println();
				System.out.println("\tcost call setting");
				System.out.println(" Call cost limit");
				System.out.println("Show cost in ");
			break;

			case 8:
				System.out.print("");
				System.out.print("Prepaid credit");
			break;
		}

		break;
	case 5:
		System.out.println();
		System.out.println("\tTones ");
		System.out.println("1. Ringing tone ");
		System.out.println("2. Ringing volume ");
		System.out.println("3. Incoming call alert ");
		System.out.println("4. Composer");
		System.out.println("5. Message alert tone");
		System.out.println("6. Keyboard tone ");
		System.out.println("7. Warning and game tone ");
		System.out.println("8. Vibrating alert ");
		System.out.println("9. Screen saver ");
	
		
		System.out.print("Select the number for the page you want to open \n");
			 userInput4 = input.nextInt();
			System.out.println();

	switch(userInput4/1){

			case 1:
				System.out.println("Ringing tone ");
			break;
			case 2:
				System.out.println("Ringing volume ");
			break;
			case 3:
				System.out.println(" Incoming call alert ");
			break;
			case 4:
				System.out.println(" Composer");
			break;
			case 5:
				System.out.println(" Message alert tone ");
			break;
			case 6:
				System.out.println(" Keyboard tones  ");
			break;
			case 7:
				System.out.println(" Warning and games tone ");
			break;
			case 8:
				System.out.println(" Vibrating alert");
			break;
			case 9:
				System.out.println(" Screen saver");
			break;
		}
	break;
	
	case 6:
		System.out.println("\tSettings");
		System.out.println("1. Call setting ");
		System.out.println("2. Phone setting");
		System.out.println("3. Security setiing ");
		System.out.println("4. Restore factory setting");
		
		System.out.print("Select the number for the page you want to open \n");
			 userInput5 = input.nextInt();

				System.out.println();
		switch(userInput5/1){
				
			case 1:
				System.out.println("\t Call setting");
				System.out.println("Automatic redail ");
				System.out.println(" Speed dialing  ");
				System.out.println(" Call waiting option ");
				System.out.println("Own number setting");
				System.out.println("Phone line in use ");
				System.out.println("Automatic anwer");
			break;

			case 2:
				System.out.println("\t Phone setting");
				System.out.println("language ");
				System.out.println(" Cell info display  ");
				System.out.println(" Welcome note ");
				System.out.println("Network selection");
				System.out.println("Lights ");
				System.out.println("Confirm SIM service actions");
			break;

			case 3:
				System.out.println("\t Security setting");
				System.out.println("Pincode request ");
				System.out.println(" Call barring service ");
				System.out.println(" Fixed dialing ");
				System.out.println("Closed user group");
				System.out.println("Phone security");
				System.out.println("Change access code");
			break;
			case 4:
				System.out.println("Restore factory settings");
		
		}

	break;
	
	case 7:
		System.out.println("Call divert");
	break;

	case 8:
		System.out.println("Games");
	break;
	
	case 9:
		System.out.println("Calculator");
	break;
	
	case 10:
		System.out.println("Reminder");
	break;
	
	case 11:
				System.out.println();
				System.out.println("\tClock");
				System.out.println("1. Alarm clock ");
				System.out.println("2. Clock settings");
				System.out.println("3. Date setting");
				System.out.println("4. Stopwatch ");
				System.out.println("5. Count down timer");
				System.out.println("6. Auto update of date and time");
				System.out.println();

			System.out.print("Select the number for the page you want to open \n");
					 userInput6 = input.nextInt();
			 	
				System.out.println();
		switch(userInput/1){
					
			case 1:
				System.out.println("Alarm clock");
			break;
			case 2:
				System.out.println("Clock setting");
			break;
			case 3:
				System.out.println("date setting");
			break;
			case 4:
				System.out.println("Stopwatch");
			break;
			case 5:
				System.out.println("COunt down timer ");
			break;
			case 6:
				System.out.println("Auto update of date and time"); 
			break;
			
		}


	case 12:
		System.out.println("Profiles");
	break;


	case 13:
		
		System.out.println("SIM services");


	}
			System.out.println();





		}

}