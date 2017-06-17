import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxDriver.SystemProperty;




public class TestClassSelenium {
	
	public static void main(String[] args) {
		
		//how to verify home page title?? Need to find out
		//how to find select button?? need to find
		
		// Intialize Firefox Driver

		System.setProperty("webdriver.gecko.driver", "E:/Selenium Files/geckodriver-v0.17.0-win64/geckodriver.exe");
		WebDriver frdriver= new FirefoxDriver();
		
		// Intialize Chrome Driver
		
		System.setProperty("webdriver.chrome.driver", "E:/Selenium Files/chromedriver_win32/chromedriver.exe");
		WebDriver chdDriver= new ChromeDriver();
		
		
		// Intialize IE Driver
		
		
		
		frdriver.get("http://newtours.demoaut.com/");
		frdriver.findElement(By.xpath("html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[3]/form/table/tbody/tr[4]/td/table/tbody/tr[2]/td[2]/input")).sendKeys("demo");
		frdriver.findElement(By.xpath("html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[3]/form/table/tbody/tr[4]/td/table/tbody/tr[3]/td[1]/font")).sendKeys("demo");
		frdriver.findElement(By.xpath("html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[3]/form/table/tbody/tr[4]/td/table/tbody/tr[4]/td[2]/div/input")).click();
		
	
		chdDriver.get("http://newtours.demoaut.com/");
		chdDriver.findElement(By.xpath("html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[3]/form/table/tbody/tr[4]/td/table/tbody/tr[2]/td[2]/input")).sendKeys("demo");
		chdDriver.findElement(By.xpath("html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[3]/form/table/tbody/tr[4]/td/table/tbody/tr[3]/td[1]/font")).sendKeys("demo");
		chdDriver.findElement(By.xpath("html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[3]/form/table/tbody/tr[4]/td/table/tbody/tr[4]/td[2]/div/input")).click();
		
	
		
	
	}
	

}
