package stepDefinitions;


import io.cucumber.java.Before;

public class Hooks {

	   @Before("@NetBanking")
	   public void netbanking()
	   {
		   System.out.println("----*********************--------------------");
		   System.out.println("Setup for the net banking ");
	   }
	   
	   @Before("Mobilebanking")
	   public void mobileBanking() {
		   System.out.println("----*********************--------------------");
		   System.out.println("Setup for the mobile banking");
	   }
		
	
}
