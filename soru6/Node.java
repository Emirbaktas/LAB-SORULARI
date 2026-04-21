package com.cse202pack.w5.linkedlist;
public class Node {
    int data;     // The value stored in the node
    Node next;    // Reference to the next node in the list

    // Constructor to initialize a new node
    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}