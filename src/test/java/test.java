import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class test {

    @Test
    public void testing() {
        System.setProperty("webdriver.edge.driver", "C:\\Users\\sreenu\\IdeaProjects\\pageobjectmodel\\msedgedriver.exe");
        EdgeDriver driver = new EdgeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");


        WebElement ele = driver.findElement(By.id("frame-one796456169"));
        driver.switchTo().frame(ele);
        pageobjects pg = new pageobjects(driver);
        pg.framecalclick();
        pg.dateselect();

        driver.quit();

    }
}
