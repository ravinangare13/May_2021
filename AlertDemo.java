<<<<<<< HEAD
import java.util.concurrent.TimeUnit;

=======
>>>>>>> main
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertDemo {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sharayu\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();

		
		WebElement AlertButton = driver.findElement(By.xpath("//button[@id='alertButton']"));
		AlertButton.click();
		driver.switchTo().alert().accept();
		
		WebElement TimerAlert = driver.findElement(By.xpath("//button[@id='timerAlertButton']"));
		TimerAlert.click();
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.alertIsPresent()).accept();
		
		WebElement ConfirmButton = driver.findElement(By.xpath("//button[@id='confirmButton']"));
		ConfirmButton.click();
		String alertMessage = driver.switchTo().alert().getText();
		System.out.println(alertMessage);
		driver.switchTo().alert().dismiss();
		
		driver.findElement(By.xpath("//a[@id='close-fixedban']")).click();
		
		WebElement PromptAlert = driver.findElement(By.xpath("//button[@id='promtButton']"));
		PromptAlert.click();
		driver.switchTo().alert().sendKeys("Ravi Nangare");
		driver.switchTo().alert().accept();
		
		driver.navigate().to("https://demoqa.com/frames");
		
		//WebElement Frame1 = driver.findElement(By.id("frame1"));
		//driver.switchTo().frame(Frame1);
		driver.switchTo().frame("frame1");
		//driver.switchTo().frame(1);
		String message = driver.findElement(By.xpath("//h1[@id='sampleHeading'][1]")).getText();
		System.out.println(message);
	}
}
