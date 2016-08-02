import java.util.Scanner;

public class trail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		int a,n;
		Scanner sc = new Scanner(System.in);
		a=sc.nextInt();
		n=sc.nextInt();
		switch(a)
		{
		case 1:System.out.print("Monday");
		       break;
		case 2:System.out.print("Tuesday");
	       break;
		case 3:System.out.print("Wednesday");
	       break;
		case 4:System.out.print("Thursday");
	       break;
		case 5:System.out.print("Friday");
	       break;
		case 6:System.out.print("Saturday");
	       break;
		case 7:System.out.print("Sunday");
	       break;
		default :System.out.print("invalid day");
	       break;
		}
		for(int i=1;i<n;i++)
		{
			System.out.print("\n "+i);
			
		}
		
			
		
		
			}

}
