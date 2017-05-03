import java.util.Arrays;

public class SolutionB {

    // Returns an sorted string
    public static String sort(String str) {
        char[] cArr = str.toCharArray();
        str = str.toLowerCase();
        Arrays.sort(cArr);
        return Arrays.toString(cArr);
    }

    public static boolean checkPermutation(String str1, String str2) {
        // Base Case
        if (str1.length() != str2.length()) return false;

        return sort(str1).equals(sort(str2));
    }

    public static void main(String[] args) {
        String[][] words = {{"Hello", "eHllo"}, {"apple", "aeele"}, {"welp", "wlep"}};

        for (String[] pair : words) {
            String word1 = pair[0];
            String word2 = pair[1];

            System.out.println(word1 + ", " + word2 + ": " + checkPermutation(word1, word2));
        }
    }
}
