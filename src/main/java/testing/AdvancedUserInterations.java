package testing;

import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class AdvancedUserInterations {
	@Test
	public void advanceActions() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		/*ChromeOptions ops=new ChromeOptions();
		
		ops.addArguments("--disable-notifications");
		*/
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/droppable/");
		
		//WebElement fra = driver.findElementByXPath("//iframe[@class='demo-frame']");
		
		driver.switchTo().frame(0);
		
		//driver.switchTo().defaultContent();
		
		WebElement item1 = driver.findElementById("draggable");
		WebElement item3 = driver.findElementById("droppable");
		//WebElement item5 = driver.findElementByXPath("//li[text()='Item 5']");
		
		
		//WebElement men = driver.findElementByLinkText("Men");
		//Thread.sleep(1000);
		Actions builder=new Actions(driver);
		
		builder.dragAndDrop(item1, item3).perform();
		
		
		/*Alert alert = driver.switchTo().alert();
		
		alert.sendKeys("testing");
		
		alert.accept();*/
		
		
		//builder.click(item1).keyDown(Keys.CONTROL).click(item3).click(item5).keyUp(Keys.CONTROL).perform();
		
		
		/*builder.moveToElement(driver.findElementByXPath("//a[text()='Men']")).perform();
		
		driver.findElementByLinkText("Jeans").click();*/
		
		

	}

}
