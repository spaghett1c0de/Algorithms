
public class SolutionA {
    public static boolean is_Unique(String str1) {
        // Base Case
        if (str1.length() > 128) {
            return false;
        }

        boolean[] char_set = new boolean[128];
        boolean doesExist = false;

        for (int i = 0; i < str1.length(); i++) {
            if (char_set[(int)str1.charAt(i)]) {
                return false;
            }
            char_set[(int)str1.charAt(i)] = true;
        }

        return true;
    }

    public static void main(String[] args) {
        String[] words = {"hello", "world"};

        for (String word : words) {
            System.out.println(word + ": " + is_Unique(word));
        }
    }
}
