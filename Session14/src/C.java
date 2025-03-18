class D 
{
	int i;
	D(int i)
	{
	System.out.println(i);
	this.i=i;
	}
	void print()
	{
	System.out.println(i);
	}
}
class Manager2
{
	public static void main(String[] args) 
	{
		D d1=new D(1);
		d1.print();
		D d2=new D(2);
		d2.print();
		d1.i=1000;
		d2.print();
		d2.i=2000;
		d1.print();
		d2.print();
	}
}
