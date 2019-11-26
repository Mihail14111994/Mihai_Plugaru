import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class OpenCartAutomation {

    @Test
    public void firstScenario() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\mplugaru\\Desktop\\Mihai_Plugaru   GIT\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.opencart.com/");
        /* set an explicit timer */
        WebDriverWait wait = new WebDriverWait(driver, 4);
        /* drop-down for login */
        Thread.sleep(1000);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/a"))).click();
        /* login page */
        Thread.sleep(1000);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/ul/li[2]/a"))).click();
        /* introduce credentials */
        Thread.sleep(1000);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"input-email\"]"))).click();
        WebElement email = driver.findElement(By.xpath("//*[@id=\"input-email\"]"));
        email.sendKeys("mihailqs11@gmail.com");
        Thread.sleep(1000);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"input-password\"]"))).click();
        WebElement password = driver.findElement(By.xpath("//*[@id=\"input-password\"]"));
        password.sendKeys("Mihailqspass");
        /* press [Login] button */
        Thread.sleep(1000);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input"))).click();
        /* select   first category */
        Thread.sleep(1000);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"menu\"]/div[2]/ul/li[6]/a"))).click();
        /* select   first product */
        Thread.sleep(1000);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"content\"]/div[2]/div[2]/div/div[2]/div[1]/h4/a"))).click();
        /* Add to cart */
        Thread.sleep(1000);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"button-cart\"]"))).click();
        /* Check Cart drop-down */
        Thread.sleep(1000);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"cart-total\"]"))).click();
        /* View Cart */
        Thread.sleep(1000);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"cart\"]/ul/li[2]/div/p/a[1]/strong"))).click();
        /* Save the product name (the one we added in the cart and want to delete) */
        String productName = driver.findElement(By.xpath("//*[@id=\"content\"]/form/div/table/tbody/tr[1]/td[2]/a")).getText();
        System.out.println(productName);
        /* Check element isDisplayed in the Cart*/
        Thread.sleep(1000);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.partialLinkText(productName))).isDisplayed();
        /* drop-down for logout */
        Thread.sleep(1000);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/a"))).click();
        /* press Logout */
        Thread.sleep(1000);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/ul/li[5]/a"))).click();
        /* Close browser */
        Thread.sleep(1000);
        driver.quit();
    }

    @Test
    public void secondScenario() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\mplugaru\\Desktop\\Mihai_Plugaru   GIT\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.opencart.com/");
        /* set an explicit timer */
        WebDriverWait wait = new WebDriverWait(driver, 4);
        /* drop-down for login */
        Thread.sleep(1000);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/a"))).click();
        /* login page */
        Thread.sleep(1000);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/ul/li[2]/a"))).click();
        /* introduce credentials */
        Thread.sleep(1000);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"input-email\"]"))).click();
        WebElement email = driver.findElement(By.xpath("//*[@id=\"input-email\"]"));
        email.sendKeys("mihailqs11@gmail.com");
        Thread.sleep(1000);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"input-password\"]"))).click();
        WebElement password = driver.findElement(By.xpath("//*[@id=\"input-password\"]"));
        password.sendKeys("Mihailqspass");
        /* press [Login] button */
        Thread.sleep(1000);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input"))).click();
        /* select   first category */
        Thread.sleep(1000);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"menu\"]/div[2]/ul/li[6]/a"))).click();
        /* select   first product */
        Thread.sleep(1000);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"content\"]/div[2]/div[2]/div/div[2]/div[1]/h4/a"))).click();
        /* Add to cart */
        Thread.sleep(1000);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"button-cart\"]"))).click();
        /* Check Cart drop-down */
        Thread.sleep(1000);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"cart-total\"]"))).click();
        /* View Cart */
        Thread.sleep(1000);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"cart\"]/ul/li[2]/div/p/a[1]/strong"))).click();
        /* Delete from Cart , [Buton] */
        Thread.sleep(1000);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='content']/form/div/table/tbody/tr/td[4]/div/span/button[2]"))).click();
        /* Check Cart empty */
        Thread.sleep(1000);
        String cartStatus = driver.findElement(By.xpath("//*[@id=\"cart-total\"]")).getText();
        System.out.println(cartStatus);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.partialLinkText(cartStatus))).isDisplayed();
        /* drop-down for logout */
        Thread.sleep(1000);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/a"))).click();
        /* press Logout */
        Thread.sleep(1000);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/ul/li[5]/a"))).click();
        /* Close browser */
        Thread.sleep(1000);
        driver.quit();
    }

    @Test
    public void thirdScenario() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\mplugaru\\Desktop\\Mihai_Plugaru   GIT\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.opencart.com/");
        /* set an explicit timer */
        WebDriverWait wait = new WebDriverWait(driver, 4);
        /* drop-down for login */
        Thread.sleep(1000);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/a"))).click();
        /* login page */
        Thread.sleep(1000);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/ul/li[2]/a"))).click();
        /* introduce credentials */
        Thread.sleep(1000);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"input-email\"]"))).click();
        WebElement email = driver.findElement(By.xpath("//*[@id=\"input-email\"]"));
        email.sendKeys("mihailqs11@gmail.com");
        Thread.sleep(1000);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"input-password\"]"))).click();
        WebElement password = driver.findElement(By.xpath("//*[@id=\"input-password\"]"));
        password.sendKeys("Mihailqspass");
        /* press [Login] button */
        Thread.sleep(1000);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input"))).click();
        /* select   first category */
        Thread.sleep(1000);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"menu\"]/div[2]/ul/li[6]/a"))).click();
        /* select   first product */
        Thread.sleep(1000);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"content\"]/div[2]/div[2]/div/div[2]/div[1]/h4/a"))).click();
        /* Add to cart */
        Thread.sleep(1000);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"button-cart\"]"))).click();
        /* select second category */
        Thread.sleep(1000);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"menu\"]/div[2]/ul/li[6]/a"))).click();
        /* select second product */
        Thread.sleep(1000);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"content\"]/div[2]/div[1]/div/div[2]/div[1]/h4/a"))).click();
        /* Add to cart */
        Thread.sleep(1000);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"button-cart\"]"))).click();
        /* Check Cart drop-down */
        Thread.sleep(1000);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"cart-total\"]"))).click();
        /* View Cart */
        Thread.sleep(1000);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"cart\"]/ul/li[2]/div/p/a[1]/strong"))).click();
        /* Save the product name (the one we added in the cart and want to delete) */
        String productName = driver.findElement(By.xpath("//*[@id=\"content\"]/form/div/table/tbody/tr[1]/td[2]/a")).getText();
        System.out.println(productName);
        /* Check element isDisplayed in the Cart*/
        Thread.sleep(1000);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.partialLinkText(productName))).isDisplayed();
        /* Delete from Cart , [Buton] */
        Thread.sleep(1000);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='content']/form/div/table/tbody/tr/td[4]/div/span/button[2]"))).click();
        /* Check Cart */
        Thread.sleep(2000);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"cart-total\"]"))).click();
        /* View Cart */
        Thread.sleep(2000);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"cart\"]/ul/li[2]/div/p/a[1]/strong"))).click();
        /* Check elment isDisplayed after Deleting*/
        Thread.sleep(2000);
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.partialLinkText(productName)));
        } catch (Exception e) {
            System.out.println("\"" + productName + "\"" + " is not present in the Cart!");
        }
        /* drop-down for logout */
        Thread.sleep(1000);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/a"))).click();
        /* press Logout */
        Thread.sleep(1000);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/ul/li[5]/a"))).click();
        /* Close browser */
        Thread.sleep(1000);
        driver.quit();
    }
}