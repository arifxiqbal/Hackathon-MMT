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
	}
	
	@Test(priority=2,groups = {"sanity"})
	public void inputfromCityTest()
	{
		OB1_MmtHome mmt = new OB1_MmtHome(driver);
		mmt.inputFromCity(p.getProperty("fromCity"));
	}
	
	@Test(priority=3,groups = {"sanity"})
	public void inputToCityTest()
	{
		OB1_MmtHome mmt = new OB1_MmtHome(driver);
		mmt.inputToCity(p.getProperty("toCity"));
	}
	
	@Test(priority=4,groups = {"sanity"})
	public void inputDateTest()
	{
		OB1_MmtHome mmt = new OB1_MmtHome(driver);
		mmt.inputDate();
	}
	
	@Test(priority=5,groups = {"sanity"})
	public void inputTimeTest() throws IOException
	{
		OB1_MmtHome mmt = new OB1_MmtHome(driver);
		mmt.inputTime();

	}
	
	@Test(priority=6,groups = {"sanity"})
	public void clickOnSearchTest()
	{
		OB1_MmtHome mmt = new OB1_MmtHome(driver);
		mmt.clickOnSearch();
		Assert.assertEquals(driver.getTitle(), "Cabs");
	}
	
	
}
