package tests;

import model.ContactData;
import org.junit.jupiter.api.Test;

public class ContactCreationTest extends TestBase {
    @Test
    public void TestContactCreation() {
        app.contacts().createContact(new ContactData("Lena", "Doe", "Middle", "Johnny", null, "Mr.",
                "Company Inc.", "123 Main St", "123456789", "987654321", "555555555", "123456",
                "john.doe@example.com", "john.doe2@example.com", "john.doe3@example.com",
                null, null, "1990", null, null, "1992"));
    }

    @Test
    public void TestContactCreationEmptyFields() {
        app.contacts().createContact(new ContactData());
    }
        @Test
        public void TestContactCreationWithFirstName() {
            app.contacts().createContact(new ContactData().withFirstname("Alice"));
        }

        @Test
        public void TestContactCreationWithLastName() {
            app.contacts().createContact(new ContactData().withLastname("Smith"));
        }

        @Test
        public void TestContactCreationWithEmail() {
            app.contacts().createContact(new ContactData().withEmail("alice.smith@example.com"));
        }
    }

