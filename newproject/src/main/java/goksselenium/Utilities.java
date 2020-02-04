package goksselenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Utilities {
	
WebDriver driver;

public Utilities (WebDriver driver)
{
this.driver=driver;
PageFactory.initElements(driver, this);

}

@FindBy(css="a.signin")
WebElement signin;

@FindBy(id="login1")
WebElement username;
	
@FindBy(id="password")
WebElement password;

@FindBy(name="proceed")
WebElement loginbutton;

public WebElement signinbutton()
{
	return signin;
}

public WebElement enteruser()
{
	return username;
}

public WebElement enterpass()
{
	return password;
}

public WebElement signinclick()
{
	return loginbutton;
}


}
