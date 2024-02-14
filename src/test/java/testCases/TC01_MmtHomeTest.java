package testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.OB1_MmtHome;
import testBase.BaseClass;

public class TC01_MmtHomeTest extends BaseClass{

	
	
	
	@Test(priority=1,groups = {"sanity"})
	public void clickOnCabsTest() throws IOException
	{
		OB1_MmtHome mmt = new OB1_MmtHome(driver);
		mmt.clickOnCabs();
		logger.info("Clicked on Cabs.");
	}
	
	@Test(priority=2,groups = {"smoke,sanity"})
	public void inputfromCityTest()
	{
		OB1_MmtHome mmt = new OB1_MmtHome(driver);
		mmt.inputFromCity(p.getProperty("fromCity"));
		logger.info("Entered 'From' city.");
	}
	
	@Test(priority=3,groups = {"smoke,sanity"})
	public void inputToCityTest()
	{
		OB1_MmtHome mmt = new OB1_MmtHome(driver);
		mmt.inputToCity(p.getProperty("toCity"));
		logger.info("Entered 'To' City.");
	}
	
	@Test(priority=4,groups = {"smoke,sanity"})
	public void inputDateTest()
	{
		OB1_MmtHome mmt = new OB1_MmtHome(driver);
		mmt.inputDate();
		logger.info("Entered date.");
	}
	
	@Test(priority=5,groups = {"smoke,sanity"})
	public void inputTimeTest() throws IOException
	{
		OB1_MmtHome mmt = new OB1_MmtHome(driver);
		mmt.inputTime();
		logger.info("Entered Time.");

	}
	
	@Test(priority=6,groups = {"sanity"})
	public void clickOnSearchTest()
	{
		OB1_MmtHome mmt = new OB1_MmtHome(driver);
		mmt.clickOnSearch();
		logger.info("Clicked on Search after filling the details.");
		Assert.assertEquals(driver.getTitle(), "Cabs");
		
	}
	
	
}
