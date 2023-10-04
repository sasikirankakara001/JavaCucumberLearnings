package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

	@Before("@NetBanking")
	public void netBankingSetup() {
		System.out.println("netBankingSetup");
	}
	
	@Before("@Mortgage")
	public void mortgageSetup() {
		System.out.println("MortgageSetup");
	}
	@After
	public void tearDown() {
		System.out.println("clear the entries");
	}
}
