package contacts;

import java.nio.file.Path;
import java.nio.file.Paths;

public class contacts {

    // Try to create the directory
    Path path = getPath.getPath("src", "fileIO", "files");
        getPath.createDirectory.createDirectory2(path);

    // Try to create the file
    path = Paths.get(path.toString(), "test.txt");
        getPath.createFile(path);
}
