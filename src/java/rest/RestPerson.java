/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rest;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import entity.Hobby;
import entity.Person;
import facade.Facade;
import java.util.List;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;

/**
 * REST Web Service
 *
 * @author Pernille
 */
@Path("person")
public class RestPerson
{
    
    @Context
    private UriInfo context;

    /**
     * Creates a new instance of RestPerson
     */
    Gson gson;
    public RestPerson()
    {
        gson = new GsonBuilder().setPrettyPrinting().setFieldNamingPolicy(FieldNamingPolicy.IDENTITY).create();
    }

    /**
     * Retrieves representation of an instance of rest.RestPerson
     * @return an instance of java.lang.String
     */
    @GET
    @Path("complete/{id}")
    @Produces("application/json")
    public String getPersonById(@PathParam("id")int id)
    {
        JsonObject person = new JsonObject();       
        JsonObject hobby = new JsonObject();
        JsonArray hobbies= new JsonArray();
        
        Person persons = Facade.getPersonByID(id);
        List<Hobby> hobbiess;

        person.addProperty("firstName", persons.getFirstName());
        person.addProperty("lastName", persons.getLastName());
        person.addProperty("email", persons.getEmail());
        
        hobbiess = persons.getHobbys();
            while (!hobbiess.isEmpty())
            {
                Hobby h = hobbiess.get(0);
                hobby.addProperty("hobbyName", h.getHobbyName());
                hobby.addProperty("description", h.getDescription());
                
                hobbies.add(hobby);
                hobbiess.remove(h);
            }
            person.add("hobbies", hobbies);
        
        return gson.fromJson(person, String.class);

        
        
//        return gson.toJson(Facade.getAllProjects());
    }   
    
    }

    /**
     * PUT method for updating or creating an instance of RestPerson
     * @param content representation for the resource
     * @return an HTTP response with content of the updated or created resource.
     */
//    @PUT
//    @Consumes("application/json")
//    public void putJson(String content)
//    {
//    }
//}

