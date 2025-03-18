class G 
{
	G()
	{
	System.out.println("G()");
	}
	G(int i)
	{
	System.out.println("G(int)");
	}
	{
	System.out.println("IIB-G");
	}
	static
	{
	System.out.println("SIB-G");
	}
}
class Manager19
{
	public static void main(String[] args) 
	{
		G g1=new G();
		G g2=new G(2);
	}
}
