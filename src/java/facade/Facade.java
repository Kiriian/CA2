/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facade;

import entity.Person;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Pernille
 */
public class Facade
{
    public static Person getPerson(int id)
    {
         EntityManagerFactory emf = Persistence.createEntityManagerFactory("CA_2_newPU");
        EntityManager em = emf.createEntityManager();
        return em.find(Person.class, id);
    }
            
}
