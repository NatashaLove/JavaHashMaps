package com.company;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class JavaHashMaps {

    public static void main(String[] args) {
        //HashMap are efficient for locating a value based on a key
        // and inserting and deleting values based on a key.
	// Hashmaps (key --> value : 1 --> Paul) - 2 items are connected
        HashMap users = new HashMap();
        //inserts key-value item onto the map
        users.put("Sandra", 23);
        users.put("George", 74);
        users.put("Paul", 61);


        //returns value
        System.out.println(users.get("Sandra"));
        //returns key-value sets
        System.out.println(users.entrySet());
        //returns the keys
        System.out.println(users.keySet());
        //returns number of key-value mappings
        System.out.println(users.size());
        users.remove("George");
        // returns the values
        System.out.println(users.values());

        //iteration
        //hashmap - a higher level arraylist

        //Iterator class and method which takes all the data to the iterator - gives access to it
        Iterator iterator=users.entrySet().iterator();
        //as long as iterator has next item- go on: / hasNext - boolean
        while (iterator.hasNext()){
            //for that creating another abstract pair-Map type object
            Map.Entry pair = (Map.Entry) iterator.next(); // (Map.ENtry)- needs to be
            //in order to cast iterator to the same type as Map - to show exact location of the items!
            // getKey() - prints out normally (without [])
            System.out.println("Key: "+pair.getKey()+" value: "+pair.getValue());

        }
        //returns key-value sets in cell[]
        System.out.println(users.entrySet());

        //specify the key and value types / should Integer, not int, because they are Objects!
        HashMap<Integer, String> newUsers=new HashMap<>();//creating a new object and getting space for it

        newUsers.put(5, "Natasha"); // if put the same key with a different value - it will overwrite with the new value
        System.out.println(newUsers.toString());//has {} around in the out put

        newUsers.put(5, "Maria"); // the value overwrites
        System.out.println(newUsers.toString());


        /*
        HashMap of hashMaps are very popular.

Pseudo code below to give an idea:

Map<String, Map<String, Object>> multiHashMap = new HashMap<>();
Map<String, Object> myHashMap1;
Map<String, Object> myHashMap2;
multiHashMap.put(“one”, myHashMap1);
multiHashMap.put(“two”, myHashMap2);

Also, "multimap" is a common dataStructure, where value is a collection.

You use the key to retrieve the collection and the manipulate the collection.

Map<Double,List<Object>> multiMap = new TreeMap<Double,List<Object>>();

         */
    }
}
