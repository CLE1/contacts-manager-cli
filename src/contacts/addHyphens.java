package contacts;

public class addHyphens {

    private static String fixNumber (String Number){
        String field = Number.trim();
        String formatNumber;
        if (field.length() == 1) {
            formatNumber = field.substring(0, 3) + "-" + field.substring(3, 7);
        } else {
            formatNumber = field.substring(0, 3) + "-" + field.substring(3, 6) + "-"
                    + field.substring(6);
        }
        System.out.println(formatNumber);
        return formatNumber;
    }

}
