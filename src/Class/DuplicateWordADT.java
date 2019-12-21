/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class;

/**
 *
 * @author Forge-15 1650
 */
public interface DuplicateWordADT<T> {
    
   public void add(T item);
    /*
    Description: To add item into the list
    Precondition: The item is not null
    Postcondition: The item is added to the list
    Return: None
    */
   
   public void clear();
    /*
    Description: To clear add items in the list
    Precondition: None
    Postcondition: The list is cleared
    Return: None
    */
   
   public T get(int i);
    /*
    Description: 
    Precondition: 
    Postcondition: 
    Return: 
    */
   
   public boolean isEmpty();
    /*
    Description: 
    Precondition: None
    Postcondition: None
    Return: 
    */
   
   public int size();
    /*
    Description: 
    Precondition: None
    Postcondition: None
    Return: 
    */
   
   public String searchDuplicate(String word);
   /*
    Description: 
    Precondition: None
    Postcondition: None
    Return: 
    */
}
