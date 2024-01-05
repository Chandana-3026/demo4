//To print AScii value of a given character
import java.util.Scanner;
class ASCII
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
char c=sc.next().charAt(0);
int asciivalue=c;
if((c>='A' && c<='Z')||(c>='a' && c<='z'))
System.out.println(asciivalue);
}
}
/*Easy program for all ascii values
class ASCII
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int c=sc.next().charAt(0);
System.out.println(ASCIIVALUE);
}
}
*/



