import java.util.Scanner;

public class prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int a,sum,i,j;
     Scanner sc=new Scanner(System.in);
     a=sc.nextInt();
     for(j=1;j<=a;j++)
     { sum=0;
    	 for( i=1;i<=j;i++)
     {
    	 if(j%i==0){
    		 sum=sum+1;
    	 }
    		 
    		
     }
     if(sum==2)
			
		 System.out.print(" "+ j);
     }

}
}