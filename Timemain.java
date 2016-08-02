

import java.util.Scanner;

public class Timemain {

	public static void main(String[] args) {
		
		int  h,m,s;
		
		
	//	Time1 t1 = new Time1();
	//	t1.input();
		//	t1.display();
		
		
		Time1[] a= new Time1[3];
		
		
		for ( int i=0;i<3;i++)
		{
			a[i]=new Time1();
			a[i].input();
		     
		
		}
		for (int i=0;i<3;i++)
		{
		a[i].display();
		}
		
	}
		

}
