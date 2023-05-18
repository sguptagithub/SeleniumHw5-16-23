package HW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hw1 {
    /**
     * navigate to https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22
     * fill out the form
     * close the browser
     * Note: use name or id as locators
     */
        public static void main(String[] args) throws InterruptedException {
            WebDriver driver=new ChromeDriver();
            driver.get("https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22");
            driver.manage().window().maximize();
            driver.findElement(By.id("customer.firstName")).sendKeys("Sammy");
            driver.findElement(By.id("customer.lastName")).sendKeys("Johnson");
            driver.findElement(By.id("customer.address.street")).sendKeys("123 west borad");
            driver.findElement(By.name("customer.address.city")).sendKeys("UK");
            driver.findElement(By.name("customer.address.state")).sendKeys("China");
            driver.findElement(By.id("customer.address.zipCode")).sendKeys("20431");
            driver.findElement(By.id("customer.phoneNumber")).sendKeys("5716784987");
            driver.findElement(By.name("customer.ssn")).sendKeys("33452891");
            driver.findElement(By.id("customer.username")).sendKeys("China");
            driver.findElement(By.name("customer.password")).sendKeys("578us");
            driver.findElement(By.id("repeatedPassword")).sendKeys("578us");
            Thread.sleep(2000);
            driver.quit();

        }
    }