package contacts;

import java.nio.file.Path;
import java.nio.file.Paths;

import static contacts.createDirectory.createDirectory2;
import static contacts.createFile.createFile2;


public class contacts {
    public static void contactsRelated() {

        // creates a variable that create a directory
        Path path = getPath.getPath("src", "contacts", "Contact List");
        createDirectory2(path);

//        // Try to create the directory
//        Path path = FileDirectoryUtil.getPath("src", "fileIO", "files");
//        FileDirectoryUtil.tryCreateDirectory(path);
//
//// Try to create the file
//        path = Paths.get(path.toString(), "test.txt");
//        FileDirectoryUtil.tryCreateFile(path);

        // creates variable that creates a file
        path = Paths.get(path.toString(), "testfile.txt");
        createFile2(path);

//    // Try to print the contents of the file BEFORE we write
//        IOUtil.tryPrintContents(path);
//
//    // Try to write to the file
//        IOUtil.tryWriteToFile(getContent(), path);
//
//    // Try to print the contents of the file AFTER we write
//        IOUtil.tryPrintContents(path);
    }
}
