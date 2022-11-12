package com.litmus;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Queue;

public class WorkingWithQueues {
    public static void main(String[] args){
        LinkedList<Person> linkedList = new LinkedList<>();
        linkedList.add(new Person("Litmus", 12));
        linkedList.add(new Person("Zhang", 23));
        linkedList.add(1, new Person("sunks", 14));
        ListIterator<Person> personListIterator = linkedList.listIterator();
        while (personListIterator.hasNext()){
            System.out.println(personListIterator.next());
        }
        while (personListIterator.hasPrevious()){
            System.out.println(personListIterator.previous());
        }

    }

    private static void queues() {
        Queue<Person> supermarket = new LinkedList<>();
        supermarket.add(new Person("Alex", 25));
        supermarket.add(new Person("Ali", 29));
        supermarket.offer(new Person("Ben", 40));

        System.out.println(supermarket.peek());
        System.out.println(supermarket.size());
        System.out.println(supermarket.poll());
        System.out.println(supermarket.size());
        System.out.println(supermarket.peek());
    }

    static record Person(String name, int age){ }
}
