package pack1;

public class Manager6
{
	enum Months
	{
		Jan(31), Feb(28), Mar(31);
		int days;
		Months(int days)
		{
			this.days=days;
		}
	}
	public static void main(String[] args) 
	{
		Months a1=Months.Jan; 
		System.out.println(a1);
		System.out.println(a1.days);
		Months a3=Months.Mar; 
		System.out.println(a3);
		System.out.println(a3.days);
		Months a2=Months.Feb; 
		System.out.println(a2);
		System.out.println(a2.days);
		
		/*System.out.println("---------");
		Enum4 a2=Enum4.A;
		System.out.println(a2);
	*/
	}
}
