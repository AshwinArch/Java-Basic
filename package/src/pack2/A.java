package pack2;

 public class A
{
	A()
	{
	this.i=30;
	System.out.println(i);
	}
	protected int i;
	protected A(int i)
	{
		this();
		this.i=i;
	}
	{
	this.i=20;
	System.out.println(i);
	}
}