/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author Jeanette
 */
@Entity
public class Company extends InfoEntitys implements Serializable
{
    @Id
    private Integer id;
    private String companyName;
    private String description;
    private String cvr;
    private int numEmployees;
    private int marketValue;

    public Company()
    {
        super();
    }
    
    public String getCompanyName()
    {
        return companyName;
    }

    public void setCompanyName(String companyName)
    {
        this.companyName = companyName;
    }

    public String getDescription()
    {
        return description;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }

    public String getCvr()
    {
        return cvr;
    }

    public void setCvr(String cvr)
    {
        this.cvr = cvr;
    }

    public int getNumEmployees()
    {
        return numEmployees;
    }

    public void setNumEmployees(int numEmployees)
    {
        this.numEmployees = numEmployees;
    }

    public int getMarketValue()
    {
        return marketValue;
    }

    public void setMarketValue(int marketValue)
    {
        this.marketValue = marketValue;
    }

}


