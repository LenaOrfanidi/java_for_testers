package tests;

import model.GroupData;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.List;

public class GroupCreationTest extends TestBase {
    public static List<GroupData> groupProvider(){
var result = new ArrayList<GroupData>();
for (var name : List.of("","group name")){
    for (var header : List.of("","header name")){
for ( var footer : List.of("","footer name")) {
    result.add(new GroupData(name, header,footer));
}
    }
}
        for (int i = 0; i < 5; i++) {
            result.add(new GroupData(randomString(i * 10), randomString(i * 10), randomString(i * 10)));
        }
        return result;
    }


    @ParameterizedTest
    @MethodSource("groupProvider")
    public void TestMultipleGroupCreation(GroupData group) {
        int groupCount = app.groups().getcount();
        app.groups().createGroup(group);
        int newGroupCount = app.groups().getcount();
        Assertions.assertEquals(groupCount + 1, newGroupCount);
    }
    public static List<GroupData> negativeGroupProvider(){
        var result = new ArrayList<GroupData>(List.of(
                new GroupData("group b'","","")));
                    return result ;
                }


    @ParameterizedTest
    @MethodSource("negativeGroupProvider")
    public void TestCannotCreateGroup(GroupData group) {
        int groupCount = app.groups().getcount();
        app.groups().createGroup(group);
        int newGroupCount = app.groups().getcount();
        Assertions.assertEquals(groupCount, newGroupCount);
    }
}





