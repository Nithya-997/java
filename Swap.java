import java.util.*;
class Swap
{
public static void main(String args[])throws Exception
{
int a=10,b=20,c;
System.out.println("BEFORE SWAPPING");
System.out.println(a+" "+b);
b=a+b-(a=b);
System.out.println("AFTER SWAPPING");
System.out.println(a+" "+b);
}
}

