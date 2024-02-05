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
	
//	@FindBy(xpath="(//div[contains(text(),'23')])[2]") WebElement feb23;
	@FindBy(xpath="//div[@class='DayPicker-NavBar']/span[2]") WebElement nextmonthEle;
	@FindBy(xpath="//div[contains(@aria-label,'Sun Mar 31 2024')]") WebElement march31Ele;;
	
	@FindBy(xpath="//span[contains(text(),'06  Hr')]") WebElement hourEle;;
	@FindBy(xpath="//span[contains(text(),'30  min')]") WebElement minEle;
	@FindBy(xpath="(//span[contains(text(),'AM')])[2]") WebElement amEle;
	@FindBy(xpath="//span[@class='applyBtnText']") WebElement applyEle;
	
	@FindBy(xpath="//p[@class='makeFlex vrtlCenter']/a") WebElement searchBttnEle;
	

	
	
	
	
	//action methods
	
	public void clickOnCabs()
	{
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
//		fluentWait(feb23);
//		feb23.click();
		fluentWait(nextmonthEle);
		nextmonthEle.click();
		fluentWait(march31Ele);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", march31Ele);
	}
	
	public void inputTime() throws IOException
	{
		fluentWait(hourEle);
		hourEle.click();
		fluentWait(minEle);
		minEle.click();
		amEle.click();
		applyEle.click();
		screenShot("MyScreenshots/1.TripDetails");
	}
	
	public void clickOnSearch()
	{
		searchBttnEle.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
