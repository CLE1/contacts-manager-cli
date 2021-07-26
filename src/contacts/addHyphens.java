package contacts;

public class addHyphens {

    private static String fixNumber(String digits) {
        String needDashes;
        needDashes = digits.substring(0, 3) + "-" + digits.substring(3, 7) + "-"
                + digits.substring(6);
        return digits;

    }
}






















//        String field = Number.trim();
//        String formatNumber;
//        if (field.length() == 1) {
//            formatNumber = field.substring(0, 3) + "-" + field.substring(3, 7);
//        } else {
//            formatNumber = field.substring(0, 3) + "-" + field.substring(3, 6) + "-"
//                    + field.substring(6);
//        }
//        System.out.println(formatNumber);
//        return formatNumber;
//    }

