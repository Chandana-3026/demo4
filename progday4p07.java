import java.util.Scanner;
class UnaryNOt 
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int b=sc.nextInt();
boolean cond=true;
System.out.println("Cond is:"+ cond);
System.out.println("Var1=" +a);
System.out.println("Var2=" +b);
//after applyning unaryNot operator
System.out.println("Now cond is:" + !cond);
System.out.println("!(a<b)="+ !(a<b));
System.out.println("!(a>b)="+ !(a>b));
}
}
