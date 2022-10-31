package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ShopDemoQABillingTest {

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

        WebElement billing=driver.findElement(By.cssSelector("header [href='https://shop.demoqa.com/my-account/edit-address/billing/']"));
        billing.click();

        WebElement firstname=driver.findElement(By.id("billing_first_name"));
        String firstnamevalue="Prenume";
        firstname.sendKeys(firstnamevalue);

        WebElement lastname=driver.findElement(By.id("billing_last_name"));
        String lastnamevalue="Nume";
        lastname.sendKeys(lastnamevalue);

        WebElement company=driver.findElement(By.id("billing_company"));
        String companyvalue="Acasa SRL";
        company.sendKeys(companyvalue);

        WebElement tara=driver.findElement(By.id("select2-billing_country-container"));
        tara.click();
        WebElement tarainput=driver.findElement(By.className("select2-search__field"));
        tarainput.sendKeys("Romania");
        tarainput.sendKeys(Keys.ENTER);

        WebElement billingAddress1=driver.findElement(By.id("billing_address_1"));
        String billingAddress1value="Str DeAcasa, Nr 80";
        billingAddress1.sendKeys(billingAddress1value);

        WebElement billingAddress2=driver.findElement(By.id("billing_address_2"));
        String billingAddress2value="Ap 2";
        billingAddress2.sendKeys(billingAddress2value);

        WebElement city=driver.findElement(By.id("billing_city"));
        String cityvalue="Cluj Napoca";
        city.sendKeys(cityvalue);

        WebElement judet=driver.findElement(By.id("select2-billing_state-container"));
        judet.click();
        WebElement judetinput=driver.findElement(By.className("select2-search__field"));
        judetinput.sendKeys("Cluj");
        judetinput.sendKeys(Keys.ENTER);

        WebElement postcode=driver.findElement(By.id("billing_postcode"));
        String postcodevalue="400123";
        postcode.sendKeys(postcodevalue);

        WebElement phone=driver.findElement(By.id("billing_phone"));
        String phonevalue="0744223366";
        phone.sendKeys(phonevalue);

        WebElement email=driver.findElement(By.id("billing_email"));
        String emailvalue="altnume@test.com";
        email.clear();
        email.sendKeys(emailvalue);

        WebElement saveAddressButton=driver.findElement(By.cssSelector("button[name='save_address']"));
        saveAddressButton.click();
    }
}
