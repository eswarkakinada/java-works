import java.util.Scanner;

public class a12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[]ar1;//variable declaration
	       ar1= new int[10];
	       int i;
	       Scanner sc= new Scanner(System.in);
	       System.out.print("enter 10 numbers");
	     
	       for(i=0;i<10;i++)
	       { 
	    	   ar1[i]=sc.nextInt();
	    	
	       }
	    	 for(int x:ar1){
	    		 System.out.print(" "+x);
	    	 }
	    	 
	       System.out.print("\nEntered vales:");
	    	   for(i=0;i<10;i++)
	    	   {
	    		   System.out.print("  " +ar1[i]);
		       }
	    	   System.out.print("\nEntered value inn reverse: ");
	           for(i=9;i>=0;i--){
	        	  System.out.print( "  " +ar1[i]);
	           }
	}

}
