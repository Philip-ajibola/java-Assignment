import java.util.Scanner;

public class WorldPopulationGrowth{
  public static void main(String[] args){
   Scanner scr = new Scanner(System.in);

     System.out.print("Enter The World Current Population: ");
           double currentPopulation = scr.nextDouble();

      System.out.print("Enter The Annual Population Growth Rate(%): ");
       double annualGrowthRate  = scr.nextDouble();

       double populationAfterOneYear = currentPopulation + (currentPopulation*(annualGrowthRate/100));
       double populationAfterTwoYear = populationAfterOneYear + (populationAfterOneYear*(annualGrowthRate/100));
       double populationAfterThreeYear = populationAfterTwoYear + (populationAfterTwoYear*(annualGrowthRate/100));
       double populationAfterFourYear = populationAfterThreeYear + (populationAfterThreeYear*(annualGrowthRate/100));
       double populationAfterFiveYear = populationAfterFourYear + (populationAfterFourYear*(annualGrowthRate/100));
  
       System.out.printf("The Estimate Of The Population Next Year is %.2f%n: ",populationAfterOneYear);
        System.out.printf("The Estimate Of The Population Next Two Year is %.2f%n: ",populationAfterTwoYear);
          System.out.printf("The Estimate Of The Population Next Three Year is %.2f%n: ",populationAfterThreeYear);
         System.out.printf("The Estimate Of The Population Next Four Year is %.2f%n: ",populationAfterFourYear);
       System.out.printf("The Estimate Of The Population Next Five Year is %.2f%n: ",populationAfterFiveYear);
  }




} 