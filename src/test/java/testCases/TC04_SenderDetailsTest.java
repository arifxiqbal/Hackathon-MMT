package testCases;

import java.io.IOException;

import org.testng.annotations.Test;

import pageObjects.OB4_SenderDetails;

public class TC04_SenderDetailsTest extends TC03_GiftCardsTest{

	@Test(priority=11,groups = {("regression")})
	public void inputSenderandrecipientsDetailsTest() throws InterruptedException, IOException
	{
		OB4_SenderDetails sd = new OB4_SenderDetails(driver);
		sd.inputSenderandrecipientsDetails();
		logger.info("Filled up sender's and recipient's details.");
	}
	

	
	@Test(priority=12,groups = {"smoke,regression"})
	public void getAlertMsgTest() throws IOException
	{
		OB4_SenderDetails sd = new OB4_SenderDetails(driver);
		sd.getAlertMsg();
		logger.info("Fetched Alert message.");
	}
	
	@Test(priority=13,groups = {"regression"})
	public void goToHotelsTest() throws IOException
	{
		OB4_SenderDetails sd = new OB4_SenderDetails(driver);
		sd.goToHotels();
		logger.info("Directed to Hotels page.");
	}
	
	@Test(priority=14,groups = {"smoke,regression"})
	public void getNumberOfPeopleTest() throws IOException, InterruptedException
	{
		OB4_SenderDetails sd = new OB4_SenderDetails(driver);
		sd.getNumberOfPeople();
		logger.info("Fetched number of adults.");
	}
	
	
	
	
	
}
