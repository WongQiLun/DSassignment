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

    Node firstNode = null;
    Node lastNode = null;
    int nodeNumber = 0;
    
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
        
        if (i < nodeNumber / 2) {
            Node y = firstNode;
            if (i != 1) {

                for (int x = 1; x < i; x++) {
                    y = y.next;
                }
            }
              return y;
        }
        else{
            Node y = lastNode;
            if (i != 1) {

                for (int x = 1; x < (nodeNumber -i); x++) {
                    y = y.previous;
                }
            }
              return y;
        }

      

    }

    @Override
    public void clear() {
        firstNode = null;
        lastNode = null;
        nodeNumber = 0;
    }

    @Override
    public T remove(int i) {
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
        T buffer = nodeInThatLocation.current;
        T buffer2 = node.replace(buffer);
        nodeInThatLocation.replace(buffer2);
    }


}
