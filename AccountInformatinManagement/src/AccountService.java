import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class AccountService {
	public static void createAccountArray(int num) {
		AccountDao.createAccountArray(num);
	}
	
	// function to open new account
	public static int openAccount(){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter name");
		String nm=sc.next();
		System.out.println("enter email");
		String em=sc.next();
		System.out.println("enter balance");
		double balance=sc.nextDouble();
		System.out.println("Enetr date of opening(dd/mm/yy");
		String dt=sc.next();
		Date datOfOpening=null;
		try {
			SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yy");
			datOfOpening=sdf.parse(dt);
		}catch(ParseException e) {
			e.printStackTrace();
		}
		Account ob=new Account(nm,em,balance,datOfOpening);
		return AccountDao.createNewAccount(ob);
	}
	
	public static Account searchById(int id) {
		
		return AccountDao.findById(id);
	}
	
	public static Account[] searchByName(String name) {
		return AccountDao.findByName(name);
	}

	public static Account[] getAll() {
		return AccountDao.findAll();
	}

	public static boolean withdrawAmount(int id, double amt) {
		Account ac=searchById(id);
		if(ac!=null) {
			return AccountDao.withdrawAmt(ac,amt);
		}
		return false;
		
		
	}
	
	
	

}
