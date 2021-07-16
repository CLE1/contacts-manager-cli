package contacts;


import java.util.Scanner;

public class selectOption {
    public static void pickOne(int option){

        Scanner scanner = new Scanner(System.in);

        int input = scanner.nextInt();

        switch (input) {
            case 1:
                getContent.toGetContent();
                System.out.println("Case 1");
                // Fall through!
            case 2:
//                write2File.writingToFiles();
                System.out.println("Case 2");
                break;
            case 3:

                System.out.println("Case 1");
                // Fall through!
            case 4:
//
                System.out.println("Case 2");
                break;
            case 5:
//
                System.out.println("Case 2");
                break;
            default:
                System.out.println("Default case");
                break;
        }

    }
}
