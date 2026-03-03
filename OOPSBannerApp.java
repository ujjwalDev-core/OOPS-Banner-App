import java.util.HashMap;
import java.util.Map;

public class OOPSBannerApp {

    public static Map<Character, String[]> buildCharacterMap() {

        Map<Character, String[]> bannerMap = new HashMap<>();

        bannerMap.put('O', new String[]{
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        });

        bannerMap.put('P', new String[]{
                " ***** ",
                "*     *",
                "*     *",
                " ***** ",
                "*      ",
                "*      ",
                "*      "
        });

        bannerMap.put('S', new String[]{
                " ***** ",
                "*      ",
                "*      ",
                " ***** ",
                "      *",
                "      *",
                " ***** "
        });

        return bannerMap;
    }

    public static void printBanner(String message,
                                   Map<Character, String[]> bannerMap) {

        int height = 7;

        for (int row = 0; row < height; row++) {

            StringBuilder line = new StringBuilder();

            for (int col = 0; col < message.length(); col++) {

                char ch = message.charAt(col);
                String[] pattern = bannerMap.get(ch);

                if (pattern != null) {
                    line.append(pattern[row]).append("  ");
                }
            }

            System.out.println(line);
        }
    }

    public static void main(String[] args) {

        Map<Character, String[]> bannerMap = buildCharacterMap();
        printBanner("OOPS", bannerMap);
    }
}