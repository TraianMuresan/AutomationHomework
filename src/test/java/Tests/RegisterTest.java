package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class RegisterTest {

    public WebDriver driver;

    @Test
    public void metodatest(){
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        driver=new ChromeDriver();
        driver.get("https://demo.automationtesting.in/Register.html");
        driver.manage().window().maximize();

        WebElement firstname=driver.findElement(By.cssSelector("input[ng-model='FirstName']"));
        String firstnamevalue="Traian";
        firstname.sendKeys(firstnamevalue);

        WebElement lastname=driver.findElement(By.cssSelector("input[ng-model='LastName']"));
        String lastnamevalue="Muresan";
        lastname.sendKeys(lastnamevalue);

        WebElement adress=driver.findElement(By.xpath("//textarea[@ng-model='Adress']"));
        String adressvalue="Str. Caragiale, Nr. 2, Ap. 6";
        adress.sendKeys(adressvalue);

        WebElement emailadress=driver.findElement(By.cssSelector("input[ng-model='EmailAdress']"));
        String emailadressvalue="baba@test.com";
        emailadress.sendKeys(emailadressvalue);

        WebElement phone=driver.findElement(By.cssSelector("input[ng-model='Phone']"));
        String phonevalue="0742345876";
        phone.sendKeys(phonevalue);

        WebElement gender=driver.findElement(By.cssSelector("input[value='Male']"));
        gender.click();

        WebElement hobbiesmovies=driver.findElement(By.id("checkbox2"));
        hobbiesmovies.click();

        WebElement hobbieshockey=driver.findElement(By.id("checkbox3"));
        hobbieshockey.click();

        WebElement password1=driver.findElement(By.id("firstpassword"));
        String passwordvalue="test8844";
        password1.sendKeys(passwordvalue);

        WebElement password2=driver.findElement(By.id("secondpassword"));
        password2.sendKeys(passwordvalue);

    }
}
