package Test1;



class Test 
{
	static int i;
	public static void main(String[] args) 
	{
		i++;
		i=i++ + i--;
		++i;
		i=i+i;
		System.out.println(i);
	}
}
