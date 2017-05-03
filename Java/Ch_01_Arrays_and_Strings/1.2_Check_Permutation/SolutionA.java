public class SolutionA {

    public static boolean checkPermutation(String str1,String str2) {
        // Base Case
        if (str1.length() != str2.length()) return false;

        int char_set[] = new int[128];

        for (int i = 0; i < str1.length(); i++) {
            char_set[(int)str1.charAt(i)]++;
        }

        for (int i = 0; i < str2.length(); i++) {
            char_set[(int)str2.charAt(i)]--;
            // Negative number indicates character discrepency
            if (char_set[(int)str2.charAt(i)] < 0) return false;
        }

        return true;
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
