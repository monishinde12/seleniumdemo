package day7.PropertyFile;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoBlazePhoneCount
{
	public static void main(String[] args)
	{
		String currentWorkingDir=System.getProperty("user.dir");
		String chromeExePath=currentWorkingDir+"\\Executables\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",chromeExePath);
		WebDriver driver=new ChromeDriver();
		// maximize browser window
		driver.manage().window().maximize();
		// implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		// to enter required application URL use get() of WebDriver interface
		driver.get("https://www.demoblaze.com/");
		
		List<WebElement> deviceName=driver.findElements(By.cssSelector("#tbodyid>div>div>div>h4>a"));
		List<WebElement> deviceprice=driver.findElements(By.cssSelector("#tbodyid>div>div>div>h5"));
		
		for(int i=0;i<deviceName.size();i++) {
			System.out.println(deviceName.get(i).getText()+":"+deviceprice.get(i).getText());
		
	}

}
}
