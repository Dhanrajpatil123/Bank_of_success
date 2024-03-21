package BOS_data;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.time.LocalDate;

import com.mybank_application.*;

public class Bank_Account_Data {

	private static final String PREMIUM = null;




	public static void main(String[] args) throws Exception{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		Privilege privilege;
	
		AbstractClass account;
		int choice = 0;
		int accountTypeCh0ice = 0;
		
		SavingAccount saving = new SavingAccount();
		CurrentAccount current = new CurrentAccount();
		
		
		while(true) {
			
			 System.out.println("Press 1 For Open New Account : ");
	         System.out.println("Press 2 For Transfer Details : ");
	         System.out.println("Press 3 For Show saving Account details");
	         System.out.println("Press 4 For Closing Account : ");
	         System.out.println("Press 5 For Show Account Details : ");
	         System.out.println("Pree 6 to exit From The Application : ");

	         
	         choice = Integer.parseInt(br.readLine());
	         
	         
	         if(choice == 1) { // open new account
	        	 
	        	 System.out.println("Which Type Of Account You Want");
	        	 System.out.print("Press 1 For SAVING Account : ");
	        	 System.out.println("\nPress 2 For CURRENT Account : ");
	        	 
	        	  accountTypeCh0ice =  Integer.parseInt(br.readLine());
	        	 
	        	 
	        	 
	        	
	        	 
	             
	             if(accountTypeCh0ice == 1) { 
	            	 
	            
	            	 
	            	 System.out.print("Enter Account Holder Name : ");
//		             String name = br.readLine();
		        	 saving.setAccountName(br.readLine());
		             

		             System.out.print("\nEnter PIN Number : ");
//		             int pin = Integer.parseInt(br.readLine());
		             saving.setPinNumber(Integer.parseInt(br.readLine()));
		             

		             System.out.print("\nEnter Account Balance : ");
//		             double balance = Integer.parseInt(br.readLine());
		             saving.setAccountBalance(Integer.parseInt(br.readLine()));
		             
		             System.out.print("\nEnter Privilege PRIMIUM, for GOLD, SILVER : ");
		             String privilegeChoice = br.readLine();
		             saving.setPrivilege(Privilege.GOLD);
	            	 
	            	 System.out.print("\nEnter Date of Birth : ");
	            	 int year = Integer.parseInt(br.readLine());
	            	 int month = Integer.parseInt(br.readLine());
	            	 int day = Integer.parseInt(br.readLine());
	            	 
//	            	 LocalDate dob = LocalDate.of(year, month, day);
	            	 saving.setDateOfBirth(LocalDate.of(year, month, day));
	            	 
	            	 
	            	 System.out.print("\nGender : ");
//	            	 String gender = br.readLine();
	            	 saving.setGender(br.readLine());
	            	 
	            	 System.out.print("\nEnter phone number : ");
//	            	 String phone = br.readLine();
	            	 saving.setPhoneNumber(Long.parseLong(br.readLine()));
	            	 
	            	 saving.open();
	            	 Display.insertData(saving);
	             }
	             
	             else if(accountTypeCh0ice == 2) {
	            
	            	 current.setAccountNumber(IdGenerator.getAccountNumber());
	            	 
	            	 System.out.print("Enter Account Holder Name : ");
//		             String name = br.readLine();
		        	 current.setAccountName(br.readLine());
		             

		             System.out.print("\nEnter PIN Number : ");
//		             int pin = Integer.parseInt(br.readLine());
		             current.setPinNumber(Integer.parseInt(br.readLine()));
		             

		             System.out.print("\nEnter Account Balance : ");
//		             double balance = Integer.parseInt(br.readLine());
		             current.setAccountBalance(Integer.parseInt(br.readLine()));
		             
		             System.out.print("\nEnter Privilege PRIMIUM, for GOLD, SILVER : ");
		             String privilegeChoice = br.readLine();
		             current.setPrivilege(Privilege.GOLD);
		             
	            	 
	            	 System.out.print("\nEnter company name : ");
	            	 current.setCompanyName(br.readLine());
	            	 
	            	 System.out.print("\nEnter website : ");
	            	 current.setWebsite(br.readLine());
	            	 
	            	 System.out.print("\nEnter registration number : ");
	            	 current.setRegistrationNumber(br.readLine());
	            	 
	            	 current.open();
	            	 Display.insertData(saving);
	             }
	             
	        	 
	         }
	         
	         else if (choice == 2) {  // transfer account
	        	 
	        	 System.out.println("Enter transfer amount : ");
	        	 double transferAmount = Double.parseDouble(br.readLine());
	        	 
	        	 System.out.println("Enter transfer mode :");
	        	 String transferMode = br.readLine();
	        	
	        	  if(accountTypeCh0ice == 1) {
	        		  saving.setActive(true);
	        		  current.setActive(true);
	        		 saving.transferAmount(current, transferAmount, saving.getPinNumber(), transferMode);
	        		 Transfer_Account.addTransferData(saving, current, transferAmount, saving.getPinNumber(), transferMode);
	        	 }
	        	 else if(accountTypeCh0ice == 2) {
	        		 saving.setActive(true);
	        		  current.setActive(true);
	        		 current.transferAmount(saving, transferAmount, current.getPinNumber(), transferMode);
	        	 }
	        	 
	        	 Display.displayForSaving(saving);
	        	 Display.displayForCurrent(current);
	         }
	         
	         
	         else if(choice == 3) {  // show new account data 

	        	 if(accountTypeCh0ice == 1) {
	        		 Display.displayForSaving(saving);
	        	 }
	        	 else if(accountTypeCh0ice == 2) {
	        		 Display.displayForCurrent(current);
	        	 }
	         }
	         
	         else if (choice == 4) { // close account

	        	 if(accountTypeCh0ice == 1) {
	        		 saving.close();
	        	 }
	        	 else if(accountTypeCh0ice == 2) {
	        		 current.close();
	        	 }
	         }
	         
	         
	         else if(choice == 5) {
	        	 Display.displayForSaving(saving);
	        	 Display.displayForCurrent(current);
	         }
	         
	         else if(choice == 6) {
	        	 System.out.println("++++++++++++++++++ Thank You For Using My Bank Application ++++++++++++++++++");
	                break;
	         }
		}
		
	}
	
	
	public static void grtPrivilege(Privilege privilege) {
		
		switch (privilege) {
		
			case PRIMIUN:
				privilege = Privilege.PRIMIUN;
				break;
			
			case GOLD:
				privilege = Privilege.GOLD;
				break;
				
			case SILVER:
				privilege = Privilege.SILVER;
				break;

			default:
				privilege = Privilege.SILVER;
				break;
		}
		
	}
	
	
	
	
public static void grtTransferMode(TransferMode transferMode) {
		
		switch (transferMode) {
		
			case NEFT:
				transferMode = TransferMode.NEFT;
				break;
			
			case IMPS:
				transferMode = TransferMode.IMPS;
				break;
				
			case RTGS:
				transferMode = TransferMode.RTGS;
				break;

			default:
				transferMode = TransferMode.NEFT;
				break;
		}
		
	}
	
	
}
