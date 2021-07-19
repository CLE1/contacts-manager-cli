package contacts;

public class addHyphens {

    private static String fixNumber (String Number){
        String trimNumber = Number.trim();
        String formatNumber = "";
        if (trimNumber.length() == 7) {
            formatNumber = trimNumber.substring(0, 3) + "-" + trimNumber.substring(3, 7);
        } else {
            formatNumber = trimNumber.substring(0, 3) + "-" + trimNumber.substring(3, 6) + "-"
                    + trimNumber.substring(6);
        }
        System.out.println(formatNumber);
        return formatNumber;
    }

}
