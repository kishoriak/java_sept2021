import java.util.Date;





public class Account {
  private static int cnt;
  private int id;
  private String name,email;
  private double balance;
  private Date dateOfOpening;
  private static double minbalance;
  static {
	  cnt=10;
	  minbalance=1000;
  }
  
  
  
  //default constructor
 public Account() {
	  id=cnt++;
	  name=null;
	  balance=0.0;
	  email=null;
	  dateOfOpening=null;
	 // this(0,null,0.0,null);
  }
 /*private String getAccountId() {
	return  name.substring(0, 3)+cnt+dateOfOpening.getMonth();
	 
 }*/
  
  //parametrized constructor
 //1 implicit ---this   and 4 explicit
  public Account(String nm,String em,double balance,Date dt) {
	 // this.id= getAccountId(nm,);
	  this.id=cnt++;
	  this.name=nm;
	  this.email=em;
	  this.balance=balance;
	  dateOfOpening=dt;
  }
  
  ///setter and getter methods
 /* public void setId(int id){
	  this.id=id;
  }*/
  
  public int getId() {
	  return id;
  }
  public void setName(String nm){
	  this.name=nm;
  }
  
  public String getName() {
	  return name;
  }
  public void setEmail(String em){
	  this.email=em;
  }
  
  public String getEmail() {
	  return email;
  }
  public void setBalance(double balance){
	  this.balance=balance;
  }
  
  public double getBalance() {
	  return balance;
  }
  public void setDateOfOpening(Date dt){
	  this.dateOfOpening=dt;
  }
  
  public Date getDateOfOpening() {
	  return dateOfOpening;
  }
  
  //display details of accounts in csv format
  public String displayAccount() {
	  return id+","+name+","+balance+","+email+","+dateOfOpening;
  }
  
  //display account details
 public String toString() {
	  //super.toString();
	  System.out.println("in toString method of account");
	  return "Id : "+id+"\nName: "+name+"\nEmail: "+email+"\nBalance: "+balance+"\n opening date :"+dateOfOpening;
  }

public boolean withdrawal(double amt) {
	if(balance-amt>minbalance) {
		balance=balance-amt;
		return true;
	}
	return false;
	
}
 

  
}
