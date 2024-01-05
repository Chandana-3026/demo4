import java.util.Scanner;
class AllOperators
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int m=sc.nextInt();
int diff=n-m;
int mul=n*m;
int div=n/m;
int mod=n%m;
System.out.println(n + "-" + m  + "=" + diff);
System.out.println(n + "*" + m  + "=" + mul);
System.out.println(n + "/" + m  + "=" + div);//quotient value
System.out.println(n + "%" + m  + "=" + mod);//remainder value
}
}