/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class;

import javax.swing.JOptionPane;
import static testsomeshit.FilterSearch_UI.wArray;
import static testsomeshit.FilterSearch_UI.displayed;
/**
 *
 * @author ongchunheng
 */
public class WordList<T> implements WordListADT<T> {

    private T[] array;
    private int size;

    long average;
    int countaverage = 0;
    
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
    
    public void clear(){
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
    
    public String sContains(String word, int spara) {
        
        boolean found = false;
        int count = 0;
        int para = 0;
        int lastpara = 0;
        String stringresult = "";
        String wPara = "";
        long startTime1 = System.nanoTime();
        
        if(spara == 0){
            wPara = "All";
        }
        else{
            wPara = Integer.toString(spara);
        }
        
        System.out.println("Filter Algorithm for Contains");
        System.out.println("=============================");
        System.out.println("Word to search : " + word);
        System.out.println("Paragraph : " + wPara);
        
        if(spara == 0){
            for (int i = 0; i < wArray.size(); i++) {

                if (wArray.get(i).getData().toLowerCase().contains(word.toLowerCase())) {

                    count++;
                    found = true;
                    para = wArray.get(i).getParagraph();

                    if (lastpara == para) {

                    } else {

                        lastpara = para;

                        stringresult += "<br /><br />Paragraph " + wArray.get(i).getParagraph() + ": ";

                        for (int j = 0; j < wArray.size(); j++) {

                            if (wArray.get(j).getParagraph() == para) {
                                if (wArray.get(j).getData().toLowerCase().contains(word.toLowerCase())) {
                                    stringresult += "<b>" + wArray.get(j).getData() + "</b> ";
                                } else {
                                    stringresult += wArray.get(j).getData() + " ";
                                }

                            }

                        }

                    }

                }

            }
            
        }
        
        else{
            for (int i = 0; i < wArray.size(); i++) {

                if (wArray.get(i).getData().toLowerCase().contains(word.toLowerCase())
                        && wArray.get(i).getParagraph() == spara) {

                    count++;
                    found = true;
                    para = wArray.get(i).getParagraph();

                    if (lastpara == para) {

                    } else {

                        lastpara = para;

                        stringresult += "<br /><br />Paragraph " + wArray.get(i).getParagraph() + ": ";

                        for (int j = 0; j < wArray.size(); j++) {

                            if (wArray.get(j).getParagraph() == para) {
                                if (wArray.get(j).getData().toLowerCase().contains(word.toLowerCase())
                                        && wArray.get(i).getParagraph() == spara) {
                                    
                                    stringresult += "<b>" + wArray.get(j).getData() + "</b> ";
                                } else {
                                    stringresult += wArray.get(j).getData() + " ";
                                }

                            }

                        }

                    }

                }

            }            
            
        }
        
         // end for
        long endTime1 = System.nanoTime();
        long elapsedTime1 = endTime1 - startTime1;
        
        if(found == false){            
            System.out.println("Result : Not found");
        }
        
        else{            
            System.out.println("Result : Found");
        }
        
        System.out.println("\nExecution time for Searching Algorithm (Contains) : " + elapsedTime1 + " ns\n\n");
                
        if (displayed == false) {
            if (found == false) {
                JOptionPane.showMessageDialog(null, "No words found!");
                displayed = true;
            } else {
                JOptionPane.showMessageDialog(null, "We have found " + count + " results for you.");
                displayed = true;
            }
        }
        
        countaverage++;
        
        if (countaverage == 10) {
            average += elapsedTime1;
            System.out.println("Average Execution Time: " + (average / 10));
            average = 0;
            countaverage = 0;
        } else {
            average += elapsedTime1;
        }
        
        
        return stringresult;
    }
    
    public String sWhole(String word, int spara){
        
        boolean found = false;
        int count = 0;
        int count1 = 0;
        int lastpara = 0;
        String stringresult = "";
        String wPara = "";
        long startTime1 = System.nanoTime();
        
        if(spara == 0){
            wPara = "All";
        }
        else{
            wPara = Integer.toString(spara);
        }
        
        System.out.println("Filter Algorithm for Whole");
        System.out.println("=============================");
        System.out.println("Word to search : " + word);
        System.out.println("Paragraph : " + wPara);
        
        if (spara == 0) {
            
            if(word.contains(" ")){
                String[] word1 = word.split(" ");
                
                for(int i = 0 ; i < wArray.size(); i++) {
                    count1 = 0;
                    int k1 = i;
                    for(int k = 0 ; k < word1.length ; k++){
                        
                        if(wArray.get(k1).getData().toLowerCase().equals(word1[k])){
                            count1++;
                                                     
                        }
                        else{                            
                            break;
                        }
                        k1++; 
                        
                    }
                    
                    if(count1 == word1.length){
                        found = true;
                        count ++;
                        
                        int para = wArray.get(i).getParagraph();
                        
                        if (lastpara == para) {

                        }
                        
                         else{
                            lastpara = para;
                           
                            stringresult += "<br /><br />Paragraph " + wArray.get(i).getParagraph() + ": ";
                            
                            for (int j = 0; j < wArray.size(); j++) {
                                
                                //int k2 = j;

                                if (wArray.get(j).getParagraph() == para) {
                                    
                                    try {
                                        for (int k = 0; k < word1.length; k++) {

                                            if (wArray.get(j).getData().toLowerCase().equals(word1[k])) {

                                                stringresult += "<b>" + wArray.get(j).getData() + "</b> ";
                                                j++;

                                            }
                                            else{
                                                break;
                                            }

                                            //k2++;

                                        }
                                    } catch (NullPointerException e) {
 
                                    }
                                    
                                    try {
                                        if (wArray.get(j).getParagraph() != lastpara) {

                                        } else {
                                            stringresult += wArray.get(j).getData() + " ";
                                        }
                                    } catch (NullPointerException e) {

                                    }

                                }

                            }
                            
                        }
                        
                    }
                   
                }
                
            }
            
            else{
                for (int i = 0; i < wArray.size(); i++) {

                    if (word.toLowerCase().equals(wArray.get(i).getData().toLowerCase())) {
                        count++;
                        found = true;
                        int para = wArray.get(i).getParagraph();

                        if (lastpara == para) {

                        } else {
                            lastpara = para;

                            stringresult += "<br /><br />Paragraph " + wArray.get(i).getParagraph() + ": ";

                            for (int j = 0; j < wArray.size(); j++) {

                                if (wArray.get(j).getParagraph() == para) {
                                    if (wArray.get(j).getData().toLowerCase().equals(word.toLowerCase())) {
                                        stringresult += "<b>" + wArray.get(j).getData() + "</b> ";
                                    } else {
                                        stringresult += wArray.get(j).getData() + " ";
                                    }

                                }

                            }

                        }

                    }

                }
            }

        }
        
        else{
            
            if(word.contains(" ")){
                String[] word1 = word.split(" ");
                
                for(int i = 0 ; i < wArray.size(); i++) {
                    count1 = 0;
                    int k1 = i;
                    for(int k = 0 ; k < word1.length ; k++){
                        
                        if(wArray.get(k1).getData().toLowerCase().equals(word1[k]) && 
                                wArray.get(k1).getParagraph() == spara){
                            count1++;
                                                     
                        }
                        else{                            
                            break;
                        }
                        k1++; 
                        
                    }
                    
                    if(count1 == word1.length){
                        found = true;
                        count ++;
                        
                        int para = wArray.get(i).getParagraph();
                        
                        if (lastpara == para) {

                        }
                        
                         else{
                            lastpara = para;
                            
                            stringresult += "<br /><br />Paragraph " + wArray.get(i).getParagraph() + ": ";
                            
                            for (int j = 0; j < wArray.size(); j++) {
                                
                                //int k2 = j;

                                if (wArray.get(j).getParagraph() == para) {
                                    
                                    try {
                                        for (int k = 0; k < word1.length; k++) {

                                            if (wArray.get(j).getData().toLowerCase().equals(word1[k])
                                                    && wArray.get(j).getParagraph() == spara) {

                                                stringresult += "<b>" + wArray.get(j).getData() + "</b> ";
                                                j++;

                                            }
                                            
                                            else{
                                                break;
                                            }

                                            //k2++;

                                        }
                                    } catch (NullPointerException e) {

                                    }

                                    try {
                                        if (wArray.get(j).getParagraph() != lastpara) {

                                        } else {
                                            stringresult += wArray.get(j).getData() + " ";
                                        }
                                    } catch (NullPointerException e) {

                                    }

                                }

                            }
                            
                        }
                        
                    }
                   
                }
                
            }
            
            else
            {
                for (int i = 0; i < wArray.size(); i++) {

                    if (word.toLowerCase().equals(wArray.get(i).getData().toLowerCase())
                            && wArray.get(i).getParagraph() == spara) {

                        count++;
                        found = true;
                        int para = wArray.get(i).getParagraph();

                        if (lastpara == para) {

                        } else {
                            lastpara = para;

                            stringresult += "<br /><br />Paragraph " + wArray.get(i).getParagraph() + ": ";

                            for (int j = 0; j < wArray.size(); j++) {

                                if (wArray.get(j).getParagraph() == para) {
                                    if (wArray.get(j).getData().toLowerCase().equals(word.toLowerCase())
                                            && wArray.get(i).getParagraph() == spara) {

                                        stringresult += "<b>" + wArray.get(j).getData() + "</b> ";

                                    } else {
                                        stringresult += wArray.get(j).getData() + " ";
                                    }

                                }

                            }

                        }

                    }

                }
            }
            
            
            
        }

         // end for

        long endTime1 = System.nanoTime();
        long elapsedTime1 = endTime1 - startTime1;
        
        if(found == false){            
            System.out.println("Result : Not found");
        }
        
        else{            
            System.out.println("Result : Found");
        }
        
        System.out.println("\nExecution time for Searching Algorithm (Whole) : " + elapsedTime1 + " ns\n\n");
        
        
        if (displayed == false) {
            if (found == false) {
                JOptionPane.showMessageDialog(null, "No words found!");
                displayed = true;
            } else {
                JOptionPane.showMessageDialog(null, "We have found " + count + " results for you.");
                displayed = true;
            }
        }
        
        countaverage++;
        
        if(countaverage == 10){
            average  += elapsedTime1;
            System.out.println("Average Execution Time: " + (average / 10));
            average = 0;
            countaverage = 0;
        }
        else{
            average  += elapsedTime1;
        }
        
        
        return stringresult;
    }
    
    public String sStart(String word, int spara){
        boolean found = false;
        int count = 0;
        int lastpara = 0;
        String stringresult = "";
        String wPara = "";
        long startTime1 = System.nanoTime();
        
        if(spara == 0){
            wPara = "All";
        }
        else{
            wPara = Integer.toString(spara);
        }
        
        System.out.println("Filter Algorithm for First Characters");
        System.out.println("=============================");
        System.out.println("Word to search : " + word);
        System.out.println("Paragraph : " + wPara);
        
        if(spara == 0){
            for (int i = 0; i < wArray.size(); i++) {

                if (wArray.get(i).getData().toLowerCase().startsWith(word.toLowerCase())) {
                    count++;
                    found = true;
                    int para = wArray.get(i).getParagraph();

                    if (lastpara == para) {

                    } else {
                        lastpara = para;
                        stringresult += "<br /><br />Paragraph " + wArray.get(i).getParagraph() + ": ";

                        for (int j = 0; j < wArray.size(); j++) {

                            if (wArray.get(j).getParagraph() == para) {
                                if (wArray.get(j).getData().toLowerCase().startsWith(word.toLowerCase())) {
                                    stringresult += "<b>" + wArray.get(j).getData() + "</b> ";
                                } else {
                                    stringresult += wArray.get(j).getData() + " ";
                                }

                            }

                        }
                        
                    }

                }

            }
            
        }
        
        else{
            
            for (int i = 0; i < wArray.size(); i++) {

                if (wArray.get(i).getData().toLowerCase().startsWith(word.toLowerCase())
                        && wArray.get(i).getParagraph() == spara) {
                    
                    count++;
                    found = true;
                    int para = wArray.get(i).getParagraph();

                    if (lastpara == para) {

                    } else {
                        lastpara = para;
                        stringresult += "<br /><br />Paragraph " + wArray.get(i).getParagraph() + ": ";

                        for (int j = 0; j < wArray.size(); j++) {

                            if (wArray.get(j).getParagraph() == para) {
                                if (wArray.get(j).getData().toLowerCase().startsWith(word.toLowerCase())
                                        && wArray.get(i).getParagraph() == spara) {
                                    
                                    stringresult += "<b>" + wArray.get(j).getData() + "</b> ";
                                    
                                } else {
                                    stringresult += wArray.get(j).getData() + " ";
                                }

                            }

                        }
                        
                    }

                }

            }

        }

        long endTime1 = System.nanoTime();
        long elapsedTime1 = endTime1 - startTime1;
        
        if(found == false){            
            System.out.println("Result : Not found");
        }
        
        else{            
            System.out.println("Result : Found");
        }
        
        System.out.println("\nExecution time for Searching Algorithm (Start) : " + elapsedTime1 + " ns\n\n");
        
        if (displayed == false) {
            if (found == false) {
                JOptionPane.showMessageDialog(null, "No words found!");
                displayed = true;
            } else {
                JOptionPane.showMessageDialog(null, "We have found " + count + " results for you.");
                displayed = true;
            }
        }
        
        countaverage++;
        
        if(countaverage == 10){
            average  += elapsedTime1;
            System.out.println("Average Execution Time: " + (average / 10));
            average = 0;
            countaverage = 0;
        }
        else{
            average  += elapsedTime1;
        }
        
        return stringresult;
    }
    
    public String sEnd(String word, int spara){
        String stringresult = "";
        boolean found = false;
        int count = 0;
        int lastpara = 0;
        String wPara = "";
        long startTime1 = System.nanoTime();
        
        if(spara == 0){
            wPara = "All";
        }
        else{
            wPara = Integer.toString(spara);
        }
        
        System.out.println("Filter Algorithm for Last Character");
        System.out.println("=============================");
        System.out.println("Word to search : " + word);
        System.out.println("Paragraph : " + wPara);
        
        if(spara == 0){
            
            for (int i = 0; i < wArray.size(); i++) {

                if (wArray.get(i).getData().toLowerCase().endsWith(word.toLowerCase())
                       ) {
                    count++;
                    found = true;
                    int para = wArray.get(i).getParagraph();

                    if (lastpara == para) {

                    } else {
                        lastpara = para;
                        stringresult += "<br /><br />Paragraph " + wArray.get(i).getParagraph() + ": ";

                        for (int j = 0; j < wArray.size(); j++) {

                            if (wArray.get(j).getParagraph() == para) {
                                if (wArray.get(j).getData().toLowerCase().endsWith(word.toLowerCase())) {
                                    stringresult += "<b>" + wArray.get(j).getData() + "</b> ";
                                } else {
                                    stringresult += wArray.get(j).getData() + " ";
                                }

                            }

                        }
                        
                    }
                    
                }

            } // end for

        }
        
        else{
            
            for (int i = 0; i < wArray.size(); i++) {

                if (wArray.get(i).getData().toLowerCase().endsWith(word.toLowerCase())
                        && wArray.get(i).getParagraph() == spara) {
                    count++;
                    found = true;
                    int para = wArray.get(i).getParagraph();

                    if (lastpara == para) {

                    } else {
                        lastpara = para;
                        stringresult += "<br /><br />Paragraph " + wArray.get(i).getParagraph() + ": ";

                        for (int j = 0; j < wArray.size(); j++) {

                            if (wArray.get(j).getParagraph() == para) {
                                if (wArray.get(j).getData().toLowerCase().endsWith(word.toLowerCase())
                                        && wArray.get(j).getParagraph() == spara) {
                                    
                                    stringresult += "<b>" + wArray.get(j).getData() + "</b> ";
                                    
                                } else {
                                    stringresult += wArray.get(j).getData() + " ";
                                }

                            }

                        }
                        
                    }
                    
                }

            } // end for
            
        }

        long endTime1 = System.nanoTime();
        long elapsedTime1 = endTime1 - startTime1;
        
        if(found == false){            
            System.out.println("Result : Not found");
        }
        
        else{            
            System.out.println("Result : Found");
        }
        
        System.out.println("\nExecution time for Searching Algorithm (End) : " + elapsedTime1 + " ns\n\n");
        
        if (displayed == false) {
            if (found == false) {
                JOptionPane.showMessageDialog(null, "No words found!");
                displayed = true;
            } else {
                JOptionPane.showMessageDialog(null, "We have found " + count + " results for you.");
                displayed = true;
            }
        }    
        
        countaverage++;
        
        if(countaverage == 10){
            average  += elapsedTime1;
            System.out.println("Average Execution Time: " + (average / 10));
            average = 0;
            countaverage = 0;
        }
        else{
            average  += elapsedTime1;
        }
        
        
        return stringresult;
    }
    
    public String sInt(String word, int spara){
        String stringresult = "";
        boolean found = false;
        int lastpara = 0;
        int para, count = 0;
        String wPara = "";
        long startTime1 = System.nanoTime();
        
        if(spara == 0){
            wPara = "All";
        }
        else{
            wPara = Integer.toString(spara);
        }
        
        System.out.println("Filter Algorithm for Interger");
        System.out.println("=============================");
        System.out.println("Word to search : " + word);
        System.out.println("Paragraph : " + wPara);

        try {
            int search1 = Integer.parseInt(word);
            
            if(spara == 0){
                
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

            }
            
            else{
                for (int i = 0; i < wArray.size(); i++) {
                    if (tryConvert(wArray.get(i).getData().trim())) {

                        if (Integer.parseInt(wArray.get(i).getData()) == search1
                                && wArray.get(i).getParagraph() == spara) {
                            
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

            }

            long endTime1 = System.nanoTime();
            long elapsedTime1 = endTime1 - startTime1;

            if (found == false) {
                System.out.println("Result : Not found");
            } else {
                System.out.println("Result : Found");
            }

            System.out.println("\nExecution time for Searching Algorithm (Int) : " + elapsedTime1 + " ns\n\n");

            if (displayed == false) {
                if (found == false) {
                    JOptionPane.showMessageDialog(null, "No words found!");
                    displayed = true;
                } else {
                    JOptionPane.showMessageDialog(null, "We have found " + count + " results for you.");
                    displayed = true;
                }
            }
            
            countaverage++;

            if (countaverage == 10) {
                average += elapsedTime1;
                System.out.println("Average Execution Time: " + (average / 10));
                average = 0;
                countaverage = 0;
            } else {
                average += elapsedTime1;
            }
        

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Please enter only digits!");
            displayed = true;
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

        return result;
    }

}
