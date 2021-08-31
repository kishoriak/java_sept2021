import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class TestFunctions {
	//find average of 3 numbers
	
	public static void main(String[] args) throws IOException {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int num1=sc.nextInt();
		System.out.println("Enter number");
		int num2=sc.nextInt();
		System.out.println("Enter number");
		int num3=sc.nextInt();
		System.out.println("num1 : "+num1+"  num2: "+num2+" num3: "+num3);
	    /*BufferedReader br=new BufferedReader(new InputStreamReader(System.in)); 
	    String num=br.readLine();*/
		
		//find average of 3 numbers
		//TestOverloading ob=new TestOverloading();
		
		int average=NumberUtility.findAverage(num1,num2,num3);
		
		// find factorial of minimum number
		int min=NumberUtility.findMinimum(5,23,45);
		///finding factorial
		int factorial=NumberUtility.findFactorial(min);
		///3 more 
		//accept 2 numbers and find permutation and combination
		 num1=sc.nextInt();
	     num2=sc.nextInt();
	     float ans=NumberUtility.findPermutation(num1,num2);
	     
		
		//(npr===n!/(n-r)!
		//ncr===(n!/(r!(n-r!))
		
		
		
		
		
	    
	}

}
