import java.util.Date;

public class TestAccount {
	static {
		System.out.println("in static testaccount");
	}

	public static void main(String[] args) {
	    Account ob=new Account("Kishori","sdfsfd",2345,new Date());
	    Account ob1=new Account("Revati","dfd",2345,new Date());	
		
		Account ob2=new Account();
		//ob1.setId(2222);
		ob1.setName("Rajan");
		ob1.setBalance(4444);
		ob1.setDateOfOpening(new Date());
		
		System.out.println(ob.displayAccount());
		System.out.println(ob);
		System.out.println(ob1);
		System.out.println(ob2);
		
		System.gc();
		//System.out.println(ob.hashCode());
		//((Account)ob).displayAccount();
	}

}
