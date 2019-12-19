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
public class Node<T extends Comparable<?super T>> {

    public T getCurrent() {
        return current;
    }
    
    public Node(T current) {
        this.current = current;
    }
    Node previous;
    Node next;
    T current;

    //replace the value of the node and return the T value

    public T replace(T data) {
        T item = current;
        
        current = data;
        
        return item;
    }

}
