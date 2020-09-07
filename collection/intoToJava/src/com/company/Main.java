package com.company;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        ArrayList<Integer> arrayList = new ArrayList<>();
        PriorityQueue<Integer> priority = new PriorityQueue<Integer>(10);
        HashSet<Integer> hashSet = new HashSet<>();
        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();
        TreeSet<Integer> tree = new TreeSet<>();
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        LinkedHashMap<Integer, Integer> linkedHashMap = new LinkedHashMap<>();
        TreeMap<Integer, Integer> treeMap = new TreeMap<>();
        //modifying the linked list
        for(int i=1;i<=6;i++) {
            list.add(i);
        }
        System.out.println("The Linked List Elements are "+list);
        list.remove(4);
        System.out.println("The Linked List after removing 4th element is "+list);
        list.add(3,10);
        System.out.println("The Linked List after adding element between 3rd and 4th element is "+list);
        System.out.println("The Linked List element at 3 is "+ list.get(3));
        //modifying the arraylist
        for(int i=1;i<=6;i++) {
            arrayList.add(i);
        }
        System.out.println("The Array List Elements are "+arrayList);
        arrayList.remove(4);
        System.out.println("The Array list after removing 4th element is "+arrayList);
        arrayList.add(3,15);
        System.out.println("The Array list after adding element between 3 and 4  "+ arrayList);
        System.out.println("The Array List 3rd element is  "+ arrayList.get(3));

        //Priority Queue Modification
        for(int i=1;i<=6;i++) {
            priority.add(i);
        }
        System.out.println("The priority queue is "+priority);
        priority.remove(4);
        System.out.println("The priority queue after removing 4 "+priority);
        System.out.println("The priority queue element at 0 is "+priority.peek());
        priority.add(7);
        System.out.println("The priority queue after addiing an elemnt in between "+priority);

        //hashset modification
        for(int i=1;i<=6;i++) {
            hashSet.add(i);
        }
        System.out.println("The hashset Elements are "+hashSet);
        hashSet.remove(4);
        System.out.println("The hashset after removing 4th element is "+hashSet);
        hashSet.addAll(list);
        System.out.println("The hashset List after adding element between 3rd and 4th element is "+hashSet);
        System.out.println("The Hash set element 4 is available?  "+ hashSet.contains(4));

        //LinkedHasSet manipulation
        for(int i=1;i<=6;i++) {
            linkedHashSet.add(i);
        }
        System.out.println("The Linked Hashset Elements are "+linkedHashSet);
        linkedHashSet.remove(4);
        System.out.println("The Linked Hashset after removing 4th element is "+linkedHashSet);
        linkedHashSet.addAll(list);
        System.out.println("The Linked Hashset after adding element between 3rd and 4th element is "+hashSet);
        System.out.println("The Linked Hashset element 4 is available?  "+ linkedHashSet.contains(4));

        //Tree set maipulation
        for(int i=1;i<=6;i++) {
            tree.add(i);
        }
        System.out.println("The tree Elements are "+tree);
        tree.remove(4);
        System.out.println("The tree after removing 4th element is "+tree);
        tree.addAll(list);
        System.out.println("The tree after adding element between 3rd and 4th element is "+tree);
        System.out.println("The tree element 4 is available?  "+ linkedHashSet.contains(4));

        //HashMap manipulation
        for(int i=1;i<=6;i++) {
            hashMap.put(i,i);
        }
        System.out.println("The  Hashmap Elements are "+hashMap);
        hashMap.remove(4,4);
        System.out.println("The Hashmap after removing 4th element is "+hashMap);
        hashMap.put(4,10);
        System.out.println("The Hashmap after adding element between 3rd and 4th element is "+hashMap);
        System.out.println("The Hashset element 4 is available?  "+ hashMap.containsValue(10));

        //LinkedHashmap manipulation
        for(int i=1;i<=6;i++) {
            linkedHashMap.put(i,i);
        }
        System.out.println("The Linked Hashmap Elements are "+linkedHashMap);
        linkedHashMap.remove(4);
        System.out.println("The Linked Hashmap after removing 4th element is "+linkedHashMap);
        linkedHashMap.put(4,10);
        System.out.println("The linked hashmap after adding element between 3rd and 4th element is "+linkedHashMap);
        System.out.println("The linked hashmap object at 4 is "+ linkedHashMap.get(4));

        //Treemap manipulation
        for(int i=1;i<=6;i++) {
            treeMap.put(i,i);
        }
        System.out.println("The treemap Elements are "+treeMap);
        treeMap.remove(4);
        System.out.println("The treemap after removing 4th key is "+treeMap);
        treeMap.put(4,10);
        System.out.println("The treemap after adding element between 3rd and 4th element is "+treeMap);
        System.out.println("The treemap element at 4 is  "+ treeMap.get(4));









    }
}


