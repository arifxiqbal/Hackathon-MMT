package pageObjects;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OB3_GiftCards extends BasePage{

	public OB3_GiftCards(WebDriver driver) {
		super(driver);	
	}
	
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
		WeddingcardEle.click();
		
	}

}
