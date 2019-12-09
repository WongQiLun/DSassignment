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

/**
 *
 * @author ongchunheng
 */
public class Login_UITest {
    
    private User u;
    
    public Login_UITest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        System.out.println("* Login_UITest: @Test Class Started" );
    }
    
    @AfterClass
    public static void tearDownClass() {
        System.out.println("* Login_UITest: @ATest Class Ended" );
    }
    
    @Before
    public void setUp() {
        System.out.println("* Login_UITest: @Test Method Started" );
        u = new User("user","123","Member","Active");        
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
        System.out.println("\nCheck Login");
        String username = "user";
        String password = "123";
        
        assertEquals(u.getUsername(),username);
        assertEquals(u.getPassword(),password);
        assertEquals(u.getStatus(),"Active");
        
        System.out.print("\n");
        
        //Login_UI instance = new Login_UI();        
        //instance.check(username, password);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
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
