package pkg1;

public class Constructor
{
public Constructor() 
{
	System.out.println("defautl");
}
public Constructor(int a) 
{
	System.out.println("one parametrize");
}
public Constructor(int a, int b) 
{
	System.out.println("two parametrize");
}
public Constructor(int a ,int b,int c) 
{
	System.out.println("three parametrize");
}
public Constructor(int a,int b,int c,int d) 
{
	System.out.println("four parametrize");
}
public static void main(String[] args) 
{
	Constructor obj=new Constructor();
	
}
}
