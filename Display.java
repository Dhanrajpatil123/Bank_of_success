package BOS_data;

import java.util.ArrayList;
import java.util.List;

import com.mybank_application.CurrentAccount;
import com.mybank_application.SavingAccount;

public class Display extends Bank_Account_Data{

	 public static void displayForSaving( SavingAccount savingAccount){


	        System.out.println("-------------------------");
	        System.out.println("Account Type is : SAVING");
	        System.out.println("-------------------------");
	        System.out.println("Account Number      : "+ savingAccount.getAccountNumber());
	        System.out.println("Account Holder Name : "+ savingAccount.getAccountName());
	        System.out.println("PIN Number          : "+ savingAccount.getPinNumber());
	        System.out.println("Account Balance     : "+ savingAccount.getAccountBalance());
	        System.out.println("Account Privilege   : "+ savingAccount.getPrivilege());
	        System.out.println("Gender              : "+ savingAccount.getGender());
	        System.out.println("Phone Number        : "+ savingAccount.getPhoneNumber());
//	        System.out.println("Account Status : "+ savingAccount.isActive());
	        System.out.println("Activate Date       : "+ savingAccount.getActivatedDate());
	        System.out.println("close Date          : "+ savingAccount.getClosedDate());
	        System.out.println("------------------------------------------------------------------------------");
	    }

	 

	    public static void displayForCurrent(CurrentAccount currentAccount){

	        System.out.println("Account Type is : CURRENT");
	        System.out.println("---------------------------");
	        System.out.println("Account Number      : "+ currentAccount.getAccountNumber());
	        System.out.println("Account Holder Name : "+currentAccount.getAccountName());
	        System.out.println("PIN Number          : "+ currentAccount.getPinNumber());
	        System.out.println("Account Balance     : "+ currentAccount.getAccountBalance());
	        System.out.println("Account Privilege   : "+ currentAccount.getPrivilege());
//	        System.out.println("Account Status : "+ currentAccount.isActive());
	        System.out.println("Company Name        : "+ currentAccount.getCompanyName());
	        System.out.println("Company Website     : "+ currentAccount.getWebsite());
	        System.out.println("Registration Number : "+currentAccount.getRegistrationNumber());
	        System.out.println("Activate date       : "+currentAccount.getActivatedDate());
	        System.out.println("------------------------------------------------------------------------------");
	    }


	    public static void insertData(SavingAccount savingAccount1) {

	        List<SavingAccount> savingAccounts = new ArrayList<>();

	            savingAccounts.add(savingAccount1);

	    }
	    
}
