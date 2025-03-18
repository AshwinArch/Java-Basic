package Test2;



class N 
{
	int i;
	static int j;
	N()
	{
		i++;
		j++;
	}
	N(int k)
	{
		i++;
		j++;
	}
}
public class Manager
{
	public static void main(String[] args) 
	{
		N n1=new N();
		N n2=new N();
		System.out.println(n1.i+":"+n2.i+":"+n2.j);
	}
}
