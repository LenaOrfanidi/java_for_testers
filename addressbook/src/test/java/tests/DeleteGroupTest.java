package tests;

import model.GroupData;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class DeleteGroupTest extends TestBase {

    @Test
    public void TestdeleteGroup() {
        if (app.groups().getcount()==0){
           app.groups().createGroup(new GroupData());
        }
        int groupCount = app.groups().getcount();
        app.groups().removeGroup();
        int newGroupCount= app.groups().getcount();
        Assertions.assertEquals(groupCount - 1, newGroupCount);

    }
    @Test
    void TestCanRemoveAllGroupsAtOnce(){
        if (app.groups().getcount()==0){
            app.groups().createGroup(new GroupData());
        }
        app.groups().removeAllGroups();
        Assertions.assertEquals(0,app.groups().getcount() );
    }

}

