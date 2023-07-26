/*java program to check whether a number is Armstrong or not*/
import java.lang.*;
import java.util.Scanner;
class Armstrong_Number
{
public static void main(String args[])
{
Scanner scan = new Scanner(System.in);
int num,temp,sum=0,rem;
System.out.println("Enter a number to find Armstrong or not");
num = scan.nextInt();
temp=num;
while(num>0)
{
rem=num%10;
sum=sum+(rem*rem*rem);
num=num/10;
}
if(temp==sum)
{
System.out.println("Armstrong Number");
}
else
{
System.out.println("Not an Armstrong Number");
}
}
}
//Armstrong Number is sum of cube of its digits

