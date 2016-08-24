import java.io.*;
import java.Scanner;
class fact
{
public static void main(String str[])
{
Scanner sc=new Scanner(System.in);
int f=1,i;
int n=sc.nextInt();
for(i=0;i<n;i++)
{
f=f*i;
}
System.out.print(f);
}
}
