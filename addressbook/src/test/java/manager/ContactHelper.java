package manager;

import model.ContactData;
import org.openqa.selenium.By;

public class ContactHelper extends HelperBase {
    public ContactHelper(AppManager manager) {
        super(manager);
    }

    public void openContactPage() {
        if (!manager.isElementPresent(By.name("firstname"))) {
            click(By.linkText("add new"));
        }
    }
    public void createContact(ContactData contact) {
        openContactPage();
        getFillContactForm(contact);
        submitContactCreation();
        getRetunToHomePage();
    }
    public void removeContact() {
        openContactPage();
        selectContact();
        removeSelectedContact();
        getRetunToHomePage();
    }

    public boolean isContactPresent() {
        openContactPage();
        return manager.isElementPresent(By.name("selected[]"));
    }

    private void getFillContactForm(ContactData contact) {
        type(By.name("firstname"), contact.getFirstname());
        type(By.name("lastname"), contact.getLastname());
        type(By.name("middlename"), contact.getMiddlename());
        type(By.name("nickname"), contact.getNickname());
        type(By.name("title"), contact.getTitle());
        type(By.name("company"), contact.getCompany());
        type(By.name("address"), contact.getAddress());
        type(By.name("home"), contact.getHome());
        type(By.name("mobile"), contact.getMobile());
        type(By.name("work"), contact.getWork());
        type(By.name("fax"), contact.getFax());
        type(By.name("email"), contact.getEmail());
        type(By.name("email2"), contact.getEmail2());
        type(By.name("email3"), contact.getEmail3());
        selectDropdown(By.name("bday"), contact.getBday());
        selectDropdown(By.name("bmonth"), contact.getBmonth());
        type(By.name("byear"), contact.getByear());
        selectDropdown(By.name("aday"), contact.getAday());
        selectDropdown(By.name("amonth"), contact.getAmonth());
        type(By.name("ayear"), contact.getAyear());
    }


    private void submitContactCreation() {
        click(By.name("submit"));
    }
    private  void getRetunToHomePage() {
        click(By.linkText("home"));
    }
    private void selectContact() {
        click(By.name("selected[]"));
    }
    private void removeSelectedContact() {
        click(By.linkText("delete"));
        manager.driver.switchTo().alert().accept();
    }

}



