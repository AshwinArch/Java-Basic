class A
{
}
class B extends A
{
}
class C extends B
{
}
class AB
{
	public static void main(String arg[])
	{
	A a1=new C();                                                             
	B b1=(B)a1;
	C c1=(C)b1;
	C c2=(C)c1;
	System.out.println("done");
	}
}
