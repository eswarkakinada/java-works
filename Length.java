import java.util.Scanner;

public class Length {

	int ft,inch;
	public void input(){
		 Scanner sc= new Scanner(System.in);
		ft=sc.nextInt();
		inch=sc.nextInt();
			}
	 public void  display(){
		 
		 if(inch>12)
		  { ft+=1;
			  inch-=12;
		  }
			
		 
		 System.out.println("Feet:Inch:"+ft+" :"+inch+" ");
		 }
		 
		 
	 
	 
		 
	 }
	
	

