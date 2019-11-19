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
public class UserList<T> implements UserListInterface<T> {

    private T[] userArray;
    private int lastIndex;

    public UserList() {
        userArray = (T[]) new Object[10];
        lastIndex = -1;
    }

    public void add(T user) {
        if (user != null) {
            lastIndex++;
            userArray[lastIndex] = user;

        } else {

        }
    }

    public void add(int position, T user) {

    }

    public boolean contains(T item) {
        return true;
    }

    public int size() {
        return userArray.length;
    }

    public boolean isEmpty() {
        return true;
    }

    public T get(int position) {
        if(userArray[position] == null){
            return null;
        }
        return userArray[position];
    }

    public T remove(int position) {
        T a = null;
        return a;
    }
    
}
