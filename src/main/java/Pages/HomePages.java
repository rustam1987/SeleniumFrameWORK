package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePages {
private WebDriver driver;
public HomePages(WebDriver driver){
	this.driver=driver;
	PageFactory.initElements(driver, this);
}
@FindBy(xpath="//*[@id='nav-link-accountList']/span[1]")
 WebElement signIn;
@FindBy(id="twotabsearchtextbox")
WebElement searchhBox;
@FindBy(xpath="//*[@id='a-page']/div[1]/div[3]/div/div/form/div/div/div/h1")
WebElement validateHeader;


@FindBy(xpath="//*[@id='ap_email']")
public WebElement username;

@FindBy(id="ap_password")
public WebElement password;
@FindBy(id="signInSubmit")
public WebElement signInSubmit;




public void signIn(){
	signIn.click();
}
public void search(String name){
	searchhBox.sendKeys(name);
	
}
public String getText(){
	String text=validateHeader.getText();

	return text;
}
}
