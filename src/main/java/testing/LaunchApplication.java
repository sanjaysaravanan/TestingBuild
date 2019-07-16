package testing;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class LaunchApplication {
	@Test
	public void createLead() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/");
		
		
		driver.manage().window().maximize();
		
		/*WebElement month = driver.findElementById("month");
		
		Select dropdown=new Select(month);
		
		dropdown.selectByVisibleText("Mar");
		Thread.sleep(2000);
		dropdown.selectByValue("5");
		Thread.sleep(2000);
		dropdown.selectByIndex(8);*/
		
		
		
		
		//driver.findElementByLinkText("Forgotten account?").click();
		
		//driver.findElementByPartialLinkText("Forgotten").click();
		
		//driver.findElementByXPath("//input[@id='email']");
		
		/*List<WebElement> link = driver.findElementsByTagName("a");
		
		for (WebElement webElement : link) {
			
			String href = webElement.getAttribute("href");
			System.out.println(href);
		}*/
		
		
		
		driver.findElementById("username").sendKeys("DemoSalesManager");
		
		driver.findElementById("password").sendKeys("crmsfa");
		
		driver.findElementByClassName("decorativeSubmit").click();
		
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Leads").click();
		driver.findElementByLinkText("Create Lead").click();
		
		driver.findElementByXPath("//input[@id='createLeadForm_companyName']").sendKeys("Google");
		driver.findElementByXPath("//input[@id='createLeadForm_firstName']").sendKeys("Sundar");
		driver.findElementByXPath("//input[@id='createLeadForm_lastName']").sendKeys("Pichai");
		//WebElement webElement = driver.findElementById("createLeadForm_dataSourceId");
		Select dropdown = new Select(driver.findElementById("createLeadForm_dataSourceId"));
		dropdown.selectByVisibleText("Employee");
		//Thread.sleep(2000);
		WebElement webElement1 = driver.findElementById("createLeadForm_currencyUomId");
		Select dropdown1 = new Select(webElement1);
		dropdown1.selectByValue("INR");
		//Thread.sleep(2000);
		WebElement webElement2 = driver.findElementById("createLeadForm_industryEnumId");
		Select dropdown2 = new Select(webElement2);
		dropdown2.selectByIndex(2);
		driver.findElementByXPath("//input[@class='smallSubmit']").click();
		
		/*String companyName = driver.findElementByXPath("//span[@id='viewLead_companyName_sp']").getText();
		String firstName = driver.findElementByXPath("//span[@id='viewLead_firstName_sp']").getText();
		String lastName = driver.findElementByXPath("//span[@id='viewLead_lastName_sp']").getText();
		
		if(companyName.contains("Google")){
			System.out.println("Company Test Pass");
		}else
			System.out.println("Company Test Fail");
		
		if(firstName.equals("Sundar")){
			System.out.println("FirstName Test Pass");
		}else
			System.out.println("FirstName Test Fail");
		
		if(lastName.equals("Pichai")){
			System.out.println("LastName Test Pass");
		}else
			System.out.println("LastName Test Fail");*/
		
		/*driver.navigate().to("https://accounts.google.com");
		
		driver.navigate().back();
		
		driver.navigate().forward();
		
		driver.navigate().refresh();
		
		//driver.close();
		*/
	//	driver.quit();
		

	}

}
