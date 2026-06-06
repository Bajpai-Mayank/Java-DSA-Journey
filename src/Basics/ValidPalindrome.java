package Basics;

public class ValidPalindrome {

    public static void main(String[] args) {
        ValidPalindrome obj = new ValidPalindrome();

        String input = "A man, a plan, a canal: Panama";

        System.out.println("Input: " + input);

        // Run both approaches
        obj.myApproach(input);
        obj.optimizedApproach(input);
    }

    // 🧩 My Approach (Using StringBuilder + Reverse)
    // Time: ~17ms | Space: O(n)
    // Step-by-step cleaning + rebuilding + reversing
    public void myApproach(String s) {

        // Normalize string
        s = s.toLowerCase().trim();

        // Split using non-alphanumeric characters
        String[] sta = s.split("[^a-z0-9]+");

        // Build cleaned string
        StringBuilder str = new StringBuilder();
        for (String a : sta) {
            if (!a.isEmpty()) {   // ignore empty tokens
                str.append(a);
            }
        }

        // Reverse the cleaned string
        StringBuilder rev = new StringBuilder(str);
        rev.reverse();

        // Compare both
        System.out.println("My Approach Result: " +
                str.toString().contentEquals(rev));
    }

    // ⚡ Optimized Approach (Two Pointers)
    // Time: O(n) | Space: O(1)
    // No extra string, compare directly
    public void optimizedApproach(String s) {

        int left = 0;
        int right = s.length() - 1;

        while (left < right) {

            char l = s.charAt(left);
            char r = s.charAt(right);

            // Skip non-alphanumeric characters
            if (!Character.isLetterOrDigit(l)) {
                left++;
            } else if (!Character.isLetterOrDigit(r)) {
                right--;
            } else {
                // Compare characters (case-insensitive)
                if (Character.toLowerCase(l) != Character.toLowerCase(r)) {
                    System.out.println("Optimized Result: false");
                    return;
                }
                left++;
                right--;
            }
        }

        System.out.println("Optimized Result: true");
    }
}