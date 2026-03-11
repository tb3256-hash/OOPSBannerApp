public class uc5 {
    public static void main(String[] args) {
        
        // 1. Define and populate a String array using String.join()
        // The join method adds a space between each segment provided.
        String[] lines = {
            String.join(" ", "  *** ", " ***** "),
            String.join(" ", " ** ** ", " ** "),
            String.join(" ", " ** ** ", " ***** "),
            String.join(" ", " ** ** ", "    ** "),
            String.join(" ", "  *** ", " ***** ")
        };

        // 2. Use a for-each loop to iterate through the array and print each line
        for (String line : lines) {
            System.out.println(line);
        }
    }
}