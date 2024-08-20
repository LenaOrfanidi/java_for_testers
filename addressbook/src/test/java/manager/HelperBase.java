package manager;

import org.openqa.selenium.By;

import javax.swing.*;

public class HelperBase {
    protected final AppManager manager;

    public HelperBase(AppManager manager) {
        this.manager = manager;
    }

    protected void type(By locator, String text) {
        click(locator);
        manager.driver.findElement(locator).clear();
        manager.driver.findElement(locator).sendKeys(text);
    }

    protected void click(By locator) {
        manager.driver.findElement(locator).click();
    }
public void selectDropdown(By locator, JComboBox<String> dropdown) {
        dropdown.setSelectedItem(manager.driver.findElement(locator).getText());
    }
}
