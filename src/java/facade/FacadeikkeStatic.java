/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facade;

import entity.Person;
import static facade.Facade.emf;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

/**
 *
 * @author Jeanette
 */
public class FacadeikkeStatic
{

    EntityManagerFactory emf;

    public FacadeikkeStatic(EntityManagerFactory emf)
    {
        this.emf = emf;
    }

    EntityManager getEntityManager()
    {
        return emf.createEntityManager();
    }

    public Person getPerson(int id)
    {
        EntityManager em = getEntityManager();
        try
        {
            return em.find(Person.class, id);
        } finally
        {
            em.close();
        }
    }
}
