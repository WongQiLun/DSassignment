/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class;

import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class WordDoublyLinkedList<T extends Comparable<? super T>>  implements DoublyLinkedListADT<T> {

    Node firstNode = null;
    Node lastNode = null;
    int nodeNumber = 0;
    int swapCounter = 0;

    public Node getFirstNode() {
        return firstNode;
    }

    public Node getLastNode() {
        return lastNode;
    }

    public int getNodeNumber() {
        return nodeNumber;
    }

    @Override
    public void append(T data) {
        Node x = new Node(data);
        if (firstNode == null) {
            firstNode = x;
            lastNode = x;
            nodeNumber++;
        } else {
            lastNode.next = x;
            x.previous = lastNode;
            lastNode = x;
            nodeNumber++;

        }

    }

    @Override
    public void insert(T data) {
        Node x = new Node(data);
        if (firstNode == null) {
            firstNode = x;
            lastNode = x;
            nodeNumber++;
        } else {
            firstNode.previous = x;
            x.next = firstNode;
            firstNode = x;
            nodeNumber++;
        }

    }

    @Override
    public T removeFirst() {

        Node x = firstNode;
        if (firstNode == lastNode) {
            nodeNumber = 0;
            firstNode = null;
            lastNode = null;
        } else {
            nodeNumber--;
            firstNode = firstNode.next;
            firstNode.previous = null;
        }

        return (T) x.current;

    }

    @Override
    public T removeLast() {
        Node x = lastNode;
        if (firstNode == lastNode) {
            nodeNumber = 0;
            firstNode = null;
            lastNode = null;
        } else {
            nodeNumber--;
            lastNode = lastNode.previous;
            lastNode.next = null;
        }

        return (T) x.current;

    }

    @Override
    public T getItem(int i) {
        Node y = getNode(i);
        return (T) y.current;

    }

    public Node getNode(int i) {
        if(i ==1){
            return getFirstNode();
        }
        if(i ==nodeNumber){
            return getLastNode();
        }
        Node y= firstNode;
        if (nodeNumber % 2 == 0) {
            if (i <= nodeNumber && i > 1) {
                if (i < nodeNumber / 2) {
                       y = firstNode;
                    for (int x = 1; x < i; x++) {
                        y = y.next;
                    }
                } else {
                     y= lastNode;
                    for (int x = 0; x < nodeNumber - i; x++) {
                        y = y.previous;
                    }
                }
            }
        } else {
            if (i <= nodeNumber && i > 1) {
                if (i < (nodeNumber / 2) + 1) {
                        y = firstNode;
                    for (int x = 1; x < i; x++) {
                        y = y.next;
                    }
                } else {
                     y= lastNode;
                    for (int x = 0; x < nodeNumber - i; x++) {
                        y = y.previous;
                    }
                }
            }
        }

    
    return y ;

}

@Override
        public void clear() {
        firstNode = null;
        lastNode = null;
        nodeNumber = 0;
    }

    @Override
        public T remove(int i
    ) {
        Node nodeToBeRemoved = getNode(i);
        if (i == 1) {
            return removeFirst();
        } else if (i == nodeNumber) {
            return removeLast();
        } else {
            nodeToBeRemoved.previous.next = nodeToBeRemoved.next;
            nodeToBeRemoved.next.previous = nodeToBeRemoved.previous;
            nodeNumber--;
            return (T) nodeToBeRemoved.current;
        }

    }

    @Override
        public boolean isEmpty() {
        if (nodeNumber == 0) {
            return true;
        }
        return false;

    }

    public void add(T[] strArray) {
        for (T x : strArray) {
            this.append(x);
        }
    }

    public void insertAt(int i, T item) {
        Node<T> data = new Node<T>(item);
        Node<T> nodeInThatLocation = getNode(i);
        nodeNumber++;
        data.previous = nodeInThatLocation.previous;
        data.next = nodeInThatLocation;
        nodeInThatLocation.previous.next = data;
        nodeInThatLocation.previous = data;
    }

    public void swap(int i, int b) {
        Node<T> nodeInThatLocation = getNode(i);
        Node<T> node = getNode(b);
        T buffer = getItem(i);
        nodeInThatLocation.current = getItem(b);
        node.current = buffer;
        swapCounter++;
    }

    public void displaySwapCount() {
        JOptionPane.showMessageDialog(null, "Sort Completed with " + swapCounter + "swaps");
        swapCounter = 0;
    }
    
        Node partition(Node<T> l,Node<T> h) 
    { 
       // set pivot as h element 
        T x = h.current; 
          
        // similar to i = l-1 for array implementation 
        Node<T> i = l.previous; 
          
        // Similar to "for (int j = l; j <= h- 1; j++)" 
        for(Node<T> j=l; j!=h; j=j.next) 
        { 
            if(x.compareTo(j.getCurrent())>0) 
            { 
                // Similar to i++ for array 
                i = (i==null) ? l : i.next; 
                T temp = i.current; 
                i.current = j.current; 
                j.current = temp; 
                swapCounter++;
            } 
        } 
        i = (i==null) ? l : i.next;  // Similar to i++ 
        T temp = i.current; 
        i.current= h.current; 
        h.current = temp; 
        swapCounter++;
        return i; 
    } 
        /* A recursive implementation of quicksort for linked list */
    void _quickSort(Node l,Node h) 
    { 
        if(h!=null && l!=h && l!=h.next){ 
            Node temp = partition(l,h); 
            _quickSort(l,temp.previous); 
            _quickSort(temp.next,h); 
        } 
    } 
      
    // The main function to sort a linked list. It mainly calls _quickSort() 
    public void quickSort() 
    { 
        // Find last node 
        Node head = getLastNode(); 
        Node node = getFirstNode();
        // Call the recursive QuickSort 
        _quickSort(node,head); 
    } 

}
