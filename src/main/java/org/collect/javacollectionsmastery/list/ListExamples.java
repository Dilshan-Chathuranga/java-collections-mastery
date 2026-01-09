package org.collect.javacollectionsmastery.list;

import java.util.*;

/**
 * Author: Dilshan Chathuranga
 * Date: 9/1/2026
 * Description: ListExamples class
 */

public class ListExamples {
    public static void main(String[] args) {
        addListExample();
        printListExample();
    }

    //List
    public static void addListExample() {
        List<String> list = new ArrayList<String>();
        //add
        list.add("A");
        list.add("Ball");
        list.add("AWS");
        list.add("Ddog");
        list.add("AWS");
        //print list
        list.forEach(System.out::println);
        readListExample(list);
    }

    public static void readListExample(List<String> list) {
        System.out.println("Read List -----------------");
        list.forEach(System.out::println);
        System.out.println("get first element :" + list.get(0));
        System.out.println("get second element :" + list.get(1));
        System.out.println("get third element :" + list.get(2));
        updateListExample(list);
    }

    public static void updateListExample(List<String> list) {
        System.out.println("update List -----------------");
        list.set(0, " Szasdasdadsad");
        list.forEach(System.out::println);
        System.out.println("toUpperCase-----------------");
        list.replaceAll(s -> s.toUpperCase()); // Java 8+
        list.forEach(System.out::println);
        searchListExample(list);
    }

    public static void searchListExample(List<String> list) {

        boolean contains = list.contains("Z");
        int firstIndex = list.indexOf("AWS");//get the first index of starting with AWS (2)
        int lastIndex = list.lastIndexOf("AWS");//get the last index of aws value in the list(4)
        System.out.println("searchListExample contains " + contains + " " + firstIndex + " " + lastIndex);
    }

    public static void printListExample() {
        System.out.println("----------------------------------for loop start");
        List<String> list = new ArrayList<>(
                List.of("Java", "Spring", "Docker", "AWS", "Kubernetes")
        );
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println("----------------------------------for loop end");//fast for arrylist and slow for linkedlist
        System.out.println("----------------------------------for each start");//clean and readable but cannot remove elements
        for (String s : list) {
            System.out.println(s);
        }
        System.out.println("----------------------------------for each end");
        System.out.println("----------------------------------iterator start");//✔ Safe removal using iterator.remove()
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("----------------------------------iterator end");
        System.out.println("----------------------------------list iterator start");
        ListIterator<String> stringListIterator = list.listIterator();
        while (stringListIterator.hasNext()) {
            System.out.println(stringListIterator.next());
        }
        System.out.println("----------------------------------list iterator reverse print");

        while (stringListIterator.hasPrevious()) {
            System.out.println(stringListIterator.previous());
        }
        System.out.println("----------------------------------list iterator end");
        System.out.println("----------------------------------foreach start");
        list.forEach(item -> System.out.println(item));

    }
}
