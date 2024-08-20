package tests;

import model.ContactData;
import model.GroupData;
import org.checkerframework.checker.units.qual.C;
import org.junit.jupiter.api.Test;


public class DeleteContactTest extends TestBase {

    @Test
    public void TestdeleteContact() {
        if (app.contacts().isContactPresent()) {
            app.contacts().createContact(new ContactData());
        }
        app.contacts().removeContact();

    }

}



