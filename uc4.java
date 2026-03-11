public class uc4 {
    public static void main(String[] args) {
        // 1. Define a String array with a size equal to the number of lines (7 lines)
        String[] lines = new String[7];

        // 2. Populate each index of the array using String.join()
        // This creates the "OS" banner pattern
        lines[0] = String.join("", "  *** ", " ***** ");
        lines[1] = String.join("", " ** **", " ** ");
        lines[2] = String.join("", " ** ", " ** ");
        lines[3] = String.join("", " ** ", " ***** ");
        lines[4] = String.join("", " ** ", "     **");
        lines[5] = String.join("", " ** **", " ** **");
        lines[6] = String.join("", "  *** ", " ***** ");

        // 3. Use a for-each loop to iterate through the array and print each line
        // This demonstrates how loops eliminate repetitive print statements
        for (String line : lines) {
            System.out.println(line);
        }
    }
}