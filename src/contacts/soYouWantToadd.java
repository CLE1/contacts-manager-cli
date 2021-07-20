package contacts;

import java.util.Scanner;

import static contacts.write2File.writingToFiles;

public class soYouWantToadd {

    //Start new code
//get user info
    public static void toAdd() {
        Scanner wizardHat = new Scanner(System.in);
        System.out.println("What is your name?");
        String first = wizardHat.next();
        System.out.println("Not your first name your last name!");
        String last = wizardHat.next();
        String wholename = first + " " + last;
        System.out.println("Can I get yo numba?");
        String digits = wizardHat.next();

        //new code

        String trimNumber = digits.trim();
        String formatNumber = "";
        if (trimNumber.length() == 7) {
            formatNumber = trimNumber.substring(0, 3) + "-" + trimNumber.substring(3, 7);
        } else {
            formatNumber = trimNumber.substring(0, 3) + "-" + trimNumber.substring(3, 6) + "-"
                    + trimNumber.substring(6);
        }
        System.out.println("this is formatted: " + formatNumber);
//    }



        //end new code
        System.out.printf("You're a wizard %s!", first);
        writingToFiles(wholename, formatNumber);

    }
}
