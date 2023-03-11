package automation;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class assignment2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		
		List<WebElement> ele= driver.findElements(By.xpath("//div[@id='pageFooterChildren']//a"));
		ele.size();
		for (WebElement value : ele) 
		{
			String link=value.getText();
			if (link.contains("Create page")) 
			{
				System.out.println(link);
				value.click();
			}
		}

		
	}

}
