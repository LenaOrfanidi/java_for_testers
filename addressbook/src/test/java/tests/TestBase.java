package tests;

import manager.AppManager;
import org.junit.jupiter.api.BeforeEach;

import java.util.Random;

public class TestBase {
    protected static AppManager app;
    @BeforeEach
    public void setUp() {
        if (app == null) {
            app = new AppManager();
            app.init(System.getProperty("browser","Chrome"));
        }
    }
    public static String randomString(int n) {
        var rnd = new Random();
        var result = "";
        for (int i = 0; i <n; i++) {
           result = result +(char)('a'+ rnd.nextInt(26));
        }
        return result;
    }
}
