package contacts;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

public class ContactsUtils {

    //method to write to contacts text file
    public static void writingToFiles(List<String> content, Path path) {
        try {
            Files.write(path, content, StandardOpenOption.APPEND);
        } catch (IOException e) {
            System.out.println("Could not write to file at: " + path.toAbsolutePath());
        }
    }

    //method to get all entry from contacts text fiel
    public static List<String> readFromContactsTxt(Path path) throws IOException {
        return Files.readAllLines(path);
    }

    //method to choose what information to sout from contacts txt
    public static void printFileContactsTxt(List<String> contents) {
        for (String line : contents) {
            System.out.println(line);
        }
    }

    //method to get contacts {point at contacts txt file}
    public static List<String> togetContent() {
        List<String> contentToWrite = new ArrayList<>();
        contentToWrite.add("This is a new line!");
        contentToWrite.add("ANOTHER LINE");
        contentToWrite.add("ANOTHER NOTHER LINE!!!!");

        return contentToWrite;
    }
}
