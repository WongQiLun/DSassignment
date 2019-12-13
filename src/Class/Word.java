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
public class Word {
    private String data;
    private int row;
    private int paragraph;

    public Word(String data, int row, int paragraph){
        this.data = data;
        this.row = row;
        this.paragraph = paragraph;
    }
    
    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getParagraph() {
        return paragraph;
    }

    public void setParagraph(int paragraph) {
        this.paragraph = paragraph;
    }
    
    public String toString(){
        String s = "";

        s += "Paragraph " + getParagraph() + ": " + this.data;
        
        return s;
    }
    public boolean isLowerThan(Word x ){
        boolean higher =false;
        //todo is higher
        
        if(this.data.compareToIgnoreCase(x.data)>= 0){
            higher= true;
        }
       return higher; 
    }
    
}
