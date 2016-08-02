import java.util.Scanner;

public class factors {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
       int a,i,ec=0,sum=0;
       Scanner sc=new Scanner(System.in);
       a=sc.nextInt();
       for(i=1;i<=a;i++)
       { 
    	   if(a%i==0)
    	   {       
    	   ec++;
    	   sum=sum+i;
    	   System.out.print(" "+i);
    	   }
       }
       System.out.print("\n no offactors of given number: "+ec);
       System.out.print("\n total of factors: "+sum);
       

	if(ec==2){
       System.out.print(" given number is prime");
       
         }
	else{
		System.out.print("\n not a prime");
	  }
	}
}