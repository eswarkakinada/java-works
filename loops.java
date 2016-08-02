import java.util.Scanner;

public class loops
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
       int a,num,ec;
       Scanner sc=new Scanner(System.in);
       num=sc.nextInt();
       ec=0;
       for(a=1;a<=num;a++)
       {
    	   if(a%2==0)
    	   {
    		   ec++;
    		   System.out.print(" "+a);
    	   }
       }
       System.out.println("\n Evens :"+ec);
	}

}
