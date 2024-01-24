public class UsingCommandLineToSetArray{

		public static void main(String[] args){
			if(args.length != 3){
				System.out.println("Please Enter The Int Value Seperated with the space character\n for example (4 5 6) ");			
			
			}else{
				int arrayLength = Integer.parseInt(args[0]);
				int[] array = new int[arrayLength];

				int firstValue = Integer.parseInt(args[1]);
				int increment = Integer.parseInt(args[2]);
				
					System.out.printf("%8s%10s\n","Index","Value");
				for(int count = 0; count<array.length;count++){
					array[count] = firstValue + increment *count;
				System.out.printf("%8d%10d\n",count,array[count]);
				}

			}

		}

}