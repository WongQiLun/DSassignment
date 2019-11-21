/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testsomeshit;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.*;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import Class.User;
import Class.UserList;
import Class.UserListInterface;

/**
 *
 * @author Ong
 */
public class Testsomeshit {

    /**
     * @param args the command line arguments
     */
    public static UserListInterface<User> userdata = new UserList<>();

    public static void main(String[] args) throws FileNotFoundException, IOException {

//        JFileChooser chooser = new JFileChooser();
//
//        FileNameExtensionFilter filter = new FileNameExtensionFilter("Text file", "txt");
//        chooser.setFileFilter(filter);
//        int returnVal = chooser.showOpenDialog(null);
//        File file = chooser.getSelectedFile();
//        BufferedReader in1 = new BufferedReader(new FileReader(file));  //Read the selected file content
//        String line1;
//
//        while ((line1 = in1.readLine()) != null) {
//            System.out.println(line1);
//        }
//        
        addData();
        Login_UI l = new Login_UI();
        l.setVisible(true);

    }

    public static void addData() {
        User u = new User("user", "123","Member");
        User u1 = new User("user1", "123","Member");
        User u2 = new User("user2", "123","Member");
        User p = new User("publisher","123","Publisher");

        userdata.add(u);
        userdata.add(u1);
        userdata.add(u2);
        userdata.add(p);

        
    }

}
