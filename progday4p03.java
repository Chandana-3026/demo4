import java.util.Scanner;
public class ArithmeticOperators
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the First Value:");
double num1=sc.nextInt();
System.out.println("Enter the Second Value:");
double num2=sc.nextInt();
double sum=num1+num2;
double diff=num1-num2;
double mul=num1*num2;
double div=num1/num2;
double mod=num1%num2;
System.out.println(num1 + "+" + num2 + "=" + sum);
System.out.println(num1 + "-" + num2  + "=" + diff);
System.out.println(num1 + "*" + num2  + "=" + mul);
System.out.println(num1 + "/" + num2  + "=" + div);//quotient value
System.out.println(num1 + "%" + num2  + "=" + mod);//remainder value
}
}


