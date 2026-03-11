public class uc4 {
    public static void main(String[] args) {

        // 1. Define the array
        String[] lines = new String[7];

        // 2. Populate the array using String.join()
        lines[0] = String.join(" ", " ", "  ***   ", "   ***** ");
        lines[1] = String.join(" ", " ", " *   *  ", "  *     * ");
        lines[2] = String.join(" ", " ", " **   ** ", "  *     * ");
        lines[3] = String.join(" ", " ", " **   ** ", "   ***** ");
        lines[4] = String.join(" ", " ", " **   ** ", "       ** ");
        lines[5] = String.join(" ", " ", "  *   *  ", "   **   ** ");
        lines[6] = String.join(" ", " ", "   ***   ", "    ***** ");

        // 3. Print using for-each loop
        for (String line : lines) {
            System.out.println(line);
        }
    }
}