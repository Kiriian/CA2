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
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import scripts.PersistData;

/**
 *
 * @author Jeanette
 */
public class Tester
{

    public static void main(String[] args)
    {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("CA_2PU");
        EntityManager em = emf.createEntityManager();
//        PersistData.testData(em);
        Person p = Facade.getPersonByID(1);
        List<Hobby> h = p.getHobbys();
        for (Hobby h1 : h)
        {
            System.out.println("Hobby: " + h1.getHobbyName());
        }
        System.out.println("Person: " + p.getFirstName() + ", " + p.getLastName());
        long count = Facade.countPeopleWithHobby("programmering");
        System.out.println("count = " + count);
        Company c = Facade.getCompanyByCVR(75897548);
        System.out.println("Company: " + c.getId());
        Company cc = Facade.getCompanyByID(7);
        System.out.println("company: " + cc.getId());
        System.out.println("company: " + cc.getCvr());
    }
}
