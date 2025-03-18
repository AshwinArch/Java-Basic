class J
{ 
	J(int i,double j)
	{
	System.out.println("int,double");
	}
	J(double i , double j)
	{
	System.out.println("double , double");
	}
}
class Manager
{
public static void main(String[] args) 
	{
	J d1=new J(10,10.0);
	J d2=new J(10.0,10.3);
	}
}