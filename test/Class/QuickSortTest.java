///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package Class;
//
//import java.io.File;
//import java.io.FileNotFoundException;
//import java.util.Scanner;
//import java.util.logging.Level;
//import java.util.logging.Logger;
//import org.junit.After;
//import org.junit.AfterClass;
//import org.junit.Before;
//import org.junit.BeforeClass;
//import org.junit.Test;
//import static org.junit.Assert.*;
//import testsomeshit.GUI;
//
///**
// *
// * @author Ong
// */
//public class QuickSortTest {
//
//    public QuickSortTest() {
//    }
//
//    @BeforeClass
//    public static void setUpClass() {
//    }
//
//    @AfterClass
//    public static void tearDownClass() {
//    }
//
//    @Before
//    public void setUp() {
//    }
//
//    @After
//    public void tearDown() {
//    }
//
//    /**
//     * Test of sort method, of class QuickSort.
//     */
//    @Test
//    public void testSort() {
//        File file = new File("C:\\Users\\Ong\\Documents\\NetBeansProjects\\DSassignment\\Dictionary.txt");
//        WordDoublyLinkedList<Word> arr = new WordDoublyLinkedList();
//
//        Check check = new Check();
//        arr = check.convertToWDLL(file);
//        File file2 = new File("C:\\Users\\Ong\\Documents\\NetBeansProjects\\DSassignment\\DictionarySorted.txt");
//
//        WordDoublyLinkedList<Word> arr2 = new WordDoublyLinkedList();
//        arr2 = check.convertToWDLL(file2);
//
//        int low = 1;
//        int high = arr.nodeNumber;
//        QuickSort instance = new QuickSort();
//        instance.sort(arr, low, high);
//
//        assertTrue(check.equals(arr, arr2));
//        // TODO review the generated test code and remove the default call to fail.
//        //fail("The test case is a prototype.");
//    }
//}
//
///**
// * Test of partition method, of class QuickSort.
// */
//
//
//
//class Check {
//
//    public boolean equals(WordDoublyLinkedList<Word> x, WordDoublyLinkedList<Word> t) {
//
//        for (int y = 1; y <= x.nodeNumber; y++) {
//            System.out.println(x.getItem(y).getData() + t.getItem(y).getData());
//            if (x.getItem(y).getData().compareTo(t.getItem(y).getData()) != 0) {
//                
//                 return false;
//            }
//           
//        }
//        return true;
//
//    }
//
//    public WordDoublyLinkedList<Word> convertToWDLL(File file) {
//        int paragraph = 1;
//        WordDoublyLinkedList<Word> arr = new WordDoublyLinkedList();
//        Scanner s = null;
//        try {
//            s = new Scanner(file); //Read the selected file content
//        } catch (FileNotFoundException ex) {
//            Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        String line = "";
//
//        while (s.hasNextLine()) {
//            line += s.nextLine() + " \n";
//
//        }
//
//        String[] stringArray = line.split(" ");
//        for (String e : stringArray) {        //Insert into WordList ADT
//            if (e.contains("\n") && !e.isEmpty()) {
//
//                paragraph++;
//                Word w = new Word(e.substring(1), paragraph, paragraph);
//                //System.out.println(e);
//                if (!w.getData().isEmpty()) {
//
//                    arr.append(w);
//                    System.out.println(w);
//                }
//            } else {
//                Word w = new Word(e.trim(), paragraph, paragraph);
//                //System.out.println(e);
//                if (!w.getData().isEmpty()) {
//
//                    arr.append(w);
//                    System.out.println(w);
//                }
//            }
//        }
//        return arr;
//    }
//}
