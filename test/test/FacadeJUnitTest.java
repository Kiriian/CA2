/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import entity.Company;
import entity.Hobby;
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
        id = 1;
        p = Facade.getPersonByID(id);
        
        assertEquals("1", p.getId());
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
        assertEquals("4", c.getId());
    }
    
    @Test
    public void CountPersonWithHobbyTest()
    {
        hobby = "programming";
        
        count = Facade.countPeopleWithHobby(hobby);
        
        assertEquals("2", count);
    }
    
        @Test
    public void getCompanyByPhoneNumber()
    {
        phoneNumber = "28775863";
        
        c = Facade.getCompanyByPhone(phoneNumber);
        
        assertEquals("4", c.getId());
        assertEquals("cph", c.getCompanyName());
        assertEquals("10", c.getMarketValue());
        assertEquals("10", c.getNumEmployees());
        assertEquals("28775863", c.getPhoneList().get(0));
    }
    
}
