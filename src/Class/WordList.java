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
public class WordList<T> implements WordListADT<T> {

    private T[] array;
    private int size;

    public WordList() {
        array = (T[]) new Object[100];
        size = 0;
    }

    public void add(T item) {
        if (item != null) {
            if (isFull()) {
                expandArray();
            }
            array[size] = item;
            size++;
        }
    }

    private boolean isFull() {
        if (size == array.length) {
            return true;
        } else {
            return false;
        }
    }

    private void expandArray() {
        //assign array address to oldArray
        T[] oldArray = array;
        //create "new" array with double the size
        array = (T[]) new Object[oldArray.length * 2];
        //copy value one by one from oldArray to array
        for (int i = 0; i < oldArray.length; i++) {
            array[i] = oldArray[i];
        }
        oldArray = null;
    }

    public T remove(int i) {
        T item = null;
        
        item = array[i];
        
        shiftItemtoLeft(i);
        size--;
        
        return item;
    }

    public T remove() {
        T item = null;
        
        item = array[size];
        array[size] = null;
        
        size--;
        
        
        return item;
    }

    private void shiftItemtoLeft(int currentIndex) {
        for (int i = currentIndex; i < size - 1; i++) {
            array[i] = array[i + 1];
        }
        array[size - 1] = null;
    }

    public boolean isEmpty() {
        if (size == 0) {
            return true;
        } else {
            return false;
        }
    }
    
    public T get(int i){
        return array[i];
    }

    public int size() {
        return size;
    }
    
    public String toString(){
        String result = "";
        for(int i = 0 ; i < size ; i++){
            result += array[i] + "\n";
        }
        return result; 
    }
    

}
