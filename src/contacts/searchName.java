package contacts;

import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class searchName {
//    private static File filePath;
    private static Path filePath = Paths.get("src", "contacts", "test.txt");

    private static File file = new File("src","contacts");
    private static BufferedReader reader;
    private static Writer out;
    public static boolean searchByName(){
        Scanner bunnyHop= new Scanner(System.in);
        System.out.println("Enter a name");
        String wingStop = bunnyHop.next();
            try {
                BufferedReader reader = new BufferedReader(new FileReader(String.valueOf(filePath)));
                while(reader.ready()) {
                    String line = reader.readLine();
                    if (line.isEmpty() || line.isBlank()) {
                    } else {
                        if (line.contains(wingStop)) {
                            System.out.println("Name     |     Phone #");
                            System.out.println(line.replace("/", " | "));
                            return (line.contains(wingStop));
                        }
                    }
                }
                System.out.println("That name is not on your contacts list!");
            } catch (IOException e) {
                return false;
            }
            return false;
        }


}

