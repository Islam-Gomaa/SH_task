package PagesOfFirstTask;

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

public class Shopping_Cart_Summary {

	public void cart_summary(WebDriver driver) throws IOException {

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		try {

			// Summary tab

			Thread.sleep(300);

			// Description of product
			WebElement product_name = driver.findElement(By.xpath("//*[@id=\"product_2_7_0_636896\"]/td[2]/p/a"));
			System.out.println("product name is  " + product_name.getText());

			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,300)");

			Thread.sleep(1000);

			// Add Quantity
			By icon_plus = By.className("icon-plus");
			driver.findElement(icon_plus).click();
			driver.findElement(icon_plus).click();
			System.out.println("Qty = 3");

			Thread.sleep(2000);

			// Convert web driver object to TakeScreenshot
			TakesScreenshot scrShot = (TakesScreenshot) driver;

			// Call getScreenshotAs method to create image file
			File src = scrShot.getScreenshotAs(OutputType.FILE);

			// Move image file to new destination
			org.openqa.selenium.io.FileHandler.copy(src, new File(".\\shopping cart summary.png"));

			Thread.sleep(500);

			// Click on Proceed to checkout
			By Proceed_to_checkout = By.xpath("//*[@id=\"center_column\"]/p[2]/a[1]/span");
			driver.findElement(Proceed_to_checkout).click();

		} catch (InterruptedException ex) {
			Logger.getLogger(Shopping_Cart_Summary.class.getName()).log(Level.SEVERE, null, ex);
		}

	}

}
