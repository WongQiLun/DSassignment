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
    
    public T remove();
    /*
    Description: To remove the last item from the list
    Precondition: None
    Postcondition: The last item is removed from the list, size is reduced
    Return: The last item from the list
    */
    
    public T remove(int i);
    /*
    Description: To remove an item at the specified index in the list
    Precondition: None
    Postcondition: The specified index of the item is removed from the list, size is reduced
    Return: The specified index of an item is removed from the list, size is reduced
    */
    
    public T get(int i);
    /*
    Description: To get an item at the specified index in the list without removing it
    Precondition: None
    Postcondition: None
    Return: The item at the specified index
    */
    
    public boolean isEmpty();
    /*
    Description: To check whether the list is empty
    Precondition: None
    Postcondition: None
    Return: true if empty, else false if not empty 
    */
    
    public int size();
    /*
    Description: To check the size of List
    Precondition: None
    Postcondition: None
    Return: Return the size of list
    */
    
    public String sContains(String word, int para);
    /*
    Description: To search if any string from the list contains the word entered by the user
    Precondition: None
    Postcondition: None
    Return: Return the search results
    */
    
    public String sWhole(String w, int para);
    /*
    Description: To search if any string from the list matches the word entered by the user
    Precondition: None
    Postcondition: None
    Return: Return the search results
    */
    
    public String sStart(String w, int para);
    /*
    Description: To search if the first character of the string from the list matches the word entered by the user
    Precondition: None
    Postcondition: None
    Return: Return the search results
    */
    
    public String sEnd(String w, int para);
    /*
    Description: To search if the last character of the string from the list matches the word entered by the user
    Precondition: None
    Postcondition: None
    Return: Return the search results
    */
    
    public String sInt(String w, int para);
    /*
    Description: To search if any string from the list matches the word entered by the user
    Precondition: None
    Postcondition: None
    Return: Return the search results
    */
   
}
