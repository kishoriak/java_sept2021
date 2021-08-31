import java.util.Scanner;
import java.util.stream.Stream;

public class TestAccountArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("How many accounts you want to create");
		int num=sc.nextInt();
		AccountService.createAccountArray(num);
		int choice=0;
		do {
		System.out.println("1. open a new account\n2. search by id\n3.search by name\n");
		System.out.println("4. display all\n5. withdraw\n6. check balance\n7.deposite\n8.exit\n");
		System.out.println("choice :");
		choice=sc.nextInt();
		switch(choice) {
		case 1:
			int id=AccountService.openAccount();
			System.out.println("The account is opened your id : "+id);
			break;
		case 2:
			System.out.println("enter id to search");
			id=sc.nextInt();
			Account ac=AccountService.searchById(id);
			if(ac!=null) {
				System.out.println(ac);
			}
			else {
				System.out.println("not found");
			}
			
			break;
		case 3:
			System.out.println("enter name to search");
			String name=sc.next();
			boolean check=false;
			Account[] acarr=AccountService.searchByName(name);
			if(acarr.length>0) {
				/*for(int i=0;i<acarr.length;i++) {
					System.out.println(acarr[i]);
				}*/
				
				for(Account ob:acarr) {
					if(ob!=null) {
					  check=true;	
					  System.out.println(ob);
					}
					else
					   break;
				}
				//Stream.of(acarr).forEach(ac1->{System.out.println(ac1);});
				//Stream.of(acarr).filter(ac2->ac2!=null).forEach(System.out::println);
			}
			if(!check) {
				System.out.println("not found");
			}
			break;
		case 4:
			Account[] arr=AccountService.getAll();
			Stream.of(arr).forEach(System.out::println);
			break;
		case 5:
			System.out.println("enetr id");
			id=sc.nextInt();
			System.out.println("enetr amount");
			double amt=sc.nextDouble();
			boolean status =AccountService.withdrawAmount(id,amt);
			if(status) {
				System.out.println("Withdrawal done!!");
			}
			else {
				System.out.println("not found");
			}
			break;
		case 6:
			break;
		case 7:
			break;
		case 8:
			System.out.println("Thank you for using the system, do visit again......");
			//System.exit(0);
			break;
		}
		
		}while(choice!=8);
	}

}
