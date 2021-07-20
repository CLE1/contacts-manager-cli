package contacts;
public class addHyphens {
    private static String fixNumber (String digits){

        String needDashes;
        if (digits.length() == 3) {
            needDashes = digits.substring(0, 3) + "-" + digits.substring(3, 7);
        } else {
            needDashes = digits.substring(0, 3) + "-" + digits.substring(3, 6) + "-"
                    + digits.substring(6);
        }
        System.out.println("this is with dashes: " + needDashes);

        System.out.println(digits);
        return digits;
    }
}
