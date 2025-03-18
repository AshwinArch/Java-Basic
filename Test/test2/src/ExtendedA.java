package Test2;





class CLASSA 
{
	public int n;
	CLASSA(int n)
	{
		this.n=n;
	}
}
public class ExtendedA extends CLASSA
{
	private ExtendedA(int n)
	{
	super(n);
	}
	public static void main(String[] args) 
	{
		ExtendedA ext=new ExtendedA(420);
		System.out.println(ext.n);
	}
}
