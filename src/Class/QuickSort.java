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
        Word pivot = arr.getItem(high);
        int i = (low - 1);
        for (int j = low; j < high; j++) {
            if (pivot.isLowerThan(arr.getItem(j))) {
                i++;
                arr.swap(i, j);

            }
        }
        arr.swap(i + 1, high);
        return i + 1;
    }
}
