/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cms;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class RegistrationTest {
    
    public RegistrationTest() {
    }
    

    @Test
    public void testRegister() {
        Registration instance = new Registration();
        System.out.println("Register");
        String expResult="Registered";
        String result = instance.Register();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
    
}
