package Test2;



class A 
{
	public static void main(String[] args) 
	{
		int i= -5;
		i= ++i + i-- + --i + i++ + i++;
		System.out.println(++i);
	}
}
