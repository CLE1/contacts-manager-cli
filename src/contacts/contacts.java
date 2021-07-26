package contacts;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import static contacts.createDirectory.createDirectory2;
import static contacts.createFile.createFile2;


public class contacts {
//path for file
    public static Path method4getContacts() {
        return getPath.getPathto("src", "contacts", "test.txt");
//        verifyPath.verifyPathogens();
    }


        public static List<String> contactsRelated() {

        // creates a variable that create a directory
        Path path = getPath.getPathto("src", "contacts", "test.txt");
        createDirectory2(path);



        // creates variable that creates a file
        path = Paths.get(path.toString(), "test.txt");
        createFile2(path);



//    // Try to write to the file
//        IOUtil.tryWriteToFile(getContent(), path);
//        IOUtil.tryWriteToFile(contacts, path);
//        IOUtil.tryPrintContents(path);
        return null;
    }
}
