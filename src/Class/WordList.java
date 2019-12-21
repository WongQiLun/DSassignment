/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class;

import javax.swing.JOptionPane;
import static testsomeshit.FilterSearch_UI.wArray;

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
    
    public String sContains(String word) {
        boolean found = false;
        int count = 0;
        int para = 0;
        int lastpara = 0;
        String stringresult = "";
        
        for (int i = 0; i < wArray.size(); i++) {

            if (wArray.get(i).getData().contains(word)) {
                
                count++;
                found = true;
                para = wArray.get(i).getParagraph();
                
               
                if (lastpara == para) {
                    
                } else {
                    

                    lastpara = para;

                    stringresult += "<br /><br />Paragraph " + wArray.get(i).getParagraph() + ": ";

                    for (int j = 0; j < wArray.size(); j++) {

                        if (wArray.get(j).getParagraph() == para) {
                            if (wArray.get(j).getData().contains(word)) {
                                stringresult += "<b>" + wArray.get(j).getData() + "</b> ";
                            } else {
                                stringresult += wArray.get(j).getData() + " ";
                            }

                        }

                    }

                }

            }

        } // end for
        
        if(found == false){
            JOptionPane.showMessageDialog(null, "No words found!");
        }
        
        else{
            JOptionPane.showMessageDialog(null, "We have found " + count + " results for you.");
        }
        
        return stringresult;
    }
    
    public String sWhole(String word){
        boolean found = false;
        int count = 0;
        int lastpara = 0;
        String stringresult = "";

        for (int i = 0; i < wArray.size(); i++) {

            if (word.equals(wArray.get(i).getData())) {
                count++;
                found = true;
                int para = wArray.get(i).getParagraph();

                if (lastpara == para) {

                } else {
                    lastpara = para;

                    stringresult += "<br /><br />Paragraph " + wArray.get(i).getParagraph() + ": ";

                    for (int j = 0; j < wArray.size(); j++) {

                        if (wArray.get(j).getParagraph() == para) {
                            if (wArray.get(j).getData().equals(word)) {
                                stringresult += "<b>" + wArray.get(j).getData() + "</b> ";
                            } else {
                                stringresult += wArray.get(j).getData() + " ";
                            }

                        }

                    }
                }

            }

        } // end for

        if (found == false) {
            JOptionPane.showMessageDialog(null, "No words found!");

        } else {
            JOptionPane.showMessageDialog(null, "We have found " + count + " results for you.");

        }

        return stringresult;
    }
    
    public String sStart(String word){
        boolean found = false;
        int count = 0;
        int lastpara = 0;
        String stringresult = "";

        for (int i = 0; i < wArray.size(); i++) {

            if (wArray.get(i).getData().charAt(0) == word.charAt(0)) {
                count++;
                found = true;
                int para = wArray.get(i).getParagraph();

                if (lastpara == para) {

                } else {
                    lastpara = para;
                    stringresult += "<br /><br />Paragraph " + wArray.get(i).getParagraph() + ": ";

                    for (int j = 0; j < wArray.size(); j++) {

                        if (wArray.get(j).getParagraph() == para) {
                            if (wArray.get(j).getData().charAt(0) == word.charAt(0)) {
                                stringresult += "<b>" + wArray.get(j).getData() + "</b> ";
                            } else {
                                stringresult += wArray.get(j).getData() + " ";
                            }

                        }

                    }
                }

            }

        } // end for

        if (found == false) {
            JOptionPane.showMessageDialog(null, "No words found!");

        } else {
            JOptionPane.showMessageDialog(null, "We have found " + count + " results for you.");

        }

        return stringresult;
    }
    
    public String sEnd(String word){
        String stringresult = "";
        boolean found = false;
        int count = 0;
        int lastpara = 0;

        for (int i = 0; i < wArray.size(); i++) {

            if (wArray.get(i).getData().charAt(wArray.get(i).getData().length() - 1) == word.charAt(0)) {
                count++;
                found = true;
                int para = wArray.get(i).getParagraph();

                if (lastpara == para) {

                } else {
                    lastpara = para;
                    stringresult += "<br /><br />Paragraph " + wArray.get(i).getParagraph() + ": ";

                    for (int j = 0; j < wArray.size(); j++) {

                        if (wArray.get(j).getParagraph() == para) {
                            if (wArray.get(j).getData().charAt(wArray.get(j).getData().length() - 1) == word.charAt(0)) {
                                stringresult += "<b>" + wArray.get(j).getData() + "</b> ";
                            } else {
                                stringresult += wArray.get(j).getData() + " ";
                            }

                        }

                    }
                }
            }

        } // end for

        if (found == false) {
            JOptionPane.showMessageDialog(null, "No words found!");

        } else {
            JOptionPane.showMessageDialog(null, "We have found " + count + " results for you.");

        }
        return stringresult;
    }
    
    public String sInt(String word){
        String stringresult = "";
        boolean found = false;
        int lastpara = 0;
        int para, count = 0;

        try {
            int search1 = Integer.parseInt(word);

            for (int i = 0; i < wArray.size(); i++) {
                if (tryConvert(wArray.get(i).getData().trim())) {

                    if (Integer.parseInt(wArray.get(i).getData()) == search1) {
                        count++;
                        found = true;
                        para = wArray.get(i).getParagraph();

                        if (lastpara == para) {

                        } else {

                            lastpara = para;

                            stringresult += "<br /><br />Paragraph " + wArray.get(i).getParagraph() + ": ";

                            String search2 = Integer.toString(search1);
                            for (int j = 0; j < wArray.size(); j++) {

                                if (wArray.get(j).getParagraph() == para) {
                                    if (wArray.get(j).getData().equals(search2)) {
                                        stringresult += "<b>" + wArray.get(j).getData() + "</b> ";
                                    } else {
                                        stringresult += wArray.get(j).getData() + " ";
                                    }

                                }

                            }

                        }
                    }

                } else {

                }
            }

            if (found == false) {
                JOptionPane.showMessageDialog(null, "No integers found!");

            } else {
                JOptionPane.showMessageDialog(null, "We have found " + count + " results for you.");

            }

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Please enter only digits!");
        }


        return stringresult;
        
    }
    
    public static boolean tryConvert(String a) {
        boolean result = false;
        try {
            Integer.parseInt(a.trim());
            result = true;
        } catch (NumberFormatException e) {
            result = false;
        }
        //System.out.println(result);
        return result;
    }

}
