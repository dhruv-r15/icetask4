/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package testicetask4;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 *
 * @author lab_services_student
 */
public class IceTaskTest {

    IceTask icetask = new IceTask();
    public IceTaskTest() {
    }

    @Test
    public void testgetMessage() {
        
        String expected = "I have arrived";
        String actual = icetask.getMessage();
        
        assertEquals(expected,actual);
    }

}
