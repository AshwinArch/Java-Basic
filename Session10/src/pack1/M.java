package pack1;

class M 
{
	class X	{}
	static class Y{}
	public static void main(String[] args) 
	{
		M.X x1=new M().new X();
		M.Y y1=new M.Y();
		System.out.println("Hello World!");
	}
}
