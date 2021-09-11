import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class childAxes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://demoqa.com/text-box");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//div[@id='userName-wrapper']//child::input")).sendKeys("Anand");
		
		driver.findElement(By.xpath("//div[@id='userEmail-wrapper']//child::input")).sendKeys("abc@gmail.com");
		
		driver.findElement(By.xpath("//div[@id='currentAddress-wrapper']//child::textarea")).sendKeys("Pune");
		Actions submitBtn= new Actions(driver);
		WebElement dynamicProp=driver.findElement(By.xpath("//span[contains(text(),'Dynamic Properties')]"));

		submitBtn.moveToElement(dynamicProp);
		submitBtn.build().perform();
		driver.findElement(By.xpath("//button[@id='submit']")).click();
		
		
	}

}