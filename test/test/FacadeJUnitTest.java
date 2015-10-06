/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import entity.Person;
import facade.Facade;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.BeforeClass;

/**
 *
 * @author Jeanette
 */
public class FacadeJUnitTest
{
    private int id;
    private Person p;
    
    public FacadeJUnitTest()
    {

    }
    
    @Test
    public void getPersonByIdTest()
    {
        id = 1;
        p = Facade.getPersonByID(id);
        
        assertEquals("Jeanette", p.getFirstName());
        assertEquals("Borring-Møller", p.getLastName());
    }
    
}
