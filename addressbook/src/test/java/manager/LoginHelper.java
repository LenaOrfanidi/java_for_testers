package manager;

import org.openqa.selenium.By;

public class LoginHelper extends HelperBase {

    public LoginHelper(AppManager manager){
       super(manager);
    }
    void login(String user, String password, AppManager appManager){
        type(By.name("user"),user);
        type(By.name("pass"),password);

       click(By.xpath("//input[@value=\'Login\']"));
    }


}
