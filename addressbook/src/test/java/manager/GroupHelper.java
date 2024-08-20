package manager;

import model.GroupData;
import org.openqa.selenium.By;

public class GroupHelper extends HelperBase{
    public GroupHelper(AppManager manager){
        super(manager);
    }

    public void openGroupsPage() {
        if (!manager.isElementPresent(By.name("new"))) {
            click(By.linkText("groups"));
        }
    }
    public void createGroup(GroupData group) {
        openGroupsPage();
        initGroupCreation();
        getFillGroupForm(group);
        submitGroupCreation();
        getRetunToGroupPage();
    }
    public void removeGroup() {
        openGroupsPage();
        selectGroup();
        removeSelectedGroup();
        getRetunToGroupPage();
    }


    public boolean isGroupPresent() {
        openGroupsPage();
        return manager.isElementPresent(By.name("selected[]"));
    }

    private void submitGroupCreation() {
        click(By.name("submit"));
    }



    private void initGroupCreation() {
        click(By.name("new"));
    }


    private void removeSelectedGroup() {
        click(By.name("delete"));
    }

    private void selectGroup(){
        click(By.name("selected[]"));
    }
    public void modifyGroup(GroupData modifiedGroup){
        openGroupsPage();
        selectGroup();
        getInitGroupModification();
        getFillGroupForm(modifiedGroup);
        getSubmitGroupModification();
        getRetunToGroupPage();
    }

    private  void getRetunToGroupPage() {
        click(By.linkText("group page"));
    }

    private void getSubmitGroupModification() {
        click(By.name("update"));
    }

    private void getFillGroupForm(GroupData Group) {
        type(By.name("group_name"), Group.getName());
        type(By.name("group_header"),Group.getFooter());
         type(By.name("group_footer"),Group.getHeader());

    }

    private void getInitGroupModification() {
        click(By.name("edit"));
    }

}
