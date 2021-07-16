package contacts;

import java.nio.file.Path;
import java.nio.file.Paths;

public class getPath {

    public static Path getPath(String fileName) {
        return Paths.get(fileName);

    }

    public static Path getPath(String childDirectory, String fileName) {
        return Paths.get(childDirectory, fileName);

    }

    public static Path getPath(String parentDirectory, String childDirectory, String fileName) {
        return Paths.get(parentDirectory, childDirectory, fileName);

    }

}
