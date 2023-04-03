package jpMavenGitHubJenkinsParameterizedTest6Pkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JenkinsParameters 

{
@Test
public void m1()
{
	WebDriver driver = null;
	String BROWSER = System.getProperty("browser");
	String URL = System.getProperty("url");
	System.out.println(BROWSER);
	if(BROWSER.equalsIgnoreCase("browser"))
	{
		WebDriverManager.chromedriver().setup();
		driver = new EdgeDriver();
		
	}
	else if(BROWSER.equalsIgnoreCase("firefox")) 
		
	{
		WebDriverManager.firefoxdriver().setup();
		driver= new FirefoxDriver();
	}
	
	driver.get(URL);
	
}
}
