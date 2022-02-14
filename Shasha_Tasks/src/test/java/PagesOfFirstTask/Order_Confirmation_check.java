package PagesOfFirstTask;

import static org.testng.Assert.assertTrue;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Order_Confirmation_check {

	public void confirm(WebDriver driver) throws IOException {

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		try {

			// Order_Confirmation

			Thread.sleep(300);

			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,300)");

			// Convert web driver object to TakeScreenshot
			TakesScreenshot scrShot2 = (TakesScreenshot) driver;

			// Call getScreenshotAs method to create image file
			File src2 = scrShot2.getScreenshotAs(OutputType.FILE);

			// Move image file to new destination
			org.openqa.selenium.io.FileHandler.copy(src2, new File(".\\order confirmation.png"));

			// Order Confirmation
			WebElement Message = driver.findElement(By.xpath("//*[@id=\"center_column\"]/p[1]"));
			System.out.println(Message.getText());
			assertTrue(Message.getText().contains("Your order on My Store is complete."));

		} catch (InterruptedException ex) {
			Logger.getLogger(Order_Confirmation_check.class.getName()).log(Level.SEVERE, null, ex);
		}

	}

}
