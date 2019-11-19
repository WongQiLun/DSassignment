package Class;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ongchunheng
 */
public interface UserListInterface<T> {
    
    public void add(T item);
    /*
    Description: 
    Precondition: 
    Postcondition: 
    Return: 
    */
    
    public void add(int pos, T item);
    /*
    Description: 
    Precondition: 
    Postcondition: 
    Return: 
    */
    
    public boolean contains(T item);
    /*
    Description: 
    Precondition: 
    Postcondition: 
    Return: 
    */
    
    public int size();
    /*
    Description: 
    Precondition: 
    Postcondition: 
    Return: 
    */
    
    public boolean isEmpty();
    /*
    Description: 
    Precondition: 
    Postcondition: 
    Return: 
    */
    
    public T get(int position);
    /*
    Description: 
    Precondition: 
    Postcondition: 
    Return: 
    */
    
    public T remove(int position);
    /*
    Description: 
    Precondition: 
    Postcondition: 
    Return: 
    */
    
}
