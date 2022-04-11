package package_1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo_1 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\Automation Testing\\New folder\\SS Drivres\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
			
		driver.manage().window().maximize();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");

	}

}
