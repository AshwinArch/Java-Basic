package pack1;
class Manager7
{
	enum Test
	{
		A, B, C, D;
	}
	public static void main(String[] args) 
	{
		Test all[]=Test.values();
		for(int i=0;i<all.length;i++)
		{
		System.out.println(all[i]);
		}
	}
}
