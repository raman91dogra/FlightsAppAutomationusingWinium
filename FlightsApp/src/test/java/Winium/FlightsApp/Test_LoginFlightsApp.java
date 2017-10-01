package Winium.FlightsApp;



import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.winium.DesktopOptions;
import org.openqa.selenium.winium.WiniumDriver;

public class Test_LoginFlightsApp {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		DesktopOptions options = new DesktopOptions(); 
		options.setApplicationPath("C:\\Program Files (x86)\\HP\\Unified Functional Testing\\samples\\Flights Application\\FlightsGUI.exe");
		
		WiniumDriver driver = new WiniumDriver(new URL("http://localhost:9999"), options);
		
		driver.findElement(By.id("agentName")).sendKeys("John");
		driver.findElement(By.id("password")).sendKeys("HP");
		driver.findElement(By.id("okButton")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.name("John Smith"))));
		
		driver.close();
		
	}

}
