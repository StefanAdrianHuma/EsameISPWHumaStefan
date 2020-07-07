import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestSelenium {

    public Double firstKm = 0.0;
    public Double secondKm = 0.0;

    public TestSelenium(){
        System.out.println("Prova Selenium");
        System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/search?rlz=1C1CHBD_itIT908IT908&sxsrf=ALeKk01a4dyD6kyd1VMJiny_HiFZyyu16g%3A1594110653898&ei=vTIEX7asNsS56QTOlISwBA&q=conversione+miglia+km&oq=conversione+miglia+km&gs_lcp=CgZwc3ktYWIQAzICCAAyAggAMgIIADICCAAyBggAEAcQHjIECAAQHjIECAAQHjIGCAAQBRAeMgYIABAFEB4yBggAEAUQHjoECAAQR1CpblipbmCVdmgAcAJ4AIABYIgBYJIBATGYAQCgAQGqAQdnd3Mtd2l6&sclient=psy-ab&ved=0ahUKEwj2_of63LrqAhXEXJoKHU4KAUYQ4dUDCAw&uact=5");

        driver.findElement(By.xpath("//*[@id=\"HG5Seb\"]/input")).clear();
        driver.findElement(By.xpath("//*[@id=\"HG5Seb\"]/input")).sendKeys("55");
        WebElement TxtBoxContent = driver.findElement(By.xpath("//*[@id=\"NotFQb\"]/input"));
        System.out.println("Stampo: " + TxtBoxContent.getAttribute("value"));
        String numero = TxtBoxContent.getAttribute("value");
        firstKm = Double.valueOf(numero.substring(0,numero.indexOf(',')));
        System.out.println("Numero: " + numero);

        driver.findElement(By.xpath("//*[@id=\"HG5Seb\"]/input")).clear();
        driver.findElement(By.xpath("//*[@id=\"HG5Seb\"]/input")).sendKeys("75");
        TxtBoxContent = driver.findElement(By.xpath("//*[@id=\"NotFQb\"]/input"));
        System.out.println("Stampo: " + TxtBoxContent.getAttribute("value"));
        numero = TxtBoxContent.getAttribute("value");
        secondKm = Double.valueOf(numero.substring(0,numero.indexOf(',')));
        System.out.println("Numero: " + numero);

        driver.close();
    }
}
