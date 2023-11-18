import java.util.Scanner;

 public class MonthInAYear{
     public static void main(String[] args){
        Scanner scr = new Scanner(System.in);
        System.out.print("Enter Month in Number: ");
         int month = scr.nextInt();     
        
         System.out.print("Enter Year: ");
         int year = scr.nextInt();
             

          if(month==1 ){
               System.out.printf("January %d had 31 Days",year);
           }
          
              
            if(month==3 ){
               System.out.printf("March %d has 31 Days",year);
           }
             if(month==4 ){
               System.out.printf("April %d has 30 Days",year);
           }
              if(month==5 ){
               System.out.printf("May %d has 31 Days",year);
           }
             if(month==6 ){
               System.out.printf("June %d has 30 Days",year);
           } 
             if(month==7 ){
               System.out.printf("July %d has 31 Days",year);
           }
             if(month==8 ){
               System.out.printf("August %d has 31 Days",year);
           }
              if(month==9 ){
               System.out.printf("September %d has 30 Days",year);
           }
              if(month==10 ){
               System.out.printf("October %d has 31 Days",year);
           }
              if(month==11 ){
               System.out.printf("November %d has 30 Days",year);
           }
              if(month==12 ){
               System.out.printf("December %d has 31 Days",year);
                }
               if(month==2 && (year%4)==0){
              System.out.printf("Febuary %d has 29 Days",year);
                 } 

                if(month==2 && (year%4)!=0){
                System.out.printf("Febuary %d has 28 Days",year);
                   }
           
            


    }



}