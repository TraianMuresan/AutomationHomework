package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ShopDemoQASippingTest {

    public WebDriver driver;

    @Test
    public void metodatest(){
        System.setProperty("webdriver.chrome.driver","src/test/resources/chromedriver.exe");
        driver=new ChromeDriver();
        driver.get("https://shop.demoqa.com/");
        driver.manage().window().maximize();

        WebElement dismiss=driver.findElement(By.cssSelector("p [class=woocommerce-store-notice__dismiss-link]"));
        dismiss.click();

        WebElement myaccount=driver.findElement(By.cssSelector("ul [href='https://shop.demoqa.com/my-account/']"));
        myaccount.click();

        WebElement username=driver.findElement(By.id("username"));
        String usernamevalue="NumeTest";
        username.sendKeys(usernamevalue);

        WebElement password=driver.findElement(By.id("password"));
        String passwordlvalue="Parola.2468";
        password.sendKeys(passwordlvalue);

        WebElement loginbutton=driver.findElement(By.cssSelector("button[name='login']"));
        loginbutton.click();

        WebElement adresses=driver.findElement(By.cssSelector("nav [href='https://shop.demoqa.com/my-account/edit-address/']"));
        adresses.click();

        WebElement billing=driver.findElement(By.cssSelector("header [href='https://shop.demoqa.com/my-account/edit-address/shipping/']"));
        billing.click();

        WebElement firstname=driver.findElement(By.id("shipping_first_name"));
        String firstnamevalue="Prenume";
        firstname.sendKeys(firstnamevalue);

        WebElement lastname=driver.findElement(By.id("shipping_last_name"));
        String lastnamevalue="Nume";
        lastname.sendKeys(lastnamevalue);

        WebElement company=driver.findElement(By.id("shipping_company"));
        String companyvalue="Acasa SRL";
        company.sendKeys(companyvalue);

        WebElement tara=driver.findElement(By.id("select2-shipping_country-container"));
        tara.click();
        WebElement tarainput=driver.findElement(By.className("select2-search__field"));
        tarainput.sendKeys("Romania");
        tarainput.sendKeys(Keys.ENTER);

        WebElement sippingAddress1=driver.findElement(By.id("shipping_address_1"));
        String sippingAddress1value="Str DeAcasa, Nr 80";
        sippingAddress1.sendKeys(sippingAddress1value);

        WebElement sippingAddress2=driver.findElement(By.id("shipping_address_2"));
        String sippingAddress2value="Ap 2";
        sippingAddress2.sendKeys(sippingAddress2value);

        WebElement city=driver.findElement(By.id("shipping_city"));
        String cityvalue="Cluj Napoca";
        city.sendKeys(cityvalue);

        WebElement judet=driver.findElement(By.id("select2-shipping_state-container"));
        judet.click();
        WebElement judetinput=driver.findElement(By.className("select2-search__field"));
        judetinput.sendKeys("Cluj");
        judetinput.sendKeys(Keys.ENTER);

        WebElement postcode=driver.findElement(By.id("shipping_postcode"));
        String postcodevalue="400123";
        postcode.sendKeys(postcodevalue);

        WebElement saveAddressButton=driver.findElement(By.cssSelector("button[name='save_address']"));
        saveAddressButton.click();
    }
}
