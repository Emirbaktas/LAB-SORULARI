package com.cse202pack.w5.linkedlist;
public class SinglyLinkedList {
    Node head; // The entry point of the list

    // Adds a new node at the very beginning of the list (Prepend)
    public void insertAtFront(int value) {
        Node newPtr = new Node(value);
        newPtr.next = head; // Link new node to the current head
        head = newPtr;      // Move head to point to the new node
    }

    // Finds a specific item and inserts a new value immediately after it
    public void insertAfter(int searchItem, int value) {
        Node prev = head;
        // Traverse the list until we find the searchItem or reach the end
        while (prev != null && prev.data != searchItem) {
            prev = prev.next;
        }
        
        // If the item was found, perform the insertion
        if (prev != null) {
            Node cur = prev.next;   // Temporary pointer to the 'current' next node
            Node newPtr = new Node(value);
            newPtr.next = cur;      // Connect new node to the rest of the list
            prev.next = newPtr;     // Link the previous node to our new node
        }
    }

    // Adds a new node at the end (Append) without using a tail pointer
    public void insertAtEnd(int value) {
        Node newPtr = new Node(value);
        
        // If the list is empty, the new node becomes the head
        if (head == null) {
            head = newPtr;
        } else {
            Node cur = head;
            // Traverse until we reach the last node (where next is null)
            while (cur.next != null) {
                cur = cur.next;
            }
            cur.next = newPtr; // Link the last node to the new node
        }
    }

    // Searches for a node containing the specified value
    public Node search(int searchItem) {
        Node cur = head;
        // Walk through the list node by node
        while (cur != null && cur.data != searchItem) {
            cur = cur.next;
        }
        return cur; // Returns the node if found, or null if not
    }

    // Removes a node containing the searchItem from the list
    public void delete(int searchItem) {
        Node prev = null;
        Node cur = head;

        // Traverse to find the node to delete while keeping track of the 'prev' node
        while (cur != null && cur.data != searchItem) {
            prev = cur;
            cur = cur.next;
        }

        // If the node was found
        if (cur != null) {
            if (prev == null) {
                // Case 1: The node to delete is the head
                head = cur.next;
            } else {
                // Case 2: The node is in the middle or at the end
                prev.next = cur.next; // Bypass the 'cur' node
            }
        }
    }

    // Reverses the direction of all links in the list
    public void reverse() {
        Node prev = null;
        Node cur = head;
        Node next = null;

        while (cur != null) {
            next = cur.next; // Save the next node
            cur.next = prev; // Flip the current node's pointer backwards
            prev = cur;      // Move 'prev' one step forward
            cur = next;      // Move 'cur' one step forward
        }
        head = prev; // Update head to the last successfully processed node
    }
    
    public void printList() {
        Node cur = head;
        while (cur != null) {
            System.out.print(cur.data + " ");
            cur = cur.next;
        }
    }
}