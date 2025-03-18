package Test1;



class Main 
{
	static public void main(String[] args) 
	{
		int lara;
		int rst;
		int count;
		lara=rst=count=10;
		lara=rst++ + ++count;
		lara=--lara + lara++;
		rst++;
		System.out.println(lara);
		System.out.println(rst);
		System.out.println(count);
		System.out.println(lara+count+rst);
	}
}
