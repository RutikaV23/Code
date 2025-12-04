public class DoubleString {

    public static void main(String[] args) {
        String s = "abbaca";
        System.out.println("Original String: " + s);
        String result = duplicate(s);
        System.out.println("After Removing Adjacent Duplicates: " + result);
    }

    static String duplicate(String s) {
        if (s.length() <= 1) {
            return s;
        }

        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                // Remove the duplicate pair
                String newstr = s.substring(0, i) + s.substring(i + 2);
                // Call recursively
                return duplicate(newstr);
            }
        }

        return s; // No adjacent duplicates left
    }
}
