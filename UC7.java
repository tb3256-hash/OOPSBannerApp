public class UC7 {

    // 1. Define CharacterPatternMap class
    static class CharacterPatternMap {
        char character;
        String[] pattern;

        public CharacterPatternMap(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        public char getCharacter() { return character; }
        public String[] getPattern() { return pattern; }
    }

    // 2. Create method to initialize the array for O, P, S, and space
    public static CharacterPatternMap[] createCharacterPatternMaps() {
        CharacterPatternMap[] maps = new CharacterPatternMap[4];

        maps[0] = new CharacterPatternMap('O', new String[]{
            " XXX ", "X   X", "X   X", "X   X", " XXX "
        });
        maps[1] = new CharacterPatternMap('P', new String[]{
            "XXXX ", "X   X", "XXXX ", "X    ", "X    "
        });
        maps[2] = new CharacterPatternMap('S', new String[]{
            " XXXX", "X    ", " XXX ", "    X", "XXXX "
        });
        maps[3] = new CharacterPatternMap(' ', new String[]{
            "     ", "     ", "     ", "     ", "     "
        });

        return maps;
    }

    // 3. Implement getCharacterPattern to retrieve pattern for a given char
    public static String[] getCharacterPattern(char ch, CharacterPatternMap[] charMaps) {
        for (CharacterPatternMap map : charMaps) {
            if (Character.toUpperCase(ch) == map.getCharacter()) {
                return map.getPattern();
            }
        }
        // Return space pattern if character not found
        return charMaps[3].getPattern();
    }

    // 4. Use printMessage to render the banner
    public static void printMessage(String message, CharacterPatternMap[] charMaps) {
        int height = 5; // Height of our patterns

        for (int i = 0; i < height; i++) {
            StringBuilder line = new StringBuilder();
            for (char ch : message.toCharArray()) {
                String[] pattern = getCharacterPattern(ch, charMaps);
                line.append(pattern[i]).append("  "); // Add space between letters
            }
            System.out.println(line);
        }
    }

    // Main Method
    public static void main(String[] args) {
        CharacterPatternMap[] charMaps = createCharacterPatternMaps();
        String message = "OPS"; 
        
        System.out.println("Rendering Banner for: " + message + "\n");
        printMessage(message, charMaps);
    }
}