class G  
{
	int i;
	{
	System.out.println(i);
	i=5;
	}
	{
	System.out.println(i);
	i=10;
	}
}
class Manager
{
	public static void main(String[] args) 
	{
		G c1=new G();
		System.out.println(c1.i);
	}
}
