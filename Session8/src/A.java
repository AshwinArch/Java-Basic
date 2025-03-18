enum Days
	{
		MON, TUE, WED, THURS, FRI, SAT, SUN;
	}
enum Months
	{
		JAN, FEB, MAR, APR, MAY, JUN, JUL, AUG, SEP, OCT, NOV, DEC;
	}
enum Genders
	{
		MALE, FEMALE;
	}
enum Educations
	{
		DEGREE, MASTER_DEGREE;
	}
class A
{
	public static void main(String[] args) 
	{
		Days d1=Days.MON;
		Months m1=Months.FEB;
		Months m2=Months.OCT;
		Educations e1= Educations.DEGREE;
		System.out.println(d1);
		System.out.println(m1);
		System.out.println(m2);
		System.out.println(e1);
	}
}
