package TestBase;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Geniric_Methods {
	
	
	public WebDriver driver;
	public void setBrowser(String browserType) throws Exception{
		
		
		if(browserType.equalsIgnoreCase("chrome")){
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Desktop\\selinium\\FrameworkHybrid\\chromedriver.exe");
			 driver = new ChromeDriver();
			 
		}
		else{
			System.out.println("Please enter valid browser type");
		}
		
	}
	public void setUrl(String url){
		driver.get(url);
		
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	}
	public String svalues(String values) throws Exception{
		String val=null;
		File fl=new File ("C:\\Users\\user\\Desktop\\Bitbacket\\SeleniumOne\\Config.properties");
		FileInputStream st=new FileInputStream(fl);
		Properties p=new Properties();
		p.load(st);
		val=p.getProperty(values);
		return val;
		
		
	}
	public void closeBrowser(){
		driver.close();
	}
	public void passData(WebElement element1,WebElement element2,String data1,String data2,WebElement element3){
		element1.sendKeys(data1);
		element2.sendKeys(data2);
		element3.click();
	}

}
