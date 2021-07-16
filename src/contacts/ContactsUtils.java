package contacts;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

public class ContactsUtils {

    //fields
    String contactname;
    int phonenumber;

    //constructor
    public String getContactname() {
        return contactname;
    }

    //getters and setters
    public void setContactname(String contactname) {
        this.contactname = contactname;
    }

    public int getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(int phonenumber) {
        this.phonenumber = phonenumber;
    }

    public ContactsUtils(String contactname, int phonenumber) {
        this.contactname = contactname;
        this.phonenumber = phonenumber;
    }
}
