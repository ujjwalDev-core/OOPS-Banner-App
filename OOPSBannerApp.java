public class OOPSBannerApp {

    static class CharacterPatternMap {

        private final char character;
        private final String[] pattern;

        public CharacterPatternMap(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        public char getCharacter() {
            return character;
        }

        public String[] getPattern() {
            return pattern;
        }
    }

    public static String[] getCharacterPattern(char ch, CharacterPatternMap[] patterns) {
        for (CharacterPatternMap cp : patterns) {
            if (cp.getCharacter() == ch) {
                return cp.getPattern();
            }
        }
        return null;
    }

    public static void printBanner(String word, CharacterPatternMap[] patterns) {

        int height = 7;

        for (int row = 0; row < height; row++) {

            StringBuilder lineBuilder = new StringBuilder();

            for (int i = 0; i < word.length(); i++) {
                String[] charPattern = getCharacterPattern(word.charAt(i), patterns);
                if (charPattern != null) {
                    lineBuilder.append(charPattern[row]).append("  ");
                }
            }

            System.out.println(lineBuilder.toString());
        }
    }

    public static void main(String[] args) {

        String[] patternO = {
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        };

        String[] patternP = {
                " ***** ",
                "*     *",
                "*     *",
                " ***** ",
                "*      ",
                "*      ",
                "*      "
        };

        String[] patternS = {
                " ***** ",
                "*      ",
                "*      ",
                " ***** ",
                "      *",
                "      *",
                " ***** "
        };

        CharacterPatternMap[] patterns = {
                new CharacterPatternMap('O', patternO),
                new CharacterPatternMap('P', patternP),
                new CharacterPatternMap('S', patternS)
        };

        printBanner("OOPS", patterns);
    }
}