package day5;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ex3 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(co);
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		WebElement txtbox=driver.findElement(By.name("cusid"));
		WebElement button=driver.findElement(By.name("submit"));
		txtbox.sendKeys("401");
		button.click();
		Alert alert1=driver.switchTo().alert();
		alert1.dismiss();
		txtbox.clear();
		txtbox.sendKeys("402");
		button.click();
		Alert alert2=driver.switchTo().alert();
		alert2.accept();
		Alert alert3=driver.switchTo().alert();
		String txt=alert3.getText();
		alert3.accept();
	}

}
