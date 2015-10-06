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
public class Person extends InfoEntity implements Serializable
{
    private String firstName;
    private String lastName;
    @ManyToMany
    private ArrayList<Hobby> hobbyList = new ArrayList();

    public Person()
    {
    }

    public Person(String firstName, String lastName)
    {
        this.firstName = firstName;
        this.lastName = lastName;
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

    public ArrayList<Hobby> getHobbyList()
    {
        return hobbyList;
    }

    public void setHobbyList(ArrayList<Hobby> hobbyList)
    {
        this.hobbyList = hobbyList;
    }
    
    
}
