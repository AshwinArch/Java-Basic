public class ParameterPass
{
	public static void main(String[] args)
	{
		int i=0;
		addtwo(i++);
		System.out.println(i);
	}
	static void addtwo(int i)
	{
	i+=2;	
	}
}