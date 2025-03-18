class G 
{
	{i=10;}
	static 
	{
	j=20;
	}
	{i=30;}
	static 
	{
	j=40;
	}
	int i=50;
	{i=60;}
	static int j=70;
	static 
	{
	j=80;
	}
}
class Manager1
{
	public static void main(String[] args) 
	{
		G f1=new G();
		System.out.println(f1.i);
		System.out.println(f1.j);
		System.out.println(G.j);
		System.out.println("Hello World!");
	}
}
