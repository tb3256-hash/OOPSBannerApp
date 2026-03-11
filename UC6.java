public class uc6 {

    public static void main(String[] args) {
        // Step 2: Call the methods to get the patterns
        String[] oPattern = getOPattern();
        String[] pPattern = getPPattern();
        String[] sPattern = getSPattern();

        // Step 3: Use a loop to print each line of the banner side-by-side
        for (int i = 0; i < oPattern.length; i++) {
            System.out.println(oPattern[i] + "  " + pPattern[i] + "  " + sPattern[i]);
        }
    }

    // Method to create 'O' pattern
    public static String[] getOPattern() {
        return new String[] {
            "  *** ",
            " ** ** ",
            "** **",
            "** **",
            "** **",
            " ** ** ",
            "  *** "
        };
    }

    // Method to create 'P' pattern
    public static String[] getPPattern() {
        return new String[] {
            " ***** ",
            " ** ** ",
            " ** ** ",
            " ***** ",
            " ** ",
            " ** ",
            " ** "
        };
    }

    // Method to create 'S' pattern
    public static String[] getSPattern() {
        return new String[] {
            "  **** ",
            " ** ** ",
            " ** ",
            "  **** ",
            "     ** ",
            " ** ** ",
            "  **** "
        };
    }
}