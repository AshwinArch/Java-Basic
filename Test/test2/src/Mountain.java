package Test2;


class Atom 
{
	Atom()
	{
	System.out.println("Atom");	
	}
}
class Rock extends Atom
{
	Rock(String type)
	{
	System.out.println(type);
	}
}
public class Mountain extends Rock
{
	Mountain()
	{
		super("granite");
		new Rock("granite");
	}

	public static void main(String[] args) 
	{
		new Mountain();
	}
}
