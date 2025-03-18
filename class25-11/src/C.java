class X 
{
	X()
	{
	System.out.println(1);
	}
	X(int i)
	{
	this();
	System.out.println(2);
	}
	X(int i,int j)
	{
	this(i);
	System.out.println(3);
	}
}
class Y extends X 
{
	Y()
	{
	super(10);
	System.out.println(4);
	}
	Y(int i)
	{
	System.out.println(5);
	}
	Y(int i, int j)
	{
	super(i,j);
	System.out.println(6);
	}
}
class Z extends Y
{
	Z()
	{
	super(1,2);
	System.out.println(7);
	}
	Z(int i)
	{
	this();
	System.out.println(8);
	}
	Z(int i,int j)
	{
	super(10);
	System.out.println(9);
	}
	Z(double j)
	{
	this(10);
	System.out.println(10);
	}
}
class Manager
{
	public static void main(String[] args) 
	{
		Z z1=new Z();
		System.out.println("----------");
		
		Y y1=new Y(10);
		System.out.println("----------");
		X x1=new X();
		System.out.println("----------");
		Y y2=new Y(20,30);
		System.out.println("----------");
		Z z2=new Z(10.0);
		System.out.println("----------");
		X x2=new X(1,2);
		System.out.println("----------");
		X x3=new X(100);
		System.out.println("----------");
		Y y3=new Y();
		System.out.println("----------");
		Z z3=new Z(1,2);
		System.out.println("----------");
		System.out.println("Hello World!");
	}
}
