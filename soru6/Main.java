package com.cse202pack.w5.linkedlist;

public class Main {
    public static void main(String[] args) {
        // 1. Initialize the list
        SinglyLinkedList list = new SinglyLinkedList();

        System.out.println("--- Building the List ---");
        
        // 2. Test: Insert at Front
        list.insertAtFront(10); // List: 10 -> null
        
        // 3. Test: Insert at End
        list.insertAtEnd(30);   // List: 10 -> 30 -> null
        
        // 4. Test: Insert After a specific value
        // We want to put 20 between 10 and 30
        list.insertAfter(10, 20); 
        
        System.out.print("Current List: ");
        list.printList(); // Expected: 10 -> 20 -> 30 -> null

        System.out.println("\n--- Searching and Deleting ---");

        // 5. Test: Search
        int searchItem = 20;
        Node found = list.search(searchItem);
        if (found != null) {
            System.out.println("Item " + searchItem + " was found in the list.");
        }

        // 6. Test: Delete
        System.out.println("Deleting node with value 20...");
        list.delete(20);
        System.out.print("List after deletion: ");
        list.printList(); // Expected: 10 -> 30 -> null

        System.out.println("\n--- Reversing the List ---");

        // 7. Test: Reverse
        list.reverse();
        System.out.print("Reversed List: ");
        list.printList(); // Expected: 30 -> 10 -> null
    }
}
