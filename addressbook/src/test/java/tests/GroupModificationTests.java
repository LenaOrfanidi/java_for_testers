package tests;

import model.GroupData;
import org.junit.jupiter.api.Test;

public class GroupModificationTests extends TestBase {

    @Test
    void TestGroupModification(){
        if (!app.groups().isGroupPresent()){
            app.groups().createGroup(new GroupData("name","header","footer"));
        }

    }
}


