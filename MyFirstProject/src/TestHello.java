
public class TestHello {

	public static void main(String[] args) {
		System.out.println("Hello World!!");
		int sum=0;
		for(int i=0;i<args.length;i++) {
			sum+=Integer.parseInt(args[i]);
			
		}
         System.out.println("Addition : "+sum);
	}

}
