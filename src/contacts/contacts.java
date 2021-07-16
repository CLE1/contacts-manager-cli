package contacts;

import java.nio.file.Path;
import java.nio.file.Paths;

public class contacts {

    // creates a variable that create a directory
    Path path = getPath.getPath("src", "contacts", "Contact List");
        getPath.createDirectory.createDirectory2(path);

    // creates variable that creates a file
    path = Paths.get(path.toString(), "testfile.txt");
        getPath.createFile(path);
}
