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
public class QuickSort {
        public void sort(WordDoublyLinkedList<Word> arr, int low, int high) {
        if (high > low) {
            int pi = partition(arr, low, high);
            sort(arr, low, pi - 1);
            sort(arr, pi + 1, high);
        }

    }

    public int partition(WordDoublyLinkedList<Word> arr, int low, int high) {
        Word pivot =arr.getItem(high);
        int i = (low - 1);
        for (int j = low; j < high; j++) {
            if (pivot.isLowerThan(arr.getItem(j))) {
                i++;
                arr.swap(i, j);

            }
        }
        arr.swap(i + 1, high);
        return( i + 1);
    }
    Node partition(Node<Word> l,Node<Word> h,WordDoublyLinkedList<Word> DoublyLinked) 
    { 
       // set pivot as h element 
        Word x = h.current; 
          
        // similar to i = l-1 for array implementation 
        Node<Word> i = l.previous; 
          
        // Similar to "for (int j = l; j <= h- 1; j++)" 
        for(Node<Word> j=l; j!=h; j=j.next) 
        { 
            if(x.isLowerThan(j.getCurrent())) 
            { 
                // Similar to i++ for array 
                i = (i==null) ? l : i.next; 
                Word temp = i.current; 
                i.current = j.current; 
                j.current = temp; 
                DoublyLinked.swapCounter++;
            } 
        } 
        i = (i==null) ? l : i.next;  // Similar to i++ 
        Word temp = i.current; 
        i.current= h.current; 
        h.current = temp; 
        DoublyLinked.swapCounter++;
        return i; 
    } 
        /* A recursive implementation of quicksort for linked list */
    void _quickSort(Node l,Node h,WordDoublyLinkedList<Word> wDLL) 
    { 
        if(h!=null && l!=h && l!=h.next){ 
            Node temp = partition(l,h, wDLL); 
            _quickSort(l,temp.previous,wDLL); 
            _quickSort(temp.next,h,wDLL); 
        } 
    } 
      
    // The main function to sort a linked list. It mainly calls _quickSort() 
    public void quickSort(Node node, WordDoublyLinkedList<Word> wDLL) 
    { 
        // Find last node 
        Node head = wDLL.getLastNode(); 
          
        // Call the recursive QuickSort 
        _quickSort(node,head,wDLL); 
    } 
}
