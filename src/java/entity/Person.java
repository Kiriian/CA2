/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

/**
 *
 * @author Jeanette
 */
@Entity
public class Person extends InfoEntitys implements Serializable
{
    private Integer id;

    private String firstName;
    private String lastName;
    
    @ManyToMany
    private List<Hobby> hobbys = new ArrayList();

    public Person()
    {
        super();
    }

    
    
    public String getFirstName()
    {
        return firstName;
    }

    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    public String getLastName()
    {
        return lastName;
    }

    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }

    public List<Hobby> getHobbys()
    {
        return hobbys;
    }

    public void setHobbys(List<Hobby> hobbys)
    {
        this.hobbys = hobbys;
    }
    @Override
    public Integer getId()
    {
        return id;
    }

    @Override
    public void setId(Integer id)
    {
        this.id = id;
    }

}
