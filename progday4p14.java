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
System.out.println("num1>num2 is"+(num1>num2));
System.out.println("num1<num2 is"+(num1<num2));
System.out.println("num1>=num2 is"+(num1>=num2));
System.out.println("num1<=num2 is"+(num1<=num2));
System.out.println("num1==num2 is"+(num1==num2));
System.out.println("num1!=num2 is"+(num1!=num2));
}
}