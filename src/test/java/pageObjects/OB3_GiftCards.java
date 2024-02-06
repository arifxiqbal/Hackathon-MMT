package pageObjects;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import utilities.ExcelUtils;

public class OB3_GiftCards extends BasePage{

	public OB3_GiftCards(WebDriver driver) {
		super(driver);	
	}
	
	String filePath=System.getProperty("user.dir")+"/testData/HackathonData.xlsx";
	
	//locators
	@FindBy(xpath="(//div[@class='card__data'])[1]") WebElement WeddingcardEle;
	@FindBy(xpath="(//div[@class='card__data'])[1]/div/h3") WebElement WeddingcardString;
	
	
	//action methods
	public void selectWeddingCard() throws InterruptedException, IOException
	{
		fluentWait(WeddingcardEle);
		scroll(WeddingcardEle);
		screenShot("MyScreenshots/5.WeddingCard");
	
		System.out.println("Selected "+WeddingcardString.getText());
		System.out.println("------------------------------------");
		ExcelUtils.setcelldata(filePath, "Sheet1", 1, 1, WeddingcardString.getText());
		WeddingcardEle.click();
		
	}

}
