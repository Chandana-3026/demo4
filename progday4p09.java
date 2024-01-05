class PrePostDecrementExample
{
public static void main(String args[])
{
int i=20;
int a=i--;
System.out.println("a="+a);//prints 20
System.out.println("i="+i);//prints19
--i;
System.out.println(i);//prints 18
System.out.println(--i);//prints 17
System.out.println(i--);//prints 17
System.out.println(i);//prints 16
int j=20;
int b=--j;
System.out.println("b="+b);//prints 19
System.out.println("j="+j);//prints 19
}
}

//Nesting of increment or decrement operator is not allowed,never use final 