package Basics;

public class ValidParentheses {
    public static void main(String[] args) {
        ValidParentheses obj = new ValidParentheses();
        System.out.println(obj.isValid("{()}{}[)"));
    }

    public boolean isValid(String s) {
        int a = 0, b = 0;
        int i = 0;
        int len = s.length();
        while (i < len) {
            char ch = s.charAt(i);
            if (s.contains("{") || s.contains("[") || s.contains("(")) {
                if (ch == '}' || ch == ']' || ch == ')') {
                    a++;
                }
            }
            i++;
        }
        return a == (len / 2);
    }
}
