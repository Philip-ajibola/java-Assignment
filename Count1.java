import java.util.Scanner;


public class Count1{

public static void main(String[] args){
Scanner scr=new Scanner(System.in);

System.out.print("Please Enter First Number: ");
int num = scr.nextInt();

System.out.print("Please Enter Second  Number: ");
int num1 = scr.nextInt();

if(num==num1)
System.out.printf("%d == %d",num,num1);


if(num!=num1)
System.out.printf("%d != %d",num,num1);


}


}