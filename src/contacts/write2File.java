package contacts;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;


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
        try {
            //need to delete Standard.... to have delete method
            Files.write(contacts.method4getContacts(), Arrays.asList(
                    wholename, digits), StandardOpenOption.APPEND);
        } catch (IOException e) {
            System.out.println("Error at writingToFiles method");
        }
    }
}

//End new code

//method to write to contacts text file
//    public static void writingToFiles(List<String> content, Path path) {
//        try {
//            Files.write(path, content, StandardOpenOption.APPEND);
//        } catch (IOException e) {
//            System.out.println("Could not write to file at: " + path.toAbsolutePath());
//        }
//    }

//}
