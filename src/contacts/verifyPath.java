package contacts;

import java.nio.file.Files;
import java.nio.file.Path;

public class verifyPath {
    public static boolean verifyPathogens(Path path) {

        return Files.notExists(path);

    }

    public static void verifyPathogens() {
    }
}
