class Job 
{
	String title;
	double salary;
	Job(String title, double salary)
	{
	this.title=title;
	this.salary=salary;
	}
	void print()
	{
	System.out.println(title + " : " + salary);
	}
}
class Iterator1
{
	Job all[];
	private int index;
	Iterator1(Job all[])
	{
		this.all=all;
	}
	Job nextJob()
	{
		return all[index++];
	}
	boolean hasNext()
	{
		return index<all.length;
	}
}
class Employee
{
	Job all[];
	Employee (Job all[])
	{
	this.all=all;
	}
	Iterator1 getIterator1()
	{
	return new Iterator1(all);
	}
}
class Manager1
{
	public static void main(String args[])
	{
		Job j1=new Job("Hardware",15000);
		Job j2=new Job("Software",50000);
		Job all[] ={ j1, j2 };
		Employee emp=new Employee(all);
		printJob(emp);
		System.out.println("----------");
		printJob(emp);
		System.out.println("----------");
		printJob(emp);
	}
	static void printJob(Employee emp)
	{
		Iterator1 it1=emp.getIterator1();
		Job j1=null;
		while(it1.hasNext())
		{
			j1=it1.nextJob();
			j1.print();
		}
	}
}

