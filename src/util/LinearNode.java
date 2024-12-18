package util;

/**
 * File name: Employee.java
 * Author: Jamie Doyle
 * Student number: D24125998
 * Description: Node Class
 */

public class LinearNode<T>
{
    private LinearNode<T> next;
    private T element;

    //  Creates an empty node
    public LinearNode() {
        this.next = null;
        this.element = null;
    }


    //  Creates a node that stores the element.
    public LinearNode (T elem) {
        this.next = null;
        this.element = elem;
    }


    //  Returns the next node.
    public LinearNode<T> getNext() {
        return this.next;
    }

    //  Sets the next node.
    public void setNext (LinearNode<T> node) {
        this.next = node;
    }


    //  Returns the element stored in this node.
    public T getElement() {
        return this.element;
    }

    //  Sets the element stored in this node.
    public void setElement (T elem) {
        this.element = elem;
    }
}

