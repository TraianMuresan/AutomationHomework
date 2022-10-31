package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ShopDemoQALoginTest {

    public WebDriver driver;

    @Test
    public void metodatest(){
        System.setProperty("webdriver.chrome.driver","src/test/resources/chromedriver.exe");
        driver=new ChromeDriver();
        //driver.get("https://shop.demoqa.com/");
        driver.get("https://shop.demoqa.com/my-account/");
        driver.manage().window().maximize();


        WebElement dismiss=driver.findElement(By.cssSelector("p [class=woocommerce-store-notice__dismiss-link]"));
        dismiss.click();

        //WebElement username=driver.findElement(By.id("username"));
        //String usernamevalue="NumeTest";
        //username.sendKeys(usernamevalue);


        WebElement email=driver.findElement(By.id("username"));
        String emailvalue="nume@test.com";
        email.sendKeys(emailvalue);

        WebElement password=driver.findElement(By.id("password"));
        String passwordlvalue="Parola.2468";
        password.sendKeys(passwordlvalue);

        //WebElement showpass=driver.findElement(By.cssSelector("span[class='show-password-input']"));
        //showpass.click();

        //WebElement hidepass=driver.findElement(By.cssSelector("span[class='show-password-input display-password']"));
        //hidepass.click();


        WebElement rememberme=driver.findElement(By.id("rememberme"));
        rememberme.click();

        WebElement loginbutton=driver.findElement(By.cssSelector("button[name='login']"));
        loginbutton.click();

        //de facut ulterior
        //WebElement messageelement=driver.findElement(By.cssSelector("div[class='woocommerce-MyAccount-content']"));
        //String expectedmessage="Hello NumeTest (not NumeTest? Log out)";
        //String actuelmessage=messageelement.getText();
        //Assert.assertEquals(actuelmessage,expectedmessage);


        //WebElement lostpassword=driver.findElement(By.cssSelector
        //        ("p [href='https://shop.demoqa.com/my-account/lost-password/']"));
        //lostpassword.click();

    }
}
