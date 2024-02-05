package testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.OB2_MmtResultPage;

public class TC02_MmtResultPageTest extends TC01_MmtHomeTest{

	
	@Test(priority=7,groups = {"sanity,regression"})
	public void selectSUVTest() throws IOException
	{
		OB2_MmtResultPage rp = new OB2_MmtResultPage(driver);
		rp.selectSUV();
	}
	
	@Test(priority=8,groups = {"sanity,regression"})
	public void selectLowestPriceTest() throws IOException
	{
		OB2_MmtResultPage rp = new OB2_MmtResultPage(driver);
		rp.selectLowestPrice();

	}
	
	@Test(priority=9,groups = {"sanity,regression"})
	public void selectGiftTest() throws IOException
	{
		OB2_MmtResultPage rp = new OB2_MmtResultPage(driver);
		rp.selectGift();
		Assert.assertEquals(driver.getTitle(), "Gift Cards - Buy Gift Vouchers Online in India from MakeMyTrip");
	}
	

	
}
