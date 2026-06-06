package Basics;

public class Printprops {
    public static void main(String[] args) {

        // Basic print
        System.out.print("Hello world!");
        System.out.println(); // new line

        System.out.println("Today! I haven't been able to solve any " +
                "problem without brute force.");

        // Integer formatting
        System.out.printf("%d\n", 36);        // normal
        System.out.printf("%03d\n", 36);      // leading zeros

        // Floating point formatting
        System.out.printf("%.3f\n", 0.236768268f);   // 3 decimal places
        System.out.printf("%10.2f\n", 123.45678);    // width + precision

        // String formatting (alignment)
        System.out.printf("%-15s%-15s\n", "Hello", "World!"); // left aligned
        System.out.printf("%15s\n", "Right Align");           // right aligned

        // Mixed formatting
        System.out.printf("Name: %-10s | Followers: %03d\n", "Mexatlas", 36);

        // Boolean formatting
        System.out.printf("Status: %b\n", true);

        // Hexadecimal and Octal
        System.out.printf("Hex: %x\n", 255);
        System.out.printf("Octal: %o\n", 255);

        // Escape characters
        System.out.println("Line1\nLine2");
        System.out.println("Tab\tSpace");

        // Final structured output
        System.out.printf("\n%-15s%-15s%-10s\n", "Name", "Category", "Value");
        System.out.printf("%-15s%-15s%03d\n", "Mexatlas", "Followers", 36);
    }
}