package pageObjects;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import testBase.BaseClass;
import utilities.ExcelUtils;


public class OB4_SenderDetails extends OB2_MmtResultPage{

	public OB4_SenderDetails(WebDriver driver) {
		super(driver);
		
	}
	
	String filePath=System.getProperty("user.dir")+"/testData/HackathonData.xlsx";
	
	
	//locators
	@FindBy(xpath="//div[@class='deliver__content']") WebElement scrollToEle;
	@FindBy(xpath="(//div[@class='deliver__wrap'])[1]//li[2]") WebElement sendviaEmail;
	@FindBy(xpath="//input[@name='name']") WebElement recName;
	@FindBy(xpath="//input[@name='mobileNo']") WebElement recMobile;
	@FindBy(xpath="//input[@name='emailId']") WebElement recEmail;
	@FindBy(xpath="//textarea[@name='giftMessage']") WebElement composeMsg;
	
	@FindBy(xpath="//input[@name='senderName']") WebElement senderNameEle;
	@FindBy(xpath="//input[@name='senderMobileNo']") WebElement senderMobileEle;
	@FindBy(xpath="//input[@name='senderEmailId']") WebElement senderEmailEle;
	@FindBy(xpath="//button[contains(text(),'BUY NOW')]") WebElement buynowEle;
	
	@FindBy(xpath="//p[@class='red-text font11 append-top5']") List<WebElement> alertsEle;
	
	@FindBy(xpath="//li[@class='menu_Hotels']") WebElement hotelsELe;
	@FindBy(xpath="//div[@class='hsw_inputBox roomGuests']") WebElement adultsBox;
	@FindBy(xpath="(//div[@class='gstSlct'])[2]") WebElement adultdropBox;
	@FindBy(xpath="//li[@data-cy='GuestSelect$$_323']") List<WebElement> noOfAdultList;
	
	
	
	
	//action methods
	
	public void inputSenderandrecipientsDetails() throws InterruptedException, IOException
	{
		BaseClass bc = new BaseClass();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();",sendviaEmail);

		scroll(scrollToEle);
		
		recName.sendKeys(bc.randomString());
		recMobile.sendKeys(bc.randomNumber());
		recEmail.sendKeys(bc.randomAlphaNumeric());
		
		senderNameEle.sendKeys(bc.randomString());
		senderMobileEle.sendKeys(bc.randomNumber());
		senderEmailEle.sendKeys(bc.randomAlphaNumeric());
		screenShot("MyScreenshots/6.SenderDetails");
		buynowEle.click();
	}
	



	public void getAlertMsg() throws IOException
	{
		String user = "Recipient's alert: ";
		
		int j =1;
		
		for(WebElement alert:alertsEle)
		{
			String alertStr = alert.getText();
			System.out.println(user+alertStr);
			
			ExcelUtils.setcelldata(filePath, "Sheet1", j, 2, user+alertStr);
			j++;
			
			user="Sender's alert: ";
		}
		screenShot("MyScreenshots/7.AlertMessage");
	}
	
	public void goToHotels() throws IOException
	{
		
		scroll(hotelsELe);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", hotelsELe);
		screenShot("MyScreenshots/8.HotelsPage");
	}
	
	public void getNumberOfPeople() throws IOException, InterruptedException
	{	String adult="";
		fluentWait(adultsBox);
		adultsBox.click();
		adultdropBox.click();
		System.out.println("------------------------------------");
		System.out.println("Displaying number of adults");
		System.out.println("------------------------------------");
		int i=1;
		for(WebElement adultNo:noOfAdultList)
		{	adult=adultNo.getText();
			ExcelUtils.setcelldata(filePath, "Sheet1", i, 3, adult);
			System.out.print(adult+",");
			i++;
			
		}
	
		screenShot("MyScreenshots/9.NumberOfPeople");
	
	}

	
	
	
	
	

	
	

}
