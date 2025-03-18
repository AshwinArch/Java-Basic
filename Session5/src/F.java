class  F
{ 
	int i;
	static int j;
	void print()
	{
	System.out.print(i);
	System.out.print(j);
	}
	public static void main(String[] args) 
	{
		F a1=new F();
		a1.print();
		a1.i=200;
		F.j=400;
		a1.print();
	}
}
