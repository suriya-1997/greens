package org.all;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Drone {

	public static void main(String[] args) throws InterruptedException, IOException, AWTException {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	
	
	
	driver.get("https://www.wix.com/demone2/drones-and-action-ca");
	//driver.manage().window().minimize();
	
//it shows mailid
	WebElement name=driver.findElement(By.xpath("//input[@name='email']"));
	name.sendKeys("suriyastarkeee@gmail.com");
	Thread.sleep(3000);
	// three second later it click ok button
	WebElement click =driver.findElement(By.xpath("//button[@class='_1fbEI']"));
	click.click();
	
	 JavascriptExecutor jse =(JavascriptExecutor) driver;
	    // Scroll Down
	    jse.executeScript("window.scrollBy(0,1500);");
	 Thread.sleep(2000);
	//windows handle it clicks drone 
	 WebElement click1=driver.findElement(By.id("comp-jcfv4kob2label"));
	Thread.sleep(7000);
	 JavascriptExecutor executor = (JavascriptExecutor)driver;
	 executor.executeScript("arguments[0].click();", click1);
     Set<String> windowHandles = driver.getWindowHandles();
	System.out.println(windowHandles);
	
	//screenshot
	TakesScreenshot screenshot=(TakesScreenshot) driver;
	File sourcefile=screenshot.getScreenshotAs(OutputType.FILE);
	File destinationFile = new File("D:\\first.jpg");
	FileHandler.copy(sourcefile, destinationFile);
	
	
	 JavascriptExecutor js = (JavascriptExecutor)driver;
	 js.executeScript("document.getElementById(\"input_comp-juuvwu09\").setAttribute('style', 'border:4px solid blue;background:yellow');");
	 
	//robot class
	//Robot ref = new Robot();
	//Thread.sleep(3000);
	
	//for (int i=0 i<7; i++) {
		//ref.keyPress(KeyEvent.VK_TAB);
		//ref.keyRelease(KeyEvent.VK_TAB);
	
	}
	
	
	
	
	
	
	
	

}
