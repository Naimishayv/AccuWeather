package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testcase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.Accuweather.com/");
		driver.findElement(By.id("txtUsername")).sendKeys("Naimisha");
		driver.findElement(By.id("txtPassword")).sendKeys("Naimisha");
		driver.findElement(By.id("btnLogin")).click();
		driver.quit();
	}

}
