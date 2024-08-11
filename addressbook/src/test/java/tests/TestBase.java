package tests;

import manager.AppManager;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;

public class TestBase {
    protected static AppManager app;
    @BeforeEach
    public void setUp() {
        if (app == null) {
            app = new AppManager();
            app.init();
        }
    }
}
