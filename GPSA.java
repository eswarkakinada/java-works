import java.util.Scanner;

public class GPSA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  int m1,m2,m3,m4,m5,tot;
		  float k;
		  Scanner sc=new Scanner(System.in);
		  m1=sc.nextInt();
		  m2=sc.nextInt();
		  m3=sc.nextInt();
		  m4=sc.nextInt();
		  m5=sc.nextInt();
		  if(m1>34&&m2>34&&m3>34&&m4>34&&m5>34)
		  {
			  System.out.print("\nstudent passed");
			  tot=m1+m2+m3+m4+m5;
			   k = (tot)/5;
			   System.out.print("\ntotal marks: "+tot); 
			   System.out.print("\nAverge: "+k);
			   if(k>90)
			   {
				   System.out.print("\nGrade :A");}
				   else if(k>80)
				   { System.out.print("\nGrade B");
			   }
				   else if(k>70)
				   { System.out.print("\nGrade C");
			   } else if(k>60)
			   { System.out.print("\nGrade D");
		   }
			   else
			   { System.out.print("\nGrade E");
		   }
			   
			          			  
		  }
		  else
		  {
			  System.out.print("\nstudent failed");
		  }
				
	}

}
