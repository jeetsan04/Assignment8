package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class assignment8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		String text1= driver.findElement(By.xpath("//font[text()='Facebook helps you build rapport with fellow human beings.']")).getText();
		
		boolean result=text1.contains("Facebook helps you build rapport with fellow human beings.");
		System.out.println(result);

	}

}
