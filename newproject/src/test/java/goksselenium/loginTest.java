package goksselenium;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;


public class loginTest {
	
	public WebDriver driver;

@Test
public void loginpage() throws IOException
{

Properties prop=new Properties();
FileInputStream fil=new FileInputStream("//Users//gokuldas//git//newpracticeproject//newproject//src//main//java//goksselenium//testdata.properties");
prop.load(fil);

if(prop.getProperty("browser").equals("chrome"))
{
	driver=new ChromeDriver();
	
}

else if(prop.getProperty("browser").equals("firefox"))
{
	driver=new FirefoxDriver();
	
}
else
{
	driver=new InternetExplorerDriver();
}

driver.get(prop.getProperty("url"));

Utilities uti=new Utilities(driver);
uti.signinbutton().click();
uti.enteruser().sendKeys(prop.getProperty("username"));
uti.enterpass().sendKeys(prop.getProperty("password"));
uti.signinclick().click();
driver.close();
System.out.println("executed");
	
}

}
