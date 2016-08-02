import java.util.Scanner;

public class f1   
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int a,k=0;
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		for(int i=1;i<=a;i++)
		{
		
			if(a%i==0)
			{
			k++;
			System.out.print(" "+i);
			}
	    }
		System.out.print("\nno of factors:"+k);
     if(k==2){
    	 System.out.print("\nprime");
     }
     else{
    	 System.out.print("\nnot a prime");
     }
    }
}