package pageObjects;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OB1_MmtHome extends BasePage{

	public OB1_MmtHome(WebDriver driver) {
		super(driver);
		
	}
	
	
	//locators 
	@FindBy(xpath="//li[@class='menu_Cabs']") WebElement cabsButtonEle;
	@FindBy(id="fromCity") WebElement frombuttonEle;
	@FindBy(xpath="//input[@title='From']") WebElement fromInputBoxEle;
	@FindBy(xpath="//span[contains(text(),'Delhi')]") WebElement DelhiEle;
	@FindBy(id="toCity") WebElement tobuttonEle;
	@FindBy(xpath="//input[@title='To']") WebElement toInputBoxEle;
	@FindBy(xpath="//span[starts-with(text(),'Manali, Himachal Pradesh, India')]") WebElement ManaliEle;
	

	@FindBy(xpath="//div[@class='DayPicker-NavBar']/span[2]") WebElement nextmonthEle;
	@FindBy(xpath="//div[contains(@aria-label,'Sun Mar 31 2024')]") WebElement march31Ele;;
	
	@FindBy(xpath="//span[contains(text(),'06  Hr')]") WebElement hourEle;;
	@FindBy(xpath="//span[contains(text(),'30  min')]") WebElement minEle;
	@FindBy(xpath="(//span[contains(text(),'AM')])[2]") WebElement amEle;
	@FindBy(xpath="//span[@class='applyBtnText']") WebElement applyEle;
	
	@FindBy(xpath="//p[@class='makeFlex vrtlCenter']/a") WebElement searchBttnEle;
	
	
	//ad handle
	@FindBy(xpath="//a[@id='webklipper-publisher-widget-container-notification-close-div']") WebElement closeAd;
	
	@FindBy(xpath="//iframe[@id='webklipper-publisher-widget-container-notification-frame']") WebElement adFrame;
	

	
	
	
	
	//action methods
	
	public void clickOnCabs()
	{
		try {
		fluentWait(adFrame);		
		driver.switchTo().frame(adFrame);		
		closeAd.click();		
		}catch(Exception e) {}
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", cabsButtonEle);	
		

	}
	
	public void inputFromCity(String fromCity)
	{
		frombuttonEle.click();		
		fromInputBoxEle.sendKeys(fromCity);		
		fromInputBoxEle.sendKeys(Keys.RETURN);
		fluentWait(DelhiEle);
		DelhiEle.click();
	}
	
	public void inputToCity(String toCity)
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", tobuttonEle);

		toInputBoxEle.sendKeys(toCity+Keys.ENTER);
		fluentWait(ManaliEle);
		ManaliEle.click();
		
		
	}
	
	public void inputDate()
	{
		// fluentWait(nextmonthEle);
		// nextmonthEle.click();
		fluentWait(march31Ele);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", march31Ele);
	}
	
	public void inputTime() throws IOException
	{
		fluentWait(hourEle);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("arguments[0].click();", hourEle);
//		hourEle.click();
		fluentWait(minEle);
		js.executeScript("arguments[0].click();", minEle);
//		minEle.click();
		js.executeScript("arguments[0].click();", amEle);
//		amEle.click();
		js.executeScript("arguments[0].click();", applyEle);
//		applyEle.click();
		screenShot("MyScreenshots/1.TripDetails");
	}
	
	public void clickOnSearch()
	{
		searchBttnEle.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
