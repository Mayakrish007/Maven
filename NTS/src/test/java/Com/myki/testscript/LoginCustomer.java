package Com.myki.testscript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class LoginCustomer {
	@Test
public void main() {
	WebDriver driver= new ChromeDriver();
	driver.get("https://maven.apache.org/surefire/maven-surefire-plugin/examples/testng.html");
	String tit = driver.getTitle();
	Reporter.log(tit);
	driver.quit();
}
}
