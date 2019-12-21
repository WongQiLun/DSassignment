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
public interface DuplicateWordADT {
    
    public String sContains(String word, int para);
    /*
    Description: To search any duplicate words contains in paragrah
    Precondition: None
    Postcondition: None
    Return: The search of duplicate words.
    */
    
    public String sWhole(String word, int para);
    /*
    Description: To search the the whole string word in paragraph
    Precondition: None
    Postcondition: None
    Return: The search of string
    */
    
    public String sStart(String word, int para);
    /*
    Description: To search the first character from paragraph  match the word
    Precondition: None
    Postcondition: None
    Return: The search result
    */
    
    public String sEnd(String word, int para);
    /*
    Description: To search the last character from paragraph match the word
    Precondition: None
    Postcondition: None
    Return: The search result
    */
    
    public int sInt(String word, int para);
    /*
    Description: To search the integer from paragraph match the word
    Precondition: None
    Postcondition: None
    Return: The search result
    */
    
}
