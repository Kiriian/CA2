/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import java.util.ArrayList;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

/**
 *
 * @author Pernille
 */
@Entity
public class Hobby implements Serializable
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private String description;
    @ManyToMany(mappedBy = "hobbyList")
    private ArrayList<Person> personList = new ArrayList();

    public Hobby()
    {
    }

    public Hobby(long id, String name, String description)
    {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    public ArrayList<Person> getPersonList()
    {
        return personList;
    }

    public void setPersonList(ArrayList<Person> personList)
    {
        this.personList = personList;
    }
    
    public long getId()
    {
        return id;
    }

    public void setId(long id)
    {
        this.id = id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getDescription()
    {
        return description;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }

}
