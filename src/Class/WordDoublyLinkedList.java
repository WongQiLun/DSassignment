/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class;

/**
 *
 * @author user
 */
public class WordDoublyLinkedList<T> implements DoublyLinkedListADT<T> {

    Node firstNode;
    Node lastNode;
    int nodeNumber = 0;

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
        Node y = firstNode;
        for (int x = 1; x < i; x++) {
            y = y.next;
        }
        return (T) y.current;

    }
        public Node getNode(int i) {
        Node y = firstNode;
        for (int x = 1; x < i; x++) {
            y = y.next;
        }
        return y;

    }

    @Override
    public void clear() {
        firstNode = null;
        lastNode = null;
        nodeNumber = 0;
    }

    @Override
    public T remove(int i) {
        Node nodeToBeRemoved = firstNode;
        for (int x = 1; x < i; x++) {
            nodeToBeRemoved = nodeToBeRemoved.next;
        }
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
    public void add(T[] strArray){
        for(T x: strArray){
            this.append(x);
        }
    }
    public void insertAt(int i , T item){
        Node<T> data = new Node<T> (item);
        Node<T> nodeInThatLocation  = getNode(i);
        nodeNumber++;
        data.previous = nodeInThatLocation.previous;
        data.next = nodeInThatLocation;
        nodeInThatLocation.previous.next = data;
        nodeInThatLocation.previous =data; 
    }
    
    public void sort() {
        if(isEmpty()){
            return;
        }
        if (nodeNumber == 1) {
            return;
        }
        else{
            //todo sorting 
            return;
        }
    }

}

class Node<T> {

    public Node(T current) {
        this.current = current;
    }
    Node previous;
    Node next;
    T current;

    //replace the value of the node and return the T value

    public T replace(T data) {
        T item = null;
        return item;
    }

}
