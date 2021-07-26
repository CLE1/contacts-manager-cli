package contacts;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class createDirectory {

    public static void createDirectory2(Path pathToCreate) {

        if (verifyPath.verifyPathogens(pathToCreate)) {


            try {
                Files.createDirectory(pathToCreate);

            } catch (IOException e) {

                System.out.println("Yo what it do?");
                e.printStackTrace();

            }
        }else{
            System.out.println("The file at: " + pathToCreate.toAbsolutePath() + " already exists");
            }
        }

    }

