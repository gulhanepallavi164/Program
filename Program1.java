/*
Write a program which accept number from user and Display  revese of that number.
Input : 2395 
Output : 5932

Input : 1018
Output : 8101


*/
import java.util.*;
class Revese
{
public void Display(int iValue)
{	int iDigit=0;
if(iValue<0)
{
   iValue=-iValue;
}
   while(iValue>0)
   {

      iDigit=iValue%10;
	  System.out.print(iDigit);
	  iValue=iValue/10;


   }	   
}	
}
class Program1
{
	public static void main(String avg[])
	{
	  Scanner sobj=new Scanner(System.in);
	  int ino=0;
	  System.out.println("Enter number");
	  ino=sobj.nextInt();
	  Revese rev=new Revese();
	  rev.Display(ino);
		
	
	}
	
}