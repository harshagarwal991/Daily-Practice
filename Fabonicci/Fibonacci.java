import java.util.Scanner;
class Fibonacci 
{
public static void main(String[] args) 
{
Scanner obj=new Scanner(System.in);
System.out.println("Enter the number =");
int n=obj.nextInt();
int a=0,b=1,c;
System.out.println(a+" ") ;
System.out.println(b);
c=a+b;
for(int i=1; c<=n; i++);
{
a=b;
b=c;
c=a+b;
System.out.println("" +c);
}
}
}