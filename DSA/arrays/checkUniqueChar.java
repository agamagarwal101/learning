import java.util.HashMap;

public class checkUniqueChar {

    private static boolean checkUniqueness(String s) {
        // Length of ASCII characters. If str len is greater than that, then not unique.
        if (s.length() > 128)
            return false;
        HashMap<Character, Integer> hm = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            if (hm.get(s.charAt(i)) != null && hm.get(s.charAt(i)) != 1) {
                return false;
            }
            if (hm.get(s.charAt(i)) == null) {
                hm.put(s.charAt(i), 1);
            } else {
                hm.put(s.charAt(i), hm.get(s.charAt(i)) + 1);
            }
        }
        for (int i = 0; i < s.length(); i++) {
            if (hm.get(s.charAt(i)) != 1) {
                return false;
            }
        }
        return true;

    }

    // Using storage O(c) - c : len of character set.
    private static boolean improved(String s) {
        if (s.length() > 128) {
            return false;
        }

        boolean[] char_set = new boolean[128];
        for (int i = 0; i < s.length(); i++) {
            if (char_set[s.charAt(i)]) {
                return false;
            }
            char_set[s.charAt(i)] = true;
        }
        return true;
    }

    public static void main(String args[]) {
        System.out.println(checkUniqueness("agam"));
        System.out.println(checkUniqueness("qwerty"));
        System.out.println(checkUniqueness("test"));
        System.out.println(checkUniqueness("macbok"));

        System.out.println(improved("agam"));
        System.out.println(improved("qwerty"));
        System.out.println(improved("test"));
        System.out.println(improved("macbok"));
    }
}