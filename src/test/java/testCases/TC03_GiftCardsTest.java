package testCases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.OB3_GiftCards;

public class TC03_GiftCardsTest extends TC02_MmtResultPageTest{

	
	@Test(priority=10,groups = {"regression"})
	public void selectWeddingCardTest() throws InterruptedException, IOException
	{
		OB3_GiftCards gc = new OB3_GiftCards(driver);
		gc.selectWeddingCard();
		String wedCard = driver.findElement(By.xpath("//li[@class='current']/a")).getText();
		Assert.assertEquals(wedCard, "Wedding Gift Card");
	}
	
}
