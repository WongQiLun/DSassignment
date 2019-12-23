/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class;
/* Author Wong Qi Lun*/
/**
 *
 * @author user
 * @param <T>
 */
public interface DoublyLinkedListADT<T> {
    void append(T data);
    /*
    Description: add data to the back of the queue
    Precondition:data isn't null 
    postcondition : data is added to back of the queue
    
    */
    void insert(T data);
        /*
    Description: add data to the front of the queue
    Precondition:data isn't null 
    postcondition : data is added to the front of the queue
    
    */
   T removeFirst();
   /*
   Description : remove and return the first item
   Precondition: the Deque exists and has items in it 
   postcondition: first item is removed 
   returns: first item of th queue
   */
    T removeLast();
       /*
   Description : remove and return the last item
   Precondition: the Deque exists and has items in it 
   postcondition: last item is removed 
   returns: last item of th queue
   */
    T getItem(int i);
           /*
   Description : reutrn the item at  index i 
   Precondition: the Deque exists and has items in it 
   postcondition: none
   returns:the item at  index i 
   */
    void clear();
    /* description :clear the queue
    precondition: queue exists
    post condition : all items are removed
    returns : none
    
    */
    public T remove(int i);
       /*
   Description : remove and return the item in the index
   Precondition: the Deque exists and has items in it 
   postcondition: indexed item is removed 
   returns:  item of th queue
   */
    
    public boolean isEmpty();
    

    public void add(T[] items);
    /*
           
   Description : adds all items in an array into nodes
   Precondition: array isnt null
   postcondition: doublylinkedlist is generator
 
   */
    
    public void displaySwapCount();
    /*
    Displys the number of swaps that occur in the list in a dialog
    */

    public int getNodeNumber();
    /*
    Description : returns the last index of the Doubly linked list
    */
    
    public Node getFirstNode();
    
     public void quickSort();
    

  
}
