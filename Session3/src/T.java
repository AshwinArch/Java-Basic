class U
{
	static int i=100;
	static 
	{
		System.out.println("I am in the U-test");
	}
}
		public class T
		{
			static 
			{
				System.out.println("I am in the T-test");
			}
			public static void main(String args[])
			{
			//R.test();
			System.out.println(U.i);
			}

		}