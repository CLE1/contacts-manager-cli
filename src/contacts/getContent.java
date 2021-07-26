package contacts;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class getContent {

//    method to view contacts
    public static void pathstoGetContent() {
        try {
            //need to fix
//            contacts.method4getContacts();

            Path filePath = Paths.get("src", "contacts", "test.txt");
            List<String> file = Files.readAllLines(contacts.method4getContacts());
            for (String s : file) {
                System.out.println(s);
            }

        } catch (IOException e) {
            System.out.println("Error with toGetContent");
            e.printStackTrace();
        }
    }
}

