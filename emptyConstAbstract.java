abstract class buse
{
buse()
{
System.out.print("ss");
}

abstract void fun();
}
class derive extends buse
{
derive(int x,int y)
{
System.out.print("world");
}
void fun()
{
System.out.print("hello");
}
}
class emptyconsabs
{
public static void main(String arg[])
{
derive obj=new derive(1,2);
}
}
