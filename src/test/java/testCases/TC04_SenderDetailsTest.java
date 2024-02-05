package testCases;

import java.io.IOException;

import org.testng.annotations.Test;

import pageObjects.OB4_SenderDetails;

public class TC04_SenderDetailsTest extends TC03_GiftCardsTest{

	@Test(priority=11,groups = {("regression")})
	public void inputSenderDetailsTest() throws InterruptedException, IOException
	{
		OB4_SenderDetails sd = new OB4_SenderDetails(driver);
		sd.inputSenderandrecipientsDetails();
	}
	

	
	@Test(priority=12,groups = {"regression"})
	public void getAlertMsgTest() throws IOException
	{
		OB4_SenderDetails sd = new OB4_SenderDetails(driver);
		sd.getAlertMsg();
	}
	
	@Test(priority=13,groups = {"sanity,regression"})
	public void goToHotelsTest() throws IOException
	{
		OB4_SenderDetails sd = new OB4_SenderDetails(driver);
		sd.goToHotels();
	}
	
	@Test(priority=14,groups = {"sanity,regression"})
	public void getNumberOfPeopleTest() throws IOException, InterruptedException
	{
		OB4_SenderDetails sd = new OB4_SenderDetails(driver);
		sd.getNumberOfPeople();
	}
	
	
	
	
	
}
