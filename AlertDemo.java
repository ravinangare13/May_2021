import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://demoqa.com/alerts");
		
		WebElement AlertButton=driver.findElement(By.xpath("//button[@id='alertButton']"));
		AlertButton.click();
		driver.switchTo().alert().accept();
		
		WebElement TimeAlert=driver.findElement(By.xpath("//button[@id='timerAlertButton']"));
		TimeAlert.click();
				
		WebDriverWait wait=new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.alertIsPresent()).accept();
				
		WebElement ConfirmButton=driver.findElement(By.xpath("//button[@id='confirmButton']"));
		ConfirmButton.click();
		String AlertMessage= driver.switchTo().alert().getText();
		System.out.println(AlertMessage);
		driver.switchTo().alert().dismiss();
		
		//to close the ad
		driver.findElement(By.xpath("//a[@id='close-fixedban']")).click();
		WebElement PromptButton=driver.findElement(By.xpath("//button[@id='promtButton']"));
		PromptButton.click();
		driver.switchTo().alert().sendKeys("Anand");
		driver.switchTo().alert().accept();
		
		//Search frame using iframe Switch to frame and find element and perform operation
		driver.navigate().to("https://demoqa.com/frames");
		WebElement Frame1=driver.findElement(By.id("frame1"));
		driver.switchTo().frame(Frame1);
		String Message=driver.findElement(By.xpath("//h1[@id='sampleHeading']")).getText();
		System.out.println(Message);
		
		//driver.close();
		
		
		
		
	}
	

}
