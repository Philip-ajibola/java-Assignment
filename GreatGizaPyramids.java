import java.util.Scanner;

public class GreatGizaPyramids{
  public static void main(String[] args){
   Scanner scr = new Scanner(System.in);

     System.out.print("Enter Your Enter Estimate Of Brick Used: ");
       int TotalStoneUsed = scr.nextInt();

      System.out.print("Enter The Average Weight Of each Stone(in Tons): ");
       int averageWeightOfStone= scr.nextInt();


      System.out.print("Enter How Many Year It Took To Build The Pyramid : ");
       int  YearsToBuildPyramid = scr.nextInt();

       int averageWeightrOfPyramid =TotalStoneUsed*averageWeightOfStone;
       double weightOfPyramidBuiltInOneYear = averageWeightrOfPyramid/YearsToBuildPyramid;

         int hourInOneYear = 8760;
       double weightOfPyramidBuiltInOneHour = weightOfPyramidBuiltInOneYear/hourInOneYear;
        
         int minuteInOneYear = 525600;
       double weightOfPyramidBuiltInOneMinute = weightOfPyramidBuiltInOneYear/minuteInOneYear;

    System.out.printf("%.4f Weight(Tons) Of Pyramid Was Approximately Built In Each Year %n",weightOfPyramidBuiltInOneYear);
     System.out.printf("%.4f Weight(Tons) Of Pyramid Was Approximately Built In Each Hour %n",weightOfPyramidBuiltInOneHour);
      System.out.printf("%.4f Weight(Tons) Of Pyramid Was Approximately Built In Each Year %n",weightOfPyramidBuiltInOneMinute);


    }




}



