package selenium_programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver","C:\\Users\\Sharayu\\Downloads\\edgedriver_win64 (1)\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		
		// implicit wait
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//a[text()='English (UK)']")).click();
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		WebDriverWait wait = new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@name='firstname']"))).sendKeys("Ravi");

	}

}
