package Basics;

import java.util.Scanner;

public class StringToken {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
        scan.close();
        String[] words = s.split("[^a-zA-Z]+");

        int count = 0;

        for (String word : words) {
            if (!word.isEmpty()) {
                count++;
            }
        }

        System.out.println(count);

        for (String word : words) {
            if (!word.isEmpty()) {
                System.out.println(word);
            }
        }
    }
}

