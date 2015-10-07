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

/**
 *
 * @author Jeanette
 */
public class Tester
{

    public static void main(String[] args)
    {
//        EntityManagerFactory emf = Persistence.createEntityManagerFactory("CA_2PU");
        Person p = Facade.getPersonByID(1);
        System.out.println("Person: " + p.getFirstName() + ", " + p.getLastName());
        System.out.println("hobby: " + p.getHobbys());
////        long count = Facade.countPeopleWithHobby("programmering");
//        System.out.println("count = " + count);
//        Facade.getCompanyByPhone("28775863");
        Company c = Facade.getCompanyByCVR("11111111");
        System.out.println("Company: " + c.getId());
        Company cc = Facade.getCompanyByID(4);
        System.out.println("company: " + cc.getId());
        System.out.println("company: " + cc.getCvr());
        System.out.println("Company: " + Facade.getCompanyByCVR(c.getCvr()));
    }
}
