
public class NumberUtility {
	public static int findAverage(int num1,int num2,int num3) {
		int sum=(num1+num2+num3);
		int average=sum/3;
		return average;
	}
	
	//finding minimum of 3 numbers
	public static int findMinimum(int num1,int num2,int num3) {
		int min=0;
		if((num1<num2) && (num1<num3)) {
			min=num1;
		}
		else if((num2<num1) && (num2<num3)){
			min=num2;
		}
		else {
			min=num3;
			
		}
		return min;
	}
	
	//calculate factorial of a number
	public static int findFactorial(int num) {
		int fact=1;
		for(int i=2;i<=num;i++) {
			fact*=i;
		}
		return fact;
		
	}
	//find permutation of 2 numbers
	public static float findPermutation(int n,int r) {
		return findFactorial(n)/findFactorial(n-r);
	}

	//find permutation of 2 numbers
		public float findCombination(int n,int r) {
			return findFactorial(n)/(findFactorial(n-r)*findFactorial(r));
		}
		
		
}
