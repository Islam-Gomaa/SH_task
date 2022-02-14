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
import org.openqa.selenium.interactions.Actions;

public class Home_Page {

	public void Home_my_store(WebDriver driver) throws IOException {

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		try {

			Thread.sleep(100);

			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,800)");

			// Mouse Hover action
			Actions action = new Actions(driver);
			WebElement img = driver.findElement(By.xpath("//*[@id=\"homefeatured\"]/li[2]/div/div[1]/div/a[1]/img"));
			action.moveToElement(img).build().perform();

			Thread.sleep(300);

			// Convert web driver object to TakeScreenshot
			TakesScreenshot scrShot = (TakesScreenshot) driver;

			// Call getScreenshotAs method to create image file
			File src = scrShot.getScreenshotAs(OutputType.FILE);

			// Move image file to new destination
			org.openqa.selenium.io.FileHandler.copy(src, new File(".\\home page.png"));

			// Click on Add to cart
			By Add_to_cart = By.xpath("//*[@id=\"homefeatured\"]/li[2]/div/div[2]/div[2]/a[1]/span");
			driver.findElement(Add_to_cart).click();

			Thread.sleep(300);

//			// Click on Proceed to checkout
//			By Proceed_to_checkout = By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a/span");
//			driver.findElement(Proceed_to_checkout).click();

			// Click on Proceed to checkout
			By Proceed_to_checkout = By.partialLinkText("Proceed to checkout");
			driver.findElement(Proceed_to_checkout).click();

		} catch (InterruptedException ex) {
			Logger.getLogger(Home_Page.class.getName()).log(Level.SEVERE, null, ex);
		}

	}

}
