import java.util.HashMap;
import java.util.Map;

public class UC8 {

    // Global constant for pattern height to keep code clean
    private static final int PATTERN_HEIGHT = 5;

    // Part 2: Utility Static Methods
    
    /**
     * 1. Define a method createCharacterMap() to initialize a HashMap with character patterns
     */
    public static HashMap<Character, String[]> createCharacterMap() {
        HashMap<Character, String[]> charMap = new HashMap<>();

        // Populate charMap with patterns for 'O', 'P', 'S', and ' '
        charMap.put('O', new String[]{
            "  OOO  ", " O   O ", " O   O ", " O   O ", "  OOO  "
        });
        charMap.put('P', new String[]{
            " PPPP  ", " P   P ", " PPPP  ", " P     ", " P     "
        });
        charMap.put('S', new String[]{
            "  SSSS ", " S     ", "  SSS  ", "     S ", " SSSS  "
        });
        charMap.put(' ', new String[]{
            "       ", "       ", "       ", "       ", "       "
        });

        return charMap;
    }

    /**
     * 2. Implement displayBanner to render the message using the character map
     */
    public static void displayBanner(String message, HashMap<Character, String[]> charMap) {
        // Loop through each line of the pattern height
        for (int line = 0; line < PATTERN_HEIGHT; line++) {
            StringBuilder sb = new StringBuilder();
            
            // Loop through each character in the message string
            for (char ch : message.toUpperCase().toCharArray()) {
                // Retrieve the pattern for the current character
                String[] pattern = charMap.get(ch);
                
                // If character isn't in map, default to space
                if (pattern == null) {
                    pattern = charMap.get(' ');
                }
                
                // Append the specific line of the current character's pattern
                sb.append(pattern[line]).append("  "); // Adding space between characters
            }
            // Print the assembled line for the whole message
            System.out.println(sb.toString());
        }
    }

    // Part 3: Main Method
    public static void main(String[] args) {
        // Initialize the map
        HashMap<Character, String[]> charMap = createCharacterMap();
        
        // Define the message to display
        String message = "OOPS";
        
        System.out.println("--- Rendering Banner ---");
        displayBanner(message, charMap);
        System.out.println("------------------------");
    }
}