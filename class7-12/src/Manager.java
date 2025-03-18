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
class Employee
{
	private int index;
	Job all[];
	Employee (Job all[])
	{
	this.all=all;
	}
	Job nextJob()
	{
	return all[index++];
	}
	boolean hasJob()
	{
	return index<all.length;
	}
	/*-----------------Subsititute--------------------
	boolean hasJobs()
	{
		if (index !=all.length)
		{
			return true;
		}
		index=0;
		return false;
	}
	*/
}
class Manager
{
	public static void main(String args[])
	{
		Job j1=new Job("Hardware",15000);
		Job j2=new Job("Software",50000);
		Job all[] ={ j1, j2 };
		Employee emp=new Employee(all);
		printJob(emp);
		printJob(emp);
		printJob(emp);
	}
	static void printJob(Employee emp)
	{
		while(emp.hasJob())
		{
			Job j1=emp.nextJob();
			j1.print();
		}
	}
}

