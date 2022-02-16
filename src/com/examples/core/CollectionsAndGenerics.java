package com.examples.core;

import java.util.*;


public class CollectionsAndGenerics {
    public static void main(String[] args) {
        //Collection is the parent class for List, ArrayList etc.

        //<======= Lists =======>
        Collection list = new ArrayList();
        list.add("1");
        list.add(1);
        list.add(true);
        System.out.println(list);

        //List doesn't have indexes
        //Use iterator to loop through the collection

        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        //Or enhanced for loop
        //for (Object item : list) {
        //    System.out.println(item);
        //}

        //ArrayList implements List, which in-turn implements collections
        //List has additional interfaces than collections which are more specific
        //Example, List provides a method to add an item at an index

        List list2 = new ArrayList();
        list2.add(0, "item at index 0");
        System.out.println(list2);

        //Generic specifies the type of data that can be stored in the collection.
        ArrayList<String> genericList = new ArrayList<>();
        genericList.add("This list can have only Strings in them");
        genericList.add(1, "Adding items at specific index");
        System.out.println(genericList);

        //Looping using size() and get() methods
        for (int i = 0; i < genericList.size(); i++) {
            System.out.println(genericList.get(i));
        }

        ArrayList<Integer> numList = new ArrayList();
        numList.add(23);
        numList.add(56);
        numList.add(34);
        numList.add(1, 78); //Adding at index

        //And other methods like reverse(), sort() etc
        Collections.sort(numList);
        Collections.reverse(numList);

        //sort() takes a comparator, to sort based on some logic
        Comparator<Integer> cp = (n1, n2) -> {      //lambda function
            return n1 % 10 > n2 % 10 ? 1 : -1;      //Logic to sort based on last digit of a number
        };

        Collections.sort(numList, cp);


        //<======= Sets =======>
        Set set = new HashSet();

        //Can only contain unique items
        set.add(1);
        set.add(1);
        set.add("some string");
        System.out.println(set);

        //Sort items in set by tree set
        Set treeSet = new TreeSet<>();
        treeSet.add(32);
        treeSet.add(12);
        treeSet.add(20);
        treeSet.add(2);
        System.out.println(treeSet);


        //<======= HashMap =======>
        //For storing key, value pairs
        Map<String, Double> map = new HashMap<>();
        map.put("latitude", 19.02);
        map.put("longitude", 21.02);
        System.out.println(map);

        //Fetching the value
        System.out.println(map.get("latitude"));

        Set<String> keys = map.keySet();
        for (String key : keys) {
            System.out.println(key + " " + map.get(key));
        }
    }
}
