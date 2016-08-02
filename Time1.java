
import java.util.Scanner;

public class Time1  {

	
	 int h,m,s ;
	  
	public void input(){
		
		System.out.println("Enter hours:min:Sec");
		Scanner sc=new Scanner(System.in);
		h=sc.nextInt();
		m=sc.nextInt();
		s=sc.nextInt();	}
	
	public void display(){
	  if(s>=60)
	  { m+=1;
		  s-=60;
	  }
	  if(m>=60)
	  {  h+=1;
		  m-=60;
	  }
	 	  System.out.println("H:M:S:"+h+":"+m+":"+s+" ");
	  
	}
	
	
}
	 
