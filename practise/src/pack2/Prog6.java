package Pack2;
class Prog6
{
	static int test(String i)
	{
		try
		{
	//		return 100;
		}
		catch(NumberFormatException ex1)
		{
			return 10;
		}
/*		finally
		{
			return 500;
		}
	*/	
		return 200;
	}
}