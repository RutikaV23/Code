public class UpperLowerCase {
    public static void main(String[] args) {
        String s = "AbCdeF";
        StringBuilder sb = new StringBuilder();

        for (char ch : s.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                sb.append(Character.toLowerCase(ch));
            } else if (Character.isLowerCase(ch)) {
                sb.append(Character.toUpperCase(ch));
            } else {
                sb.append(ch); // For any other characters
            }
        }

        System.out.println(sb.toString());
    }
}
