/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testsomeshit;

import Class.User;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import static testsomeshit.Testsomeshit.*;

/**
 *
 * @author ongchunheng
 */
public class Login_UITest {
    
    //private User u;
    
    public Login_UITest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        System.out.println("* Login_UITest: @Test Class Started" );
    }
    
    @AfterClass
    public static void tearDownClass() {
        System.out.println("* Login_UITest: @Test Class Ended" );
    }
    
    @Before
    public void setUp() {
        System.out.println("* Login_UITest: @Test Method Started" );
        
        //u = new User("user","123","Member","Active");        
    }
    
    @After
    public void tearDown() {
        System.out.println("* Login_UITest: @Test Method Ended" );
    }

    /**
     * Test of check method, of class Login_UI.
     */
    @Test
    public void testCheck() {
        addData();
        System.out.println("\nCheck Login");
        String username = "user";
        String password = "123";
        
//        assertEquals(u.getUsername(),username);
//        assertEquals(u.getPassword(),password);
//        assertEquals(u.getStatus(),"Active");
       
        assertEquals(userdata.get(0).getUsername(),username);
        assertEquals(userdata.get(0).getPassword(),password);
        assertEquals(userdata.get(0).getStatus(),"Active");
        
        System.out.println("\nCorrect username and password");
        assertTrue(testcheckUsername(username,userdata.get(0).getUsername()));
        assertTrue(testcheckPassword(password,userdata.get(0).getPassword()));
        
        System.out.println("\nIncorrect username and password");
        assertFalse(testcheckUsername(password,userdata.get(0).getUsername()));
        assertFalse(testcheckPassword(username,userdata.get(0).getPassword()));
        
        System.out.println("\nUsername and password left blank");
        assertFalse(testcheckUsername(" ",userdata.get(0).getUsername()));
        assertFalse(testcheckPassword(" ",userdata.get(0).getPassword()));
              
        System.out.print("\n");
        
        //Login_UI instance = new Login_UI();        
        //instance.check(username, password);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    public boolean testcheckUsername(String username,String usernamedata){
        boolean result = false;
        
        if(username.equals(usernamedata)){
            result = true;
        }
        
        else
            result = false;
        
        return result;
    }
    
    public boolean testcheckPassword(String password, String passdata){
        boolean result = false;
        
        if(password.equals(passdata)){
            result = true;
        }
        
        else
            result = false;
        
        return result;
    }

    /**
     * Test of main method, of class Login_UI.
     */
    //@Test
    public void testMain() {
        //System.out.println("main");
        String[] args = null;
        Login_UI.main(args);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
