package PagesOfFirstTask;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Login {

	public void login_to_my_store(WebDriver driver, String Email, String Password) throws IOException {

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		try {

			// Login to My Store

			Thread.sleep(100);

			// Click on Sign in
			By Sign_in = By.className("login");
			driver.findElement(Sign_in).click();

			Thread.sleep(100);

			// Convert web driver object to TakeScreenshot
			TakesScreenshot scrShot = (TakesScreenshot) driver;

			// Call getScreenshotAs method to create image file
			File src = scrShot.getScreenshotAs(OutputType.FILE);

			// Move image file to new destination
			org.openqa.selenium.io.FileHandler.copy(src, new File(".\\login page.png"));

			// Insert Email address
			By Email_Text = By.id("email");
			driver.findElement(Email_Text).sendKeys(Email);

			Thread.sleep(200);

			// Insert password
			By password = By.id("passwd");
			driver.findElement(password).sendKeys(Password);

			Thread.sleep(500);

			// Click on Sign in Button
			By SignIn_BTN = By.id("SubmitLogin");
			driver.findElement(SignIn_BTN).click();

			Thread.sleep(500);

			System.out.println("Login Successfully");

			WebElement My_Account = driver.findElement(By.className("account"));
			System.out.println("My Account is  " + My_Account.getText());

			Thread.sleep(500);

			// Back to Home
			By Home_Icon = By.className("icon-home");
			driver.findElement(Home_Icon).click();

		} catch (InterruptedException ex) {
			Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
		}

	}

}
