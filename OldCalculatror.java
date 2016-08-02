import java.util.Scanner;

public class OldCalculatror {
	private int a,b;
	public  OldCalculatror()
	{
		a=10;
		b=5;
	}
	
	public void input(){
     Scanner sc= new Scanner(System.in);
     a=sc.nextInt();
     b=sc.nextInt();
	}
	 public OldCalculatror (int x,int y){
		 a=x;
		 b=y;
	 }
	
	
	
	
	public void add()
	{
     System.out.println("add:" +(a+b));
}
	public void sub()
	{
     System.out.println("sub:" +(a-b));
}
}

