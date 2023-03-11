package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FaceBook {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Sanjeet");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Kumar");
		
		
		driver.findElement(By.xpath("//input[@aria-label='Mobile number or email address']")).sendKeys("975132121");
		driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("Abcd1234");
		
		// Select Element
		WebElement dayDropDwon=driver.findElement(By.xpath("//select[@name='birthday_day']"));
		Select day=new Select (dayDropDwon);
		day.selectByValue("20");
		
		WebElement montDropDown=driver.findElement(By.xpath("//select[@id='month']"));
		Select month= new Select (montDropDown);
		month.selectByValue("4");
		
		WebElement yearDropDown=driver.findElement(By.xpath("//select[@id='year']"));
		Select year=new Select(yearDropDown);
		year.selectByValue("1997");
		
		driver.findElement(By.xpath("//input[@value='2']")).click();
		driver.findElement(By.xpath("//button[text()='Sign Up']"));
		Thread.sleep(5000);
		
		driver.close();
		
		
		
		

	}

}
