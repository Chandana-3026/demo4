import java.util.Scanner;
class RelationalOperators
{
public static void main(String args[])
{
Scanner scan=new Scanner(System.in);
System.out.println("Enter a first number");
int num1=scan.nextInt();
System.out.println("Enter a second number");
int num2=scan.nextInt();
System.out.println("Enter a third number");
int num3=scan.nextInt();
if((num1>num2)&&(num1>num3))
{
System.out.println("num1 is greater:"+num1);
}
if((num2>num3)&&(num2>num1))
{
System.out.println("num2 is greater is:"+num2);
}
if((num3>num1)&&(num3>num1))
{
System.out.println(" num3 isgreater:"+num3);
}
if((num1<num2)&&(num1<num3))
{
System.out.println("num1 is smaller:"+num1);
}
if((num2<num3)&&(num2<num1))
{
System.out.println("num2 is smaller:"+num2);
}
if((num3<num1)&&(num3<num2))
{
System.out.println(" num3  is smaller :"+num3);
}
}
}



