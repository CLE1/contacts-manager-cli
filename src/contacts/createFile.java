package contacts;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class createFile {

    public static void createFile2(Path path) {

        if (verifyPath.verifyPathogens(path)) {


            try {
                Files.createFile(path);

            } catch (IOException e) {

                System.out.println("This is the File,file.");
                e.printStackTrace();
            }
        } else {
            System.out.println("The file at: " + path.toAbsolutePath() + " already exists");

        }

    }
}
