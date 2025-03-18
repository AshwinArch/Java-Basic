package pack3;

import static pack2.A.i;
import static pack2.A.print;
import static pack2.B.j;
import static pack2.C.CON1;
class Manager
{
	public static void main(String[] args) 
	{
		System.out.println(i);
		System.out.println(j);
		pack2.C a=CON1;
		System.out.println(a.ordinal());
		print();
	}
}
