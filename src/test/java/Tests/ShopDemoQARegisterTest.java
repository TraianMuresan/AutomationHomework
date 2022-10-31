package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ShopDemoQARegisterTest {

    public WebDriver driver;

    @Test
    public void metodatest(){
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        driver=new ChromeDriver();
        driver.get("https://shop.demoqa.com/");
        driver.manage().window().maximize();


        WebElement dismiss=driver.findElement(By.cssSelector("p [class=woocommerce-store-notice__dismiss-link]"));
        dismiss.click();

        driver.get("https://shop.demoqa.com/my-account/");

        WebElement username=driver.findElement(By.id("reg_username"));
        String usernamevalue="NumeTest";
        username.sendKeys(usernamevalue);


        WebElement email=driver.findElement(By.id("reg_email"));
        String emailvalue="nume@test.com";
        email.sendKeys(emailvalue);

        WebElement password=driver.findElement(By.id("reg_password"));
        String passwordlvalue="Parola.2468";
        password.sendKeys(passwordlvalue);

        //tre sa vedem cu Alex
        // ebElement showpass=driver.findElement(By.cssSelector("span[class='show-password-input']"));
        //showpass.click();

        //WebElement hidepass=driver.findElement(By.cssSelector("span[class='show-password-input display-password']"));
        //hidepass.click();


        WebElement registerbutton=driver.findElement(By.cssSelector("button[name='register']"));
        registerbutton.click();


        WebElement errorelement=driver.findElement(By.cssSelector("ul[class='woocommerce-error']"));
        String expectederror="Error: An account is already registered with your email address. Please log in.";
        String actuelerror=errorelement.getText();
        System.out.println(actuelerror);
        Assert.assertEquals(actuelerror,expectederror);

    }
}
