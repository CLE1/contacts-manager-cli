package contacts;

import java.util.Locale;
import java.util.Scanner;

import static contacts.write2File.writingToFiles;

public class soYouWantToadd {

    //Start new code
//get user info
    public static void toAdd() {
        String needDashes;
        Scanner wizardHat = new Scanner(System.in);
        System.out.println("What is your name?");
        String first = wizardHat.next();
        System.out.println("Not your first name your last name!");
        String last = wizardHat.next();
        String wholename = first + " " + last;
        System.out.println("Can I get yo numba?");
        String digits = wizardHat.next();

        //new code

        //need to fix then add
//        addHyphens

        if (digits.length() == 3) {
            needDashes = digits.substring(0, 3) + "-" + digits.substring(3, 7);
        } else {
            needDashes = digits.substring(0, 3) + "-" + digits.substring(3, 6) + "-"
                    + digits.substring(6);
        }
        System.out.println("this is with dashes: " + needDashes);
//    }



        //end new code
        System.out.printf("You're a wizard %s!", first);

//        System.out.printf("You're a wizard %s!", first.substring(0,1).toUpperCase() + str.substring(1);
//        System. out.println(output););
        writingToFiles(wholename, formatNumber);

    }
}
