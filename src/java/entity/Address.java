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
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 *
 * @author Jeanette
 */
@Entity
public class Address implements Serializable
{

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String street;
    private String additionalInfo;

    @OneToMany(mappedBy = "address")
    private ArrayList<InfoEntity> infoE = new ArrayList();

    @ManyToOne
    private CityInfo cI = new CityInfo();

    public Integer getId()
    {
        return id;
    }

    public void setId(Integer id)
    {
        this.id = id;
    }

    public String getStreet()
    {
        return street;
    }

    public void setStreet(String street)
    {
        this.street = street;
    }

    public String getAdditionalInfo()
    {
        return additionalInfo;
    }

    public void setAdditionalInfo(String additionalInfo)
    {
        this.additionalInfo = additionalInfo;
    }

    public ArrayList<InfoEntity> getInfoE()
    {
        return infoE;
    }

    public void setInfoE(ArrayList<InfoEntity> infoE)
    {
        this.infoE = infoE;
    }

    public CityInfo getcI()
    {
        return cI;
    }

    public void setcI(CityInfo cI)
    {
        this.cI = cI;
    }
    
    
}
