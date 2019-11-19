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

        WebDriverWait wait = new WebDriverWait(driver, 4);
        /* drop-down for login */
        Thread.sleep(1000);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/a")));
        driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/a")).click();
        /* login page */
        Thread.sleep(1000);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/ul/li[2]/a")));
        driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/ul/li[2]/a")).click();
        /* introduce credentials */
        Thread.sleep(1000);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"input-email\"]")));
        WebElement email = driver.findElement(By.xpath("//*[@id=\"input-email\"]"));
        email.sendKeys("mihailqs11@gmail.com");
        Thread.sleep(1000);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"input-password\"]")));
        WebElement password = driver.findElement(By.xpath("//*[@id=\"input-password\"]"));
        password.sendKeys("Mihailqspass");
        /* press [Login] button */
        Thread.sleep(1000);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input")));
        driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input")).click();
        /* select a category  22222222*/
        Thread.sleep(1000);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"menu\"]/div[2]/ul/li[6]/a")));
        driver.findElement(By.xpath("//*[@id=\"menu\"]/div[2]/ul/li[6]/a")).click();
        /* select a product 22222222*/
        Thread.sleep(1000);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"content\"]/div[2]/div[2]/div/div[2]/div[1]/h4/a")));
        driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div[2]/div/div[2]/div[1]/h4/a")).click();
        /* Add to cart 222222222222*/
        Thread.sleep(1000);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"button-cart\"]")));
        driver.findElement(By.xpath("//*[@id=\"button-cart\"]")).click();
        /* select a category */
        Thread.sleep(1000);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"menu\"]/div[2]/ul/li[6]/a")));
        driver.findElement(By.xpath("//*[@id=\"menu\"]/div[2]/ul/li[6]/a")).click();
        /* select a product */
        Thread.sleep(1000);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"content\"]/div[2]/div[1]/div/div[2]/div[1]/h4/a")));
        driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div[1]/div/div[2]/div[1]/h4/a")).click();
        /* Add to cart */
        Thread.sleep(1000);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"button-cart\"]")));
        driver.findElement(By.xpath("//*[@id=\"button-cart\"]")).click();
        /* Check Cart */
        Thread.sleep(1000);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"cart-total\"]")));
        driver.findElement(By.xpath("//*[@id=\"cart-total\"]")).click();
        /* View Cart */
        Thread.sleep(1000);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"cart\"]/ul/li[2]/div/p/a[1]/strong")));
        driver.findElement(By.xpath("//*[@id=\"cart\"]/ul/li[2]/div/p/a[1]/strong")).click();

        String productName = driver.findElement(By.xpath("//*[@id=\"content\"]/form/div/table/tbody/tr[1]/td[2]/a")).getText();
        System.out.println(productName);

        /* Check elment isDisplayed */
        Thread.sleep(1000);
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.partialLinkText(productName)));
            driver.findElement(By.partialLinkText(productName)) ;
        } catch (Exception e) {
            System.out.println("productName 1 : " + productName);
        }
        /* Delete from Cart [buton] */
        Thread.sleep(1000);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"content\"]/form/div/table/tbody/tr[1]/td[4]/div/span/button[2]")));
        driver.findElement(By.xpath("//*[@id=\"content\"]/form/div/table/tbody/tr[1]/td[4]/div/span/button[2]")).click();

        Thread.sleep(1000);

        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.partialLinkText(productName)));
            driver.findElement(By.partialLinkText(productName)) ;
        } catch (Exception e) {
            System.out.println("productName 2 : " + productName);
        }
//        /* Check Cart */
//        Thread.sleep(2000);
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"cart-total\"]")));
//        driver.findElement(By.xpath("//*[@id=\"cart-total\"]")).click();
//        /* View Cart */
//        Thread.sleep(2000);
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"cart\"]/ul/li[2]/div/p/a[1]/strong")));
//        driver.findElement(By.xpath("//*[@id=\"cart\"]/ul/li[2]/div/p/a[1]/strong")).click();
//        /* Check elment isDisplayed */
//        Thread.sleep(2000);
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"content\"]/form/div/table/tbody/tr[1]/td[2]/a")));
//        driver.findElement(By.xpath("//*[@id=\"content\"]/form/div/table/tbody/tr[1]/td[2]/a")).isDisplayed();

        /* drop-down for logout */
        Thread.sleep(1000);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/a")));
        driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/a")).click();
        /* press Logout */
        Thread.sleep(1000);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/ul/li[5]/a")));
        driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/ul/li[5]/a")).click();

        Thread.sleep(3000);
        driver.quit();
    }


    @Test
    public void secondScenario() {

    }
}