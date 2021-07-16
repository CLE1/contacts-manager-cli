package contacts;

import java.util.ArrayList;
import java.util.List;

public class getContent {

    //method to get contacts {point at contacts txt file}
    public static List<String> toGetContent() {
        List<String> contentToWrite = new ArrayList<>();
        contentToWrite.add("This is a new line!");
        contentToWrite.add("ANOTHER LINE");
        contentToWrite.add("ANOTHER NOTHER LINE!!!!");

        return contentToWrite;
    }
}
