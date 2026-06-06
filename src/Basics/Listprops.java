package Basics;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

/*
 * List Demo: ArrayList vs LinkedList vs Vector
 *
 * ArrayList   → Dynamic array, fast access (O(1))
 * LinkedList  → Doubly linked list, fast insertion/deletion
 * Vector      → Thread-safe, slower
 *
 * Notes:
 * - Maintains insertion order
 * - Allows duplicate elements
 * - Index-based access
 * - AI used to create it as similar properties like map.
 */

public class Listprops {

    public static void main(String[] args) {
        Listprops obj = new Listprops();
        obj.arrayListDemo();
        obj.linkedListDemo();
        obj.vectorDemo();
    }

    public void arrayListDemo() {
        System.out.println("----- ArrayList -----");

        List<String> list = new ArrayList<>();

        list.add("Red");
        list.add("Green");
        list.add("Blue");

        System.out.println("List: " + list);
        System.out.println("Size: " + list.size());
        System.out.println("Get(1): " + list.get(1));
        System.out.println("Contains 'Green': " + list.contains("Green"));

        // Duplicate element demo
        list.add("Green");
        System.out.println("After duplicate: " + list);

        System.out.println("Elements:");
        for (String value : list) {
            System.out.println(value);
        }

        list.remove(1);
        System.out.println("After remove index 1: " + list);

        list.clear();
        System.out.println("After clear: " + list);
    }

    public void linkedListDemo() {
        System.out.println("\n----- LinkedList -----");

        List<String> list = new LinkedList<>();

        list.add("Red");
        list.add("Green");
        list.add("Blue");

        System.out.println("List: " + list);
        System.out.println("Size: " + list.size());
        System.out.println("Get(1): " + list.get(1));
        System.out.println("Contains 'Green': " + list.contains("Green"));

        list.add("Green");
        System.out.println("After duplicate: " + list);

        System.out.println("Elements:");
        for (String value : list) {
            System.out.println(value);
        }

        list.remove(1);
        System.out.println("After remove index 1: " + list);

        list.clear();
        System.out.println("After clear: " + list);
    }

    public void vectorDemo() {
        System.out.println("\n----- Vector -----");

        List<String> list = new Vector<>();

        list.add("Red");
        list.add("Green");
        list.add("Blue");

        System.out.println("List: " + list);
        System.out.println("Size: " + list.size());
        System.out.println("Get(1): " + list.get(1));
        System.out.println("Contains 'Green': " + list.contains("Green"));

        list.add("Green");
        System.out.println("After duplicate: " + list);

        System.out.println("Elements:");
        for (String value : list) {
            System.out.println(value);
        }

        list.remove(1);
        System.out.println("After remove index 1: " + list);

        list.clear();
        System.out.println("After clear: " + list);
    }
}