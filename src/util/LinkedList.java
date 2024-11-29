package util;

/**
 * File name: Employee.java
 * Author: Jamie Doyle
 * Student number: D24125998
 * Description: Linked List
 */

import java.util.NoSuchElementException;

public class LinkedList<T> implements LinkedListADT<T>{
    private Node<T> head;
    private Node<T> tail;

    private class Node<T> {
        T data;
        Node<T> next;

        Node(T data) {
            this.data = data;
        }
    }

    // Add a unique element to the end of the list
    public void add(T element) {
        if (!contains(element)) {
            Node<T> newNode = new Node<>(element);
            if (head == null) {
                head = tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
        }
    }

    // Method to remove the last element and return it
    @Override
    public T remove() {
        if (head == null) {
            return null;
        }
        if (head == tail) {
            T data = head.data;
            head = tail = null;
            return data;
        }

        Node<T> current = head;
        while (current.next != tail) {
            current = current.next;
        }

        T data = tail.data;
        tail = current;
        tail.next = null;

        return data;
    }

    // Add an element at a specific position
    @Override
    public void add(T element, int position) {
        if (position < 1) throw new IllegalArgumentException("Position must be at least 1");
        Node<T> newNode = new Node<>(element);
        if (position == 1) {
            newNode.next = head;
            head = newNode;
            if (tail == null){
                tail = newNode;
            }
        } else {
            Node<T> previous = null;
            Node<T> current = head;
            int index = 1;
            while (current != null && index < position) {
                previous = current;
                current = current.next;
                index++;
            }
            if (previous == null) {
                head = newNode;
            } else {
                previous.next = newNode;
            }
            newNode.next = current;
            if (current == null) {
                tail = newNode;
            }
        }
    }

    // Delete an element
    @Override
    public void delete(T element) {
        Node<T> previous = null;
        Node<T> current = head;

        while (current != null) {
            if (current.data.equals(element)) {
                if (previous == null) {
                    head = current.next;
                    if (head == null) tail = null;
                } else {
                    previous.next = current.next;
                    if (previous.next == null) tail = previous;
                }
                return;
            }
            previous = current;
            current = current.next;
        }
    }

    // Display all elements
    @Override
    public void display() {
        Node<T> current = head;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }

    // Return the first node
    public Node<T> getFirstNode() {
        return head;
    }

    // Return the last node
    public Node<T> getLastNode() {
        return tail;
    }

    // Return the first element
    @Override
    public T getFirstElement() {
        if (head == null) {
            throw new NoSuchElementException("List is empty");
        }
        return head.data;
    }

    // Return the last element
    @Override
    public T getLastElement() {
        if (tail == null) {
            throw new NoSuchElementException("List is empty");
        }
        return tail.data;
    }

    // Return the next element
    @Override
    public T getNextElement(T element) {
        Node<T> current = head;
        while (current != null && !current.data.equals(element)) {
            current = current.next;
        }
        if (current != null && current.next != null) {
            return current.next.data;
        } else {
            throw new NoSuchElementException("No next element found");
        }
    }

    // Check if the list is empty
    @Override
    public boolean isEmpty() {
        return head == null;
    }

    // Returns the size
    @Override
    public int size() {
        int count = 0;
        Node<T> current = head;

        while (current != null) {
            count++;
            current = current.next;
        }

        return count;  // Return the total count of nodes in the list
    }

    // Check if the list contains an element
    @Override
    public boolean contains(T element) {
        Node<T> current = head;
        while (current != null) {
            if (current.data.equals(element)) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

}
