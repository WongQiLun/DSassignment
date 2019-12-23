/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class;

import javax.swing.JOptionPane;
import static testsomeshit.FilterSearch_UI.wDuplicate;

/**
 *
 * @author Forge-15 1650
 */
public class DuplicateWord<T extends Comparable<? super T>> implements DuplicateWordADT<T> {

    private T[] array;
    private int size;

    public DuplicateWord() {
        array = (T[]) new Comparable[100];
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

    public void clear() {
        array = (T[]) new Object[100];
        size = 0;
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

    public boolean isEmpty() {
        if (size == 0) {
            return true;
        } else {
            return false;
        }
    }

    public T get(int i) {
        return array[i];
    }

    public int size() {
        return size;
    }

    public String toString() {
        String result = "";
        for (int i = 0; i < size; i++) {
            result += array[i] + "<br />";
        }
        return result;
    }

    public String searchDuplicate(String word) {
        String result = "";
        boolean found = false;
        int count = 0;

        for (int i = 0; i < wDuplicate.size(); i++) {

            //check for first time
            if (wDuplicate.get(i).getData().toLowerCase().equals(word.toLowerCase())) {

                System.out.println(count);
                found = true;
                int para = wDuplicate.get(i).getParagraph();

                result += "<br /><br />Paragraph " + wDuplicate.get(i).getParagraph() + ": ";
                // loop agn
                for (int j = i; j < wDuplicate.size(); j++) {

                    if (wDuplicate.get(j).getParagraph() == para) {
                        if (wDuplicate.get(j).getData().toLowerCase().equals(word.toLowerCase())) {
                            count++;

                            result += "<b>" + wDuplicate.get(j).getData() + "</b> ";
                        } else {
                            result += wDuplicate.get(j).getData() + " ";
                        }
                    }
                }
            }

        } // end for

        if (found == false) {
            JOptionPane.showMessageDialog(null, "No words found!");

        } else {
            result += "<br /> <br/>Total number of duplicate : " + count;
            JOptionPane.showMessageDialog(null, "We have found " + count + " results for you.");
        }

        return result;
    }

    public DuplicateWord         getDuplicates() {
        T bufferWord = null;
        DuplicateWord item = new DuplicateWord();
        int counter = 0;
        for (int x = 0; x < size; x++) {
            if (  bufferWord == null||array[x].compareTo(bufferWord) != 0) {
                bufferWord = array[x];
                counter = 1;
            } else if (array[x].compareTo(bufferWord) == 0) {
                counter++;
                if (counter == 2) {
                    item.add(array[x]);
                }
            }
        }
        return item;
    }

    public DuplicateWord removeDuplicates() {
        T bufferWord = null;
        DuplicateWord item = new DuplicateWord();
        int counter = 0;
        for (int x = 0; x < size; x++) {
            if (bufferWord== null ||array[x].compareTo(bufferWord) != 0) {
                bufferWord = array[x];
                item.add(array[x]);
                counter = 1;
            } else if (array[x].compareTo(bufferWord) == 0) {
                counter++;
            }
        }
        return item;
    }
}

