package model;

import javax.swing.JButton;
import javax.swing.JComboBox;

public final class ContactData {
    private final String firstname;
    private final String lastname;
    private final String middlename;
    private final String nickname;
    private final JButton photo;
    private final String title;
    private final String company;
    private final String address;
    private final String home;
    private final String mobile;
    private final String work;
    private final String fax;
    private final String email;
    private final String email2;
    private final String email3;
    private final JComboBox<String> bday;     // Day dropdown
    private final JComboBox<String> bmonth;   // Month dropdown
    private final String byear;                // Year
    private final JComboBox<String> aday;     // Day dropdown for anniversary
    private final JComboBox<String> amonth;   // Month dropdown for anniversary
    private final String ayear;                // Year for anniversary

    public ContactData(String firstname, String lastname, String middlename, String nickname, JButton photo,
                       String title, String company, String address, String home, String mobile, String work,
                       String fax, String email, String email2, String email3, JComboBox<String> bday,
                       JComboBox<String> bmonth, String byear, JComboBox<String> aday,
                       JComboBox<String> amonth, String ayear) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.middlename = middlename;
        this.nickname = nickname;
        this.photo = photo;
        this.title = title;
        this.company = company;
        this.address = address;
        this.home = home;
        this.mobile = mobile;
        this.work = work;
        this.fax = fax;
        this.email = email;
        this.email2 = email2;
        this.email3 = email3;
        this.bday = bday!= null ? bday : createDayComboBox(); ;
        this.bmonth = bmonth != null ? bmonth : createMonthComboBox();
        this.byear = byear;
        this.aday = aday!= null ? aday : createDayComboBox();;
        this.amonth = amonth != null ? amonth : createMonthComboBox();
        this.ayear = ayear;
    }
    public ContactData() {
        this("", "", "", "", null, "", "", "", "", "", "", "", "", "", "",
                null, null, "", null, null, "");
    }


    public static JComboBox<String> createDayComboBox() {
        JComboBox<String> dayComboBox = new JComboBox<>();
        dayComboBox.addItem(null); // Allowing null as an option
        for (int i = 1; i <= 31; i++) {
            dayComboBox.addItem(String.valueOf(i));
        }
        return dayComboBox;
    }

   public static JComboBox<String> createMonthComboBox() {
        JComboBox<String> monthComboBox = new JComboBox<>();
        monthComboBox.addItem(null); // Allowing null as an option
        monthComboBox.addItem("January");
        monthComboBox.addItem("February");
        monthComboBox.addItem("March");
        monthComboBox.addItem("April");
        monthComboBox.addItem("May");
        monthComboBox.addItem("June");
        monthComboBox.addItem("July");
        monthComboBox.addItem("August");
        monthComboBox.addItem("September");
        monthComboBox.addItem("October");
        monthComboBox.addItem("November");
        monthComboBox.addItem("December");
        return monthComboBox;
    }

    public ContactData withFirstname(String firstname) {
        return new ContactData(firstname, this.lastname, this.middlename, this.nickname, this.photo, this.title,
                this.company, this.address, this.home, this.mobile, this.work, this.fax, this.email,
                this.email2, this.email3, this.bday, this.bmonth, this.byear, this.aday, this.amonth, this.ayear);
    }

    public ContactData withLastname(String lastname) {
        return new ContactData(this.firstname, lastname, this.middlename, this.nickname, this.photo, this.title,
                this.company, this.address, this.home, this.mobile, this.work, this.fax, this.email,
                this.email2, this.email3, this.bday, this.bmonth, this.byear, this.aday, this.amonth, this.ayear);
    }

    public ContactData withMiddlename(String middlename) {
        return new ContactData(this.firstname, this.lastname, middlename, this.nickname, this.photo, this.title,
                this.company, this.address, this.home, this.mobile, this.work, this.fax, this.email,
                this.email2, this.email3, this.bday, this.bmonth, this.byear, this.aday, this.amonth, this.ayear);
    }

    public ContactData withNickname(String nickname) {
        return new ContactData(this.firstname, this.lastname, this.middlename, nickname, this.photo, this.title,
                this.company, this.address, this.home, this.mobile, this.work, this.fax, this.email,
                this.email2, this.email3, this.bday, this.bmonth, this.byear, this.aday, this.amonth, this.ayear);
    }

    public ContactData withPhoto(JButton photo) {
        return new ContactData(this.firstname, this.lastname, this.middlename, this.nickname, photo, this.title,
                this.company, this.address, this.home, this.mobile, this.work, this.fax, this.email,
                this.email2, this.email3, this.bday, this.bmonth, this.byear, this.aday, this.amonth, this.ayear);
    }

    public ContactData withTitle(String title) {
        return new ContactData(this.firstname, this.lastname, this.middlename, this.nickname, this.photo, title,
                this.company, this.address, this.home, this.mobile, this.work, this.fax, this.email,
                this.email2, this.email3, this.bday, this.bmonth, this.byear, this.aday, this.amonth, this.ayear);
    }

    public ContactData withCompany(String company) {
        return new ContactData(this.firstname, this.lastname, this.middlename, this.nickname, this.photo, this.title,
                company, this.address, this.home, this.mobile, this.work, this.fax, this.email,
                this.email2, this.email3, this.bday, this.bmonth, this.byear, this.aday, this.amonth, this.ayear);
    }

    public ContactData withAddress(String address) {
        return new ContactData(this.firstname, this.lastname, this.middlename, this.nickname, this.photo, this.title,
                this.company, address, this.home, this.mobile, this.work, this.fax, this.email,
                this.email2, this.email3, this.bday, this.bmonth, this.byear, this.aday, this.amonth, this.ayear);
    }

    public ContactData withHome(String home) {
        return new ContactData(this.firstname, this.lastname, this.middlename, this.nickname, this.photo, this.title,
                this.company, this.address, home, this.mobile, this.work, this.fax, this.email,
                this.email2, this.email3, this.bday, this.bmonth, this.byear, this.aday, this.amonth, this.ayear);
    }

    public ContactData withMobile(String mobile) {
        return new ContactData(this.firstname, this.lastname, this.middlename, this.nickname, this.photo, this.title,
                this.company, this.address, this.home, mobile, this.work, this.fax, this.email,
                this.email2, this.email3, this.bday, this.bmonth, this.byear, this.aday, this.amonth, this.ayear);
    }

    public ContactData withWork(String work) {
        return new ContactData(this.firstname, this.lastname, this.middlename, this.nickname, this.photo, this.title,
                this.company, this.address, this.home, this.mobile, work, this.fax, this.email,
                this.email2, this.email3, this.bday, this.bmonth, this.byear, this.aday, this.amonth, this.ayear);
    }

    public ContactData withFax(String fax) {
        return new ContactData(this.firstname, this.lastname, this.middlename, this.nickname, this.photo, this.title,
                this.company, this.address, this.home, this.mobile, this.work, fax, this.email,
                this.email2, this.email3, this.bday, this.bmonth, this.byear, this.aday, this.amonth, this.ayear);
    }

    public ContactData withEmail(String email) {
        return new ContactData(this.firstname, this.lastname, this.middlename, this.nickname, this.photo, this.title,
                this.company, this.address, this.home, this.mobile, this.work, this.fax, email,
                this.email2, this.email3, this.bday, this.bmonth, this.byear, this.aday, this.amonth, this.ayear);
    }

    public ContactData withEmail2(String email2) {
        return new ContactData(this.firstname, this.lastname, this.middlename, this.nickname, this.photo, this.title,
                this.company, this.address, this.home, this.mobile, this.work, this.fax, this.email,
                email2, this.email3, this.bday, this.bmonth, this.byear, this.aday, this.amonth, this.ayear);
    }

    public ContactData withEmail3(String email3) {
        return new ContactData(this.firstname, this.lastname, this.middlename, this.nickname, this.photo, this.title,
                this.company, this.address, this.home, this.mobile, this.work, this.fax, this.email,
                this.email2, email3, this.bday, this.bmonth, this.byear, this.aday, this.amonth, this.ayear);
    }

    public ContactData withBday(JComboBox<String> bday) {
        return new ContactData(this.firstname, this.lastname, this.middlename, this.nickname, this.photo, this.title,
                this.company, this.address, this.home, this.mobile, this.work, this.fax, this.email,
                this.email2, this.email3, bday, this.bmonth, this.byear, this.aday, this.amonth, this.ayear);
    }

    public ContactData withBmonth(JComboBox<String> bmonth) {
        return new ContactData(this.firstname, this.lastname, this.middlename, this.nickname, this.photo, this.title,
                this.company, this.address, this.home, this.mobile, this.work, this.fax, this.email,
                this.email2, this.email3, this.bday, bmonth, this.byear, this.aday, this.amonth, this.ayear);
    }

    public ContactData withByear(String byear) {
        return new ContactData(this.firstname, this.lastname, this.middlename, this.nickname, this.photo, this.title,
                this.company, this.address, this.home, this.mobile, this.work, this.fax, this.email,
                this.email2, this.email3, this.bday, this.bmonth, byear, this.aday, this.amonth, this.ayear);
    }

    public ContactData withAday(JComboBox<String> aday) {
        return new ContactData(this.firstname, this.lastname, this.middlename, this.nickname, this.photo, this.title,
                this.company, this.address, this.home, this.mobile, this.work, this.fax, this.email,
                this.email2, this.email3, this.bday, this.bmonth, this.byear, aday, this.amonth, this.ayear);
    }

    public ContactData withAmonth(JComboBox<String> amonth) {
        return new ContactData(this.firstname, this.lastname, this.middlename, this.nickname, this.photo, this.title,
                this.company, this.address, this.home, this.mobile, this.work, this.fax, this.email,
                this.email2, this.email3, this.bday, this.bmonth, this.byear, this.aday, amonth, this.ayear);
    }

    public ContactData withAyear(String ayear) {
        return new ContactData(this.firstname, this.lastname, this.middlename, this.nickname, this.photo, this.title,
                this.company, this.address, this.home, this.mobile, this.work, this.fax, this.email,
                this.email2, this.email3, this.bday, this.bmonth, this.byear, this.aday, this.amonth, ayear);
    }

    // Getter methods
    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getMiddlename() {
        return middlename;
    }

    public String getNickname() {
        return nickname;
    }

    public JButton getPhoto() {
        return photo;
    }

    public String getTitle() {
        return title;
    }

    public String getCompany() {
        return company;
    }

    public String getAddress() {
        return address;
    }

    public String getHome() {
        return home;
    }

    public String getMobile() {
        return mobile;
    }

    public String getWork() {
        return work;
    }

    public String getFax() {
        return fax;
    }

    public String getEmail() {
        return email;
    }

    public String getEmail2() {
        return email2;
    }

    public String getEmail3() {
        return email3;
    }

    public JComboBox<String> getBday() {
        return bday;
    }

    public JComboBox<String> getBmonth() {
        return bmonth;
    }

    public String getByear() {
        return byear;
    }

    public JComboBox<String> getAday() {
        return aday;
    }

    public JComboBox<String> getAmonth() {
        return amonth;
    }

    public String getAyear() {
        return ayear;
    }
}

