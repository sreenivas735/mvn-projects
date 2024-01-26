import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pageobjects {
    WebDriver driver;

    pageobjects(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//span[@class='icon_calendar']")
    private WebElement framecal;

    @FindBy(xpath = "//a[@data-date='18']")
    private WebElement datepick;

    public void framecalclick() {
        framecal.click();
    }

    public void dateselect() {
        datepick.click();
    }
}
