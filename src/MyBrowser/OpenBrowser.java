package MyBrowser;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class OpenBrowser {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\Siritek\\Desktop\\Basic_Selenium_Frameworks\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new  ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.whatsapp.com");
        //driver.close();
    }
}
