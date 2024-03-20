import java.util.*;
class A
{
Scanner sc=new Scanner(System.in);
int x[]=new int[3];
int i;
void show()
{
System.out.println("enter array elements");
for(i=0;i<3;i++)
{
x[i]=sc.nextInt();
}
System.out.println(" array elements are-:");
for(i=0;i<3;i++)
{
System.out.print("\t"+x[i]);
}
}
}
class array
{
public static void main(String[] args)
{
A p=new A();
p.show();
}
}