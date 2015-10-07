/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import entity.Hobby;
import entity.Person;
import facade.Facade;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Jeanette
 */
public class Tester
{

    public static void main(String[] args)
    {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("CA_2PU");
        Person p = Facade.getPersonByID(1);
        List<Hobby> h = p.getHobbys();
        for (Hobby h1 : h)
        {
            System.out.println("hobby: " + h1);
        }
        System.out.println("Person: " + p.getFirstName() + ", " + p.getLastName() + ", ");
        long count = Facade.countPeopleWithHobby("programmering");
        System.out.println("count = " + count);
        Facade.getCompanyByPhone("28775863");

    }
}
