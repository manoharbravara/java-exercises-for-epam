import java.io.*;
import java.util.*;
class Ascii
{
public static void main(String[] args)
{
int n,i;
Scanner sc=new Scanner(System.in);
System.out.println("enter array size");
n=sc.nextInt();
int a[]=new int[n];
for(i=0;i<n;i++)
{
a[i]=sc.nextInt();
}
for(i=0;i<n;i++)
{

System.out.print((char)a[i]+" ");

}
}
}