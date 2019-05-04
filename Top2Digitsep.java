import java.util.*;
class  Top2Digitsep
{
public static void main(String args[])
{
int rem,count=0;
Scanner s=new Scanner(System.in);
int n=s.nextInt();
while(n>0)
{
rem=n%10;
System.out.println("Number at position"+" "+count+" "+"is:"+rem);
count++;
n=n/10;
}
}
}

