class A
{
}
class B extends A
{
}
class C extends B
{
}
class Manager
{
	Public static void main(String arg[])
	{
	A a1=new C();
	B b1=a1;
	C c1=b1;
	C c2=c1;
	System.out.println("done");
	}
}
