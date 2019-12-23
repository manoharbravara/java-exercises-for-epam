import java.io.*;
import java.util.*;
class Demo1
{
public static void main(String[] args)
{
int n,i;
int max=0,min=999;
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
int a[]=new int[n];
for(i=0;i<n;i++)
{
a[i]=sc.nextInt();
}

for(i=0;i<n;i++)
{
if(a[i]>max)
{
max=a[i];
}
else
if(a[i]<min)
{
min=a[i];
}
}

System.out.println("max is"+max);

System.out.println("min is"+min);
}
}