package corejava.basicprogrms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FbLogin {

	public static void main(String[] args) 
	{
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://gmail.com");
		driver.findElement(By.id("Email")).sendKeys("snehagajjam07@gmail.com");
		driver.findElement(By.id("next")).click();
		driver.findElement(By.id("Passwd")).sendKeys("enter1995");
		driver.findElement(By.id("signIn")).click();

	}

}
