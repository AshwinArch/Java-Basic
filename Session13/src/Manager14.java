class G 
{
	int i;
	G()
	{
	System.out.println(i);
	i=10;
	}
}
class Manager14
{
	public static void main(String[] args) 
	{
		G g1=new G();
		System.out.println(g1.i);
	}
}
