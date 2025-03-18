class P
{
	int i=10;
}
class Q extends P
{
	int i=20;
}
public class Zimbo
{
	public static void main(String[] args) 
	{
		P p=new Q();
		System.out.println(p.i);
	}
}
