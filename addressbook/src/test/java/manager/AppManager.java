package manager;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class AppManager {
    protected  WebDriver driver;
    private LoginHelper session;
    private GroupHelper groups;

    public void init(String browser) {
        if (driver == null) {
            if ("Chrome".equals(browser)) {
                driver = new ChromeDriver();
            } else if ("firefox".equals(browser))
                driver = new FirefoxDriver();
        }else {
            throw new IllegalArgumentException(String.format("Unknown browser %s", browser));
        }
            Runtime.getRuntime().addShutdownHook(new Thread(driver::quit));
            driver.get("http://localhost/addressbook/index.php");
            driver.manage().window().setSize(new Dimension(1269, 982));
           session().login("admin", "secret", this);
        }

    public LoginHelper session(){
        if( session == null){
            session = new LoginHelper(this);
        }
        return  session;
    }

    public GroupHelper groups(){
        if(groups == null){
            groups = new GroupHelper(this);
        }
        return groups;

    }

    public boolean isElementPresent(By locator) {
        try {
            driver.findElement(locator);
            return true;
        } catch (NoSuchElementException exception) {
            return false;
        }
    }

}
