//Write a program to find difference between 2 positie integers given by user
//output  
import java.util.Scanner;
class Test1
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n1=sc.nextInt();
int n2=sc.nextInt();
int diff=n1-n2;
if(n1<n2)
{
System.out.println(n2-n1);
}
else
System.out.println(n1-n2);
}
}
