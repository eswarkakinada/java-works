import java.util.Scanner;

public class ifconditions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b;
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
	
        if(a>b)
        {
        	System.out.print("\n a is large : "+a);
        }
        else{
        	System.out.print("\n b is large : "+b);
        }
	}

}
