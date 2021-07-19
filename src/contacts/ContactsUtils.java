package contacts;

import java.util.Objects;

public class ContactsUtils {

    //fields
    String contactname;
    String phonenumber;

    //constructor
    public ContactsUtils(String contactname, String phonenumber) {
        this.contactname = contactname;
        this.phonenumber = phonenumber;
    }

    public String getContactname() {
        return contactname;
    }

    //getters and setters
    public void setContactname(String contactname) {
        this.contactname = contactname;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

}
