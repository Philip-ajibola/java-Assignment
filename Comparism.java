import java.util.Scanner;

public class Comparism{
  public static void main(String[] args){
   Scanner scr = new Scanner(System.in);
    System.out.print("Enter Your A Number: ");
      int num = scr.nextInt();
      int squareNum = num*num;

if(num>100){
System.out.printf("Number %d  Greater than 100 %n",num); 

}
 if(squareNum>100){
System.out.printf(" Number Square %d  is Greater than 100 %n",squareNum); 
}
if(num<100){
System.out.printf("Number %d  is less than 100 %n",num); 

}

if(squareNum<100){
System.out.printf("Number Square %d is lesser than 100 %n",squareNum); 
}

 if(num==100){
System.out.printf("Number %d  Equal than 100 %n",num); 

}

if(squareNum==100){
System.out.printf("Number Square %d is Equal than 100 %n",squareNum); 

}
   
 if(num!=100){
System.out.printf("Number %d is not Equal than 100 %n",num); 

}

if(squareNum!=100){
System.out.printf("Number Square %d is not Equal than 100 %n",squareNum); 

}
   
}

}







