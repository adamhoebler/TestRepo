package hoebler;

import org.w3c.dom.Node;

import java.util.Iterator;
import java.util.ListIterator;

public class Queue <Item> {
    private Node first; //Link to the least recently added node
    private Node last; //Link to the most recently added node
    private int N; //Counter

    private class Node{ //Nested class to define what a node is
        Item item; //Every node instance has an item of type item
        Node next; //Every node has a reference of type node to the next node
    }

    public boolean isEmpty(){return first==null;} //Tests if the queue is empty and returns true if first == null, otherwise false
    public int size(){return N;} //Checks the size and returns N

    public void enqueue( Item item ){
        //Add item of type item to the end of the list
        Node oldlast = last; //Declare a new reference named old last and set it equal to last reference
        last = new Node(); //Declare a node named last
        last.item = item; //Set last's item equal to the given item
        last.next = null; //Set last's next reference to null because it is going to be last
        if(isEmpty()) first = last; //If it is empty then first will equal last
        else oldlast.next=last; //If it is not empty, set old last's next reference to refer to the new last
        N++; //Increment our counter
    }
    public Item dequeue(){
        //Remove item from the beginning of the list following first in first out principle
        Item item = first.item; //Declare a new item and set it equal to first's item
        first = first.next; //The first reference is now set to first.next, thus orphaning where first referred to before
        N--; //Decrement N
        if(isEmpty()) last=null; //If it is empty then last will equal null
        return item; //Return the removed item
    }


}
// implements Iterable<Item>
//    public Iterator<Item> iterator() {
//        return new ListIterator();
//
//    }
//
//private class ListIterator implements Iterator<Item>{
//    private Node current = first;
//    public boolean hasNext(){ return current!=null; }
//    public void remove(){}
//    public Item next(){
//        Item item = current.item;
//        current = current.next;
//        return item;
//    }
//
//}
