/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sunil.linkedlist;

/**
 *
 * @author sxg282
 */
public class Node {

    private String name; // as an example
    private Node next;

    public Node(String name, Node n) {
        this.name = name;
        next = n;
    }

    public Node(String name) {
        this(name, null);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
    

}
