package contacts;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class readContacts {

    //method to get all entry from contacts text fiel
    public static List<String> readFromContactsTxt(Path path) throws IOException {
        return Files.readAllLines(path);
    }

}
