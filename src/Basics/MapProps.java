package Basics;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

/*
 * Map Demo: HashMap vs LinkedHashMap vs TreeMap
 *
 * HashMap        → No order, fastest (O(1))
 * LinkedHashMap  → Maintains insertion order
 * TreeMap        → Sorted order (O(log n))
 *
 * Notes:
 * - Duplicate keys overwrite values
 * - Values can be duplicate
 */

public class MapProps {

    public static void main(String[] args) {
        MapProps obj = new MapProps();
        obj.hashMapDemo();
        obj.linkedHashMapDemo();
        obj.treeMapDemo();
    }

    public void hashMapDemo() {
        System.out.println("----- HashMap -----");

        Map<Integer, String> map = new HashMap<>();

        map.put(23, "Red");
        map.put(4, "Green");
        map.put(18, "Blue");

        System.out.println("Map: " + map);
        System.out.println("Size: " + map.size());
        System.out.println("Get(4): " + map.get(4));
        System.out.println("ContainsKey(4): " + map.containsKey(4));

        // Duplicate key demo
        map.put(4, "Yellow");
        System.out.println("After duplicate key (4): " + map);

        System.out.println("Keys:");
        for (int key : map.keySet()) {
            System.out.println(key);
        }

        System.out.println("Values:");
        for (String value : map.values()) {
            System.out.println(value);
        }

        map.clear();
        System.out.println("After clear: " + map);
    }

    public void linkedHashMapDemo() {
        System.out.println("\n----- LinkedHashMap -----");

        Map<Integer, String> map = new LinkedHashMap<>();

        map.put(23, "Red");
        map.put(4, "Green");
        map.put(18, "Blue");

        System.out.println("Map: " + map);
        System.out.println("Size: " + map.size());
        System.out.println("Get(4): " + map.get(4));
        System.out.println("ContainsKey(4): " + map.containsKey(4));

        // Duplicate key demo
        map.put(4, "Yellow");
        System.out.println("After duplicate key (4): " + map);

        System.out.println("Keys:");
        for (int key : map.keySet()) {
            System.out.println(key);
        }

        System.out.println("Values:");
        for (String value : map.values()) {
            System.out.println(value);
        }

        map.clear();
        System.out.println("After clear: " + map);
    }

    public void treeMapDemo() {
        System.out.println("\n----- TreeMap -----");

        Map<Integer, String> map = new TreeMap<>();

        map.put(23, "Red");
        map.put(4, "Green");
        map.put(18, "Blue");

        System.out.println("Map: " + map);
        System.out.println("Size: " + map.size());
        System.out.println("Get(4): " + map.get(4));
        System.out.println("ContainsKey(4): " + map.containsKey(4));

        // Duplicate key demo
        map.put(4, "Yellow");
        System.out.println("After duplicate key (4): " + map);

        System.out.println("Keys:");
        for (int key : map.keySet()) {
            System.out.println(key);
        }

        System.out.println("Values:");
        for (String value : map.values()) {
            System.out.println(value);
        }

        map.clear();
        System.out.println("After clear: " + map);
    }
}