package contacts;

import java.nio.file.Path;
import java.nio.file.Paths;

public class getPath {


    public static Path getPathto(String fileName) {
        verifyPath.verifyPathogens();
        return Paths.get(fileName);

    }
    public static Path getPathto(String childDirectory, String fileName) {
        verifyPath.verifyPathogens();
        return Paths.get(childDirectory, fileName);

    }

    public static Path getPathto(String parentDirectory, String childDirectory, String fileName) {
        verifyPath.verifyPathogens();
        return Paths.get(parentDirectory, childDirectory, fileName);

    }



}
