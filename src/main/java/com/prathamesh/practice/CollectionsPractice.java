package com.prathamesh.practice;

import java.util.*;

public class CollectionsPractice {
    public static void main(String[] args) {
        //ArrayList
        List<String> elements  = new ArrayList<>();
        elements.add("one");
        elements.add("two");
        elements.add("three");
        elements.add("four");
        elements.add("five");
        elements.add("six");
        System.out.println("Array List elements are : " + elements);

        //Linkedlist
        List<Integer> numbers = new LinkedList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);
        System.out.println("Linked List elements are : " + numbers);

        //Hashmap
        HashMap<String, String> record = new HashMap<>();
        record.put("Prathamesh","85");
        record.put("Varun","90");
        System.out.println("Hasmap elements are : " + record);

        //Hashset
        HashSet<String> stringHashSet = new HashSet<>();
        stringHashSet.add("Monday");
        stringHashSet.add("Tuesday");
        stringHashSet.add("Wednesday");
        stringHashSet.add("Thursday");
        stringHashSet.add("Friday");
        System.out.println("My working days are : " + stringHashSet);

        //Basic array
        String[] listArray = {"Jan","Feb","Mar","Apr","May"};
        for (int i = 0; i < listArray.length; i++) {
            System.out.println("Month number "+ (i+1) + " is "+ listArray[i]);
        }
    }
}
