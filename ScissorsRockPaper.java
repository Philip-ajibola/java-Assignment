import java.util.Scanner;

  public class ScissorsRockPaper{
      public static void main(String[] args){
        Scanner scr = new Scanner(System.in);

 System.out.println("Player One Enter your name.");
   String name1 = scr.nextLine();

 System.out.println("Player Two Enter your name.");
   String name2 = scr.nextLine();

System.out.printf("%s Enter A Number 0,1, or 2 :",name1);
    int num1 = scr.nextInt();
System.out.printf("%s Enter A Number 0,1, or 2: ",name2);
     int num2 = scr.nextInt();
     
     int scissors = 0;
      int rock = 1;
       int paper = 2;

  if(num1==scissors && num2==scissors){
     System.out.printf("It is A Draw Between %s And %s: %n",name1,name2 );
}
  if(num1==scissors && num2==rock){
     System.out.printf(" %s WON %s!!!! %n",name2,name1 );
}
  if(num1==scissors && num2==paper){
     System.out.printf(" %s WON %s!!!! %n",name1,name2 );
}
  if(num1==rock && num2==scissors){
     System.out.printf("%s WON %s!!!! %n",name1,name2 );
}
  if(num1==rock && num2==paper){
     System.out.printf(" %s WON %s!!!! %n",name2,name1);
}
  if(num1==rock && num2==rock){
     System.out.printf("It is A Draw Between %s And %s: %n",name1,name2 );
}
  if(num1==paper && num2==scissors){
     System.out.printf(" %s WIN %s!!!! %n",name2,name1 );
}
   if(num1==paper && num2==rock){
     System.out.printf(" %s WIN %s: %n",name1,name2 );
}
  if(num1==paper && num2==paper){
     System.out.printf("It is A Draw Between %s And %s: %n",name1,name2 );
}



}


}