
public class TestOverloadingFunction111 {
	//find minimum of 3 numbers
	public static float findMinimum(float num1,float num2,float num3) {
		System.out.println("in findMinimum with float variables");
		
		float min=0;
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
	//find minimum of 3 numbers
		public static float findMinimum(Float num1,Float num2,Float num3) {
			System.out.println("in findMinimum with float objects");
			float min=0;
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
	//finding minimum of 3 numbers
		public static int findMinimum(int num1,int num2,int num3) {
			System.out.println("in findMinimum with int objects");
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
		
		
		
		public static void main(String[] args) {
			System.out.println("Minimum: "+findMinimum((float)23l,(float)10l,(float)45l));
			byte a=23,b=10,c=45;
			byte x=127;
			
			System.out.println("Minimum: "+findMinimum(a,b,c));
			System.out.println("Minimum: "+findMinimum(23f,10f,45f));
			Float f=10.5f;
			Float f1=20f;
			Float f2=20f;
			System.out.println("minimum : "+findMinimum(f,12f,13));
			
			
		}

}
