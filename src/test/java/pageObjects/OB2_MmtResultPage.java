package pageObjects;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import utilities.ExcelUtils;

public class OB2_MmtResultPage extends OB1_MmtHome{

	public OB2_MmtResultPage(WebDriver driver) {
		super(driver);
		
	}
	
	String filePath=System.getProperty("user.dir")+"/testData/HackathonData.xlsx";
	
	
	//locators
	@FindBy(xpath="//span[@class='checkmarkOuter ']/label[contains(text(),'SUV')]") WebElement suvEle;
	@FindBy(xpath="(//p[@class='font28 latoBlack blackText '])[1]") WebElement lowestPriceEle;
	@FindBy(xpath="//span[@class='chNavText']") WebElement moreEle;
	@FindBy(xpath="(//a[@class='appendBottom5 blackText'])[3]") WebElement giftCardEle;
	
	
	

	
	
	//action methods
	
	public void selectSUV() throws IOException
	{
		fluentWait(suvEle);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", suvEle);
		screenShot("MyScreenshots/2.SUVFilter");
	}
	
	public void selectLowestPrice() throws IOException
	{
		fluentWait(lowestPriceEle);
		System.out.println("------------------------------------");
		System.out.println("Lowest price available: "+lowestPriceEle.getText());
		System.out.println("------------------------------------");
		ExcelUtils.setcelldata(filePath, "Sheet1", 1, 0, lowestPriceEle.getText());
		screenShot("MyScreenshots/3.LowestPrice");
		
	}
	
	public void selectGift() throws IOException
	{

		moreEle.click();
		fluentWait(giftCardEle);
		screenShot("MyScreenshots/4.GiftCards");
		giftCardEle.click();
	}
	
	

}
