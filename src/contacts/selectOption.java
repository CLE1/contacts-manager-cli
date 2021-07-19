package contacts;


import java.io.IOException;
import java.util.Scanner;

public class selectOption {
    public static void pickOne()  {

        Scanner scanner = new Scanner(System.in);

        int input = scanner.nextInt();

        switch (input) {
            case 1:
                getContent.pathstoGetContent();
                break;
            case 2:
               soYouWantToadd.toAdd();
                break;
            case 3:
                searchName.searchByName();
                break;
            case 4:
//
                System.out.println("Case 2");
                break;
            case 5:
                System.out.println("You are not worthy!");
                break;
            default:
                System.out.println("So you think you're slick huh");
                break;
        }

    }
}
