package jse.training.interfaces;

public interface Services {
	
	Services()
	{
		
	}
   int bankRegisterId=123456;
   //Abstract methods are allowed
	 void withdraw();
	 void deposite();
	 void changePin();
	 void printStatement();
	 void createAccount();
	 void fetchAccountDetails();
	 void updateAccountInfo();
	/*
	 * 
	 *  Concrete methods are not allowed
	 *  
	 *  public void print()
	 *  {
	 *  }
	 */
//Static and Default methods are allowed in Java8	 
	 public static String IFSCCode()
	 {
		 return "ICIC140087";
	 }
	 
	 
	 default public void licenseRenewedOn()
	 {
		 System.out.println("2024 JAN");
	 }
	 
	 
	 
	 private void auditReport()
	 {
		 
	 }
	 
	 
}
