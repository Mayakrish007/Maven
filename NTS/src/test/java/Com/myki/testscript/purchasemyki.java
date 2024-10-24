package Com.myki.testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class purchasemyki {
	@Test
	public static void test() {
		
WebDriver driver= new ChromeDriver();
driver.get("https://www.ptv.vic.gov.au/tickets/myki");
String text = driver.findElement(By.xpath("//h1[text()='myki']")).getText();
Reporter.log(text);

}
}
