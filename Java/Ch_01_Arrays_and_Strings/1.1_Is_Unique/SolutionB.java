import java.util.HashSet;

public class SolutionB {
    public static boolean is_Unique(String str1) {
        HashSet<Character> set = new HashSet<Character>();
        for (int i = 0; i < str1.length(); i++) {
            if (set.contains(str1.charAt(i))) {
                return false;
            }
            set.add(str1.charAt(i));
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
