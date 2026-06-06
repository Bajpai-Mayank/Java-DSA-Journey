package Basics;

/*
 * Problem: String Comparison in Java
 * Description: Demonstrate differences between String, StringBuffer, and
 *              StringBuilder comparisons using ==, equals(), contentEquals(),
 *              and equalsIgnoreCase().
 *
 * Approach:
 * - Use multiple string types (String, StringBuffer, StringBuilder)
 * - Perform different comparisons:
 *     • Reference comparison using (==)
 *     • Content comparison using equals()
 *     • Cross-type comparison using contentEquals()
 *     • Case-insensitive comparison using equalsIgnoreCase()
 * - Print results to observe behavior clearly
 *
 * Time Complexity:
 * - O(1) for reference comparisons (==)
 * - O(n) for content-based comparisons (equals, contentEquals)
 *
 * Space Complexity: O(1)
 *
 * Difficulty: Easy to Medium
 *
 * Key Insight:
 * - String overrides equals() → compares content
 * - StringBuffer & StringBuilder do NOT override equals() → compares reference
 * - contentEquals() is useful for cross-type comparison
 *
 * Note: Logic and implementation are done by me. AI was used only to improve
 *       writing clarity and presentation.
 */
public class StringComparisonDemo {
    public static void main(String[] args) {

        // 🔹 String (Immutable, uses String Pool)
        String s1 = "Java";
        String s2 = "Java";
        String s3 = "Java";

        // 🔹 StringBuffer (Mutable, Thread-safe)
        StringBuffer sb1 = new StringBuffer("Java");
        StringBuffer sb2 = new StringBuffer("Java");

        // 🔹 StringBuilder (Mutable, Faster, not thread-safe)
        StringBuilder sb3 = new StringBuilder("Java");
        StringBuilder sb4 = new StringBuilder("Java");

        // 🔸 Comparisons Start Here

        System.out.println("=== STRING COMPARISON ===");
        System.out.println("s1.equals(s2): " + s1.equals(s2));   // true (content)
        System.out.println("s1 == s2: " + (s1 == s2));           // true (same pool)
        System.out.println("s1 == s3: " + (s1 == s3));           // false (new object)

        System.out.println("\n=== STRINGBUFFER COMPARISON ===");
        System.out.println("sb1.equals(sb2): " + sb1.equals(sb2)); // false (reference)
        System.out.println("sb1 == sb2: " + (sb1 == sb2));         // false

        System.out.println("\n=== STRINGBUILDER COMPARISON ===");
        System.out.println("sb3.equals(sb4): "
                + sb3.equals(sb4)); // false (reference)
        System.out.println("sb3 == sb4: "
                + (sb3 == sb4));         // false

        System.out.println("\n=== CROSS COMPARISON ===");
        System.out.println("s1.equals(sb1): "
                + s1.equals(sb1));              // false
        System.out.println("s1.contentEquals(sb1): "
                + s1.contentEquals(sb1)); // true

        System.out.println("\n=== CASE COMPARISON ===");
        String upper = "JAVA";
        String lower = "java";
        System.out.println("equals(): " +
                upper.equals(lower));             // false
        System.out.println("equalsIgnoreCase(): " +
                upper.equalsIgnoreCase(lower)); // true

        System.out.println("\n=== BEST PRACTICE ===");
        System.out.println("sb1 vs sb2 (content): " +
                sb1.toString().contentEquals(sb2)); // true
    }
}