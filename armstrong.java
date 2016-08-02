import java.util.Scanner;

public class armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,num;
		double rem,sum,dc;
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		b=a;
		dc=0;
	for(int i=0 ;i<dc;i++)
	{    while(a>0){
		rem=a%10;
		System.out.print(" "+rem);
        a=a/10;
        dc++;  
	      }    System.out.print("\n Digit count: "+dc);
    sum=0;
    a=b;
    while(a>0){
    	rem=a%10;
    	sum=sum+ Math.pow(rem,dc);
    	a=a/10;
    	     }
 System.out.print("\n sum: "+sum);
 if(b==sum)
	 System.out.print("\n" +b+" is an armstrongg: ");
 else
	 System.out.print("\n" +a+" is not an armstrongg: ");
 
}System.out.print(" "+b);
	
	}
}