public class ModifyTimeTest{

	public static void main(String[] args){
			ModifyTime myTime = new ModifyTime();
			try{
			myTime.setTime(23,60,27);
			System.out.printf("Universal Time: %s%nNormal Time: %s%n",myTime.toUniversalString(),myTime.toString());
			}

			catch(IllegalArgumentException e){

				System.out.printf("Exception while setting time: %s",e.getMessage());
			}

	}


}