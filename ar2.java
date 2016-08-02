import java.util.Scanner;

public class ar2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int ar1[],a=0,b=0;
       int ar2[];
       int ar3[];
       ar1=new int[10];
       ar2=new int[5];
       ar3=new int[5];
       Scanner sc=new Scanner(System.in);
       System.out.print("Enter the values");
       
       for(int i=0;i<10;i++)
       {
       ar1[i]=sc.nextInt();
     
       }
	  for(int i=0;i<10;i++){
		  if(i%2==0)
		  {
			  ar2[a]=ar1[i];
			  a=a+1;
		  }
		  else{
			  ar3[b]=ar1[i];
			  b=b+1;
			 
		  }
	  }
	  System.out.print("print array2 ");
	  for(int i=0;i<5;i++)
      {
		  System.out.print(" "+ar2[i]);
    
      }
	  System.out.print("\nprint array3 ");
	  
	  for(int i=0;i<5;i++)
      {
		  System.out.print(" "+ar3[i]);
    
      }
	  System.out.print("\nprint array1 ");
	  for(int i=0;i<10;i++)
      {
		  System.out.print(" "+ar1[i]);
    
      }
	  
	}
	
}
