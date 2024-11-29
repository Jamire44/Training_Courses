package util;

public class LinkedList<T> implements LinkedListADT<T> {

    private int count;  // the current number of elements in the list
    private LinearNode<T> front; // points to the first node
    private LinearNode<T> last; // points to the last node


    //  Creates an empty list.
    public LinkedList() {
        this.count = 0;
        this.last = null;
        this.front = null;
    }


    //  Adds an element to the list
    public void add (T element)
    {
        LinearNode<T> node = new LinearNode<> (element);

        if (size() == 0) {
            this.last = node; // This is the last node
            this.front = node; // This is the first node
            this.count++;
        } else {
            last.setNext(node); // Add node to the list.
            last = node; // This the new last node.

            this.count++;
        }
    }


    //  Removes and returns the first element from this list
    public T remove() {

        LinearNode<T> temp = null;
        T result = null;
        if (isEmpty()){
            System.out.println("There are no nodes in the list");
        }else {

            result = this.front.getElement();
            temp = this.front;
            this.front = this.front.getNext();
            temp.setNext(null); //dereference the original first element
            count--;
        }
        return result;

    }


    //  Returns true if this list contains no elements
    public boolean isEmpty() {
        if (this.front == null)
            return true;
        else
            return false;
    }


    //  Returns the number of elements in this list
    public int size() {
        return this.count;
    }

    //  toString method
    public String toString() {
        LinearNode<T> current = null;
        String fullList = "";

        for (current = this.front; current != null; current = current.getNext()){
            fullList = fullList + "\n" + current.getElement().toString();
        }
        return fullList + "\n";
    }

}
