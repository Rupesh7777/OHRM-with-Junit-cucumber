package StepDef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.en.Given;

public class stepdefination {
	@Given("i login to OHRM vith correct uname and password")
	public void i_login_to_ohrm_vith_correct_uname_and_password() throws InterruptedException {
		ChromeOptions otp = new ChromeOptions();
		otp.addArguments("stat beowser");
		// Create a new instance of the ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Navigate to the OrangeHRM login page
        driver.get("https://opensource-demo.orangehrmlive.com/");
        Thread.sleep(3000);
        // Locate the username and password input fields and the login button
        WebElement usernameInput = driver.findElement(By.name("username"));
        WebElement passwordInput = driver.findElement(By.name("password"));
        WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));
        Thread.sleep(3000);
        // Enter the username and password
        usernameInput.sendKeys("admin");
        passwordInput.sendKeys("admin123");
        Thread.sleep(3000);
        // Click the login button
        loginButton.click();
        Thread.sleep(3000);
        // Wait for a few seconds to observe the logged-in state (you might want to use WebDriverWait in a real scenario)

        // Close the browser
        driver.quit();
		
	}
}
