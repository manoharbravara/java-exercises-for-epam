import java.io.*;
import java.util.*;
class Demo
{
public static void main(String[] args)
{
int n,i;
double sum=0,avg=0;
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
int a[]=new int[n];
for(i=0;i<n;i++)
{
a[i]=sc.nextInt();
sum=sum+a[i];
avg=sum/n;


}
System.out.println(sum+" "+avg+" ");
}
}