package testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.OB2_MmtResultPage;

public class TC02_MmtResultPageTest extends TC01_MmtHomeTest{

	
	@Test(priority=7,groups = {"regression"})
	public void selectSUVTest() throws IOException
	{
		OB2_MmtResultPage rp = new OB2_MmtResultPage(driver);
		rp.selectSUV();
		logger.info("Selected SUV.");
	}
	
	@Test(priority=8,groups = {"smoke,regression"})
	public void selectLowestPriceTest() throws IOException
	{
		OB2_MmtResultPage rp = new OB2_MmtResultPage(driver);
		rp.selectLowestPrice();
		logger.info("Fetched lowest price.");

	}
	
	@Test(priority=9,groups = {"regression"})
	public void selectGiftTest() throws IOException
	{
		OB2_MmtResultPage rp = new OB2_MmtResultPage(driver);
		rp.selectGift();
		logger.info("Clicked on GiftCards.");
		Assert.assertEquals(driver.getTitle(), "Gift Cards - Buy Gift Vouchers Online in India from MakeMyTrip");
	}
	

	
}
