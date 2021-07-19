package contacts;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class write2File {

    public write2File(String wholename, String digits) {
    }


//adding first and last name
//        String digits = ;
//        List<String> content = new ArrayList<>();
//        String contents = name + " : " + num;
//        content.add(contents);

//        contacts.


    public static void writingToFiles(String wholename, String digits) {
//    method to write to contacts text file
        List<String> content = new ArrayList<>();
        String contents = wholename + " | " + digits + "|";
        content.add(contents);
        try {
            //need to delete Standard.... to have delete method
            Files.write(contacts.method4getContacts(), Arrays.asList(
                    contents), StandardOpenOption.APPEND);
        } catch (IOException e) {
            System.out.println("Error at writingToFiles method");
        }
    }
}