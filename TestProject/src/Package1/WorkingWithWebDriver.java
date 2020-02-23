package Package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WorkingWithWebDriver {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.gecko.driver", "./exefiles/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.cengage.com/mindtap/");
		String title= driver.getTitle();//getTitle method is used for write the title of the web page.
		System.out.println(title);
		String htmlsrc= driver.getPageSource();//to write the pagesource.
		System.out.println(htmlsrc);
		driver.findElement(By.linkText("Contact")).click();
		String url=driver.getCurrentUrl();
		System.out.println(url);
		

	}

}
