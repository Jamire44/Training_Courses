package util;

/**
 * File name: Employee.java
 * Author: Jamie Doyle
 * Student number: D24125998
 * Description: Linked List ADT
 */

public interface LinkedListADT <T> {

    // Add a unique element to the end of the list
    public void add(T element);

    // Method to remove the last element and return it

    public T remove();

    // Add an element at a specific position
    public void add(T element, int position);

    // Delete an element
    public void delete(T element);

    // Display all elements
    public void display();

    // Return the first element
    public T getFirstElement();

    // Return the last element
    public T getLastElement();

    // Return the next element
    public T getNextElement(T element);

    // Check if the list is empty
    public boolean isEmpty();

    // Returns the size
    public int size();

    // Check if the list contains an element
    public boolean contains(T element);

}
