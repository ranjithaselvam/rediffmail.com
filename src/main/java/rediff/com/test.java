package rediff.com;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class test {
	@Test
	public void run() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ranjitha.selvam\\eclipse-workspace\\rediff\\lib\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		try {
			assertTrue(driver.getTitle().contains("Rediffmail"));
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[3]/td[3]/input")).sendKeys("ranjitha");
		driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[7]/td[3]/input[1]")).sendKeys("ranjitha.selvam");
		driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[7]/td[3]/input[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[9]/td[3]/input")).sendKeys("ranjithaslvam");
		driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[11]/td[3]/input")).sendKeys("ranjithaslvam");
		
		driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[15]/td[2]/table/tbody/tr/td[1]/input")).click();
		WebElement findElement1 = driver
				.findElement(By.xpath("//*[@id=\"div_hintQS\"]/table/tbody/tr[2]/td[3]/select"));
		Select s1 = new Select(findElement1);
		s1.selectByValue("What is your favourite food?");
		driver.findElement(By.xpath("//*[@id=\"div_hintQS\"]/table/tbody/tr[4]/td[3]/input")).sendKeys("curd rice");
		driver.findElement(By.xpath("//*[@id=\"div_hintQS\"]/table/tbody/tr[6]/td[3]/input")).sendKeys("mallieswari");
		driver.findElement(By.xpath("//*[@id=\"mobno\"]")).sendKeys("7558106561");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("scrollBy(0, 4500)");
		WebElement findElement2 = driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[1]"));
		Select s2 = new Select(findElement2);
		s2.selectByIndex(5);
		WebElement findElement3 = driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[2]"));
		Select s3 = new Select(findElement3);
		s3.selectByIndex(5);
		WebElement findElement4 = driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[3]"));
		Select s4 = new Select(findElement4);
		s4.selectByIndex(5);
		driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[24]/td[3]/input[2]")).click();
		WebElement findElement5 = driver.findElement(By.xpath("//*[@id=\"country\"]"));
		Select s5 = new Select(findElement5);
		s5.selectByIndex(5);
		
		driver.findElement(By.xpath("//*[@id=\"Register\"]")).click();

		Alert a=driver.switchTo().alert();
		System.out.println(a.getText());
		a.accept();
		driver.close();

	}

}
