/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class;

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
   returns: first item of th queue
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

    
    public boolean isEmpty();

    public void add(T[] items);

    public void displaySwapCount();

    public int getNodeNumber();

    public Node<Word> getFirstNode();

     public void quickSort();
    

  
}
