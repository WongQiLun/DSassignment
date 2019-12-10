/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class;

/**
 *
 * @author ongchunheng
 */
public interface WordListADT<T> {
    public void add(T item);
    
    public T remove();
    
    public T remove(int i);
    
    public T get(int i);
    
    public boolean isEmpty();
    
    public int size();
   
}
