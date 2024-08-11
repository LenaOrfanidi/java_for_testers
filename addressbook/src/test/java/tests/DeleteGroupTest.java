package tests;

import model.GroupData;
import org.junit.jupiter.api.Test;


public class DeleteGroupTest extends TestBase {

    @Test
    public void TestdeleteGroup() {
        if (app.groups().isGroupPresent()) {
           app.groups().createGroup(new GroupData());
        }
        app.groups().removeGroup();

    }

}

