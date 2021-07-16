package contacts;

import java.util.List;

public class printContacts {

    //method to choose what information to sout from contacts txt
    public static void printFileContactsTxt(List<String> contents) {
        for (String line : contents) {
            System.out.println(line);
        }
    }

}
