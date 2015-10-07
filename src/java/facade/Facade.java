/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facade;

import entity.CityInfo;
import entity.Company;
import entity.Hobby;
import entity.Person;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Pernille
 */
public class Facade
{

    static EntityManagerFactory emf = Persistence.createEntityManagerFactory("CA_2PU");

    public static Person getPersonByID(int id)
    {
        EntityManager em = emf.createEntityManager();
        try
        {
            em.getTransaction().begin();
            Person p = em.createQuery("SELECT p FROM Person p WHERE p.id = :id", Person.class).setParameter("id", id).getSingleResult();
            em.getTransaction().commit();
            return p;
        } finally
        {
            em.close();
        }

    }

    public static Company getCompanyByPhone(int number)
    {
        EntityManager em = emf.createEntityManager();
        try
        {
            em.getTransaction().begin();
            Company c = em.createQuery("SELECT c FROM Company c WHERE c.phoneList=:number", Company.class).setParameter("number", number).getSingleResult();
            em.getTransaction().commit();
            return c;
        } finally
        {
            em.close();
        }
    }

    public static int countPeopleWithHobby(String hobbyName)
    {
        EntityManager em = emf.createEntityManager();
        try
        {
            em.getTransaction().begin();
            int count = em.createQuery("SELECT COUNT(p.id) FROM Person p WHERE p.hobbys.hobbyName= :hobbyName", int.class).setParameter("hobbyName", hobbyName).getSingleResult();


            em.getTransaction().commit();
            return count;
        } finally
        {
            em.close();
        }

    }

}
