import java.util.Arrays;
import java.util.Optional;
import java.util.stream.Stream;

public class AccountDao {
	private static Account[] accarr;
	private static int cnt;
	static {
		cnt=0;
		
	}
	
	public static void createAccountArray(int num) {
		accarr=new Account[num];
	}
	
	//add acoount object in the array
	public static int createNewAccount(Account ob) {
		accarr[cnt]=ob;
		cnt++;
		return ob.getId();
		
	}
	public static Account findById(int id) {
		/*for(int i=0;i<accarr.length;i++) {
			if(accarr[i].getId()==id)
				return accarr[i];
		}*/
		
		/*for(Account ob:accarr) {
			if(ob.getId()==id) {
				return ob;
			}
		}*/
		
		Optional<Account> optional=Stream.of(accarr).filter(ac->{return ac.getId()==id;}).findFirst();
		if(optional.isPresent()) {
			return optional.get();
		}
		
		
		return null;
		
	}
	
	public static Account[] findByName(String name){
		Account[] temparr=new Account[cnt];
		int j=0;
		for(int i=0;i<cnt;i++) {
			if(accarr[i].getName().equals(name)) {
				temparr[j]=accarr[i];
				j++;
			}
		}
		return temparr;
	}

	public static Account[] findAll() {
		return Arrays.copyOfRange(accarr, 0, cnt);
	}

	public static boolean withdrawAmt(Account ac, double amt) {
		return ac.withdrawal(amt);
	}

}
