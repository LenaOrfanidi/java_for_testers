package tests;

import model.GroupData;
import org.junit.jupiter.api.Test;

public class GroupCreationTest extends TestBase {

    @Test
    public void TestGroupCreation() {
        app.groups().createGroup(new GroupData("Apple", "Green", "Organic"));
    }

    @Test
    public void TestGroupCreationEmptyName() {
    app.groups().createGroup(new GroupData());

    }

    @Test
    public void TestGroupCreationWithName() {
        app.groups().createGroup(new GroupData().withName("Some name"));
    }
}





