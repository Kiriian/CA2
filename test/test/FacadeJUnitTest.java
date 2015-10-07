/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import entity.Company;
import entity.Person;
import facade.Facade;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Jeanette
 */
public class FacadeJUnitTest
{
    private int personID;
    private long id;
    private Person p;
    private String cvr;
    private Company c;
    private String hobby;
    private long count;
    private String phoneNumber;
    
    public FacadeJUnitTest()
    {

    }
    
    @Test
    public void getPersonByIdTest()
    {
        personID = 1;
        p = Facade.getPersonByID(personID);
        
        assertEquals("Jeanette", p.getFirstName());
        assertEquals("Borring-Møller", p.getLastName());
    }
    
    @Test
    public void getCompanyByCVRTest()
    {
        cvr = "11111111";
        c = Facade.getCompanyByCVR(cvr);
        
        assertEquals("11111111", c.getCvr());
        assertEquals("cph", c.getCompanyName());
        assertEquals(10, c.getMarketValue());
        assertEquals(10, c.getNumEmployees());
    }
    
    @Test
    public void CountPersonWithHobbyTest()
    {
        hobby = "programming";
        
        count = Facade.countPeopleWithHobby(hobby);
        
        assertEquals("2", count);
    }
    
        @Test
    public void getCompanyByID()
    {
        id = 4;
        
        c = Facade.getCompanyByID((int) id);
        
        assertEquals(4, (long) c.getId());
        assertEquals("cph", c.getCompanyName());
        assertEquals("10", c.getMarketValue());
        assertEquals("10", c.getNumEmployees());
        assertEquals("28775863", c.getPhoneList().get(0));
    }
    
}
