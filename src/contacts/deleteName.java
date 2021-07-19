package contacts;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class deleteName {
    public static boolean Delete(){
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Which contact do you want to delete?");
            String userInput = scanner.nextLine();

            List<String> lines = Files.readAllLines(Paths.get("src", "contacts", "test.txt"));
            List<String> newList = new ArrayList<>();

            for (String line : lines) {
                if (line.contains(userInput)) {
                    newList.remove(userInput);
                    break;
                } else if (line.isEmpty()) {
                    System.out.println("invalid input");
                    Delete();
                }
                newList.add(line);
                Files.write(Paths.get("src", "contacts", "test.txt"), newList);
                // Using .remove(index: ) will remove the contact place on the original list
                // Ex. if you put 'index:5' you'll remove the contact on line 5.

        }

        } catch (IOException e) {
            e.printStackTrace();
        }


        return false;

    }
}



