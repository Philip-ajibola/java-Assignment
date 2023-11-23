import java.util.Scanner;

public class WorldPopulationGrowth{
  public static void main(String[] args){
   Scanner scr = new Scanner(System.in);

     System.out.print("Enter The World Current Population: ");
           long currentPopulation = scr.nextLong();

      System.out.print("Enter The Annual Population Growth Rate(%): ");
       int annualGrowthRate  = scr.nextInt();
       
       double percentage = annualGrowthRate/100.0;


       long populationAfterOneYear = currentPopulation +(long) (currentPopulation*(percentage));
       long populationAfterTwoYear = populationAfterOneYear + (long)(populationAfterOneYear*(percentage));
       long populationAfterThreeYear = populationAfterTwoYear +(long) (populationAfterTwoYear*(percentage));
       long populationAfterFourYear = populationAfterThreeYear +(long) (populationAfterThreeYear*(percentage));
       long populationAfterFiveYear = populationAfterFourYear +(long) (populationAfterFourYear*(percentage));
  
       System.out.println("The Estimate Of The Population Next Year is  "+populationAfterOneYear);
        System.out.println("The Estimate Of The Population Next Two Year is  "+populationAfterTwoYear);
          System.out.println("The Estimate Of The Population Next Three Year is  "+populationAfterThreeYear);
         System.out.println("The Estimate Of The Population Next Four Year is  "+populationAfterFourYear);
       System.out.println("The Estimate Of The Population Next Five Year is "+populationAfterFiveYear);
  }




} 