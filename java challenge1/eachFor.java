import java.util.*;
class eachFor{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the number size of an array");
int n=sc.nextInt();
int a[]=new int[n];
for(int i=0;i<n;i++)
{
a[i]=sc.nextInt();
}
for(int x:a)
{
System.out.println(x);
}
}
}