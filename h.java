import java.util.Scanner;

public class h {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int a,b;
       System.out.println("enter values of a,b:");
      Scanner sc=new Scanner(System.in);
   
      a=sc.nextInt(); 
      b=sc.nextInt();
      System.out.print("a:"+a);
      System.out.print("\nb:"+b);
      System.out.print("\nsum: "+(a+b));
      System.out.print("\nmultiplication: "+(a*b));
      System.out.print("\ndivision: "+(a/b));
      System.out.print("\nreminder: "+(a%b));
    
sc.close();	}

}
