/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.presentation;

import boundary.PersonFacade;
import entities.Person;
import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.view.ViewScoped;
//import javax.faces.bean.ViewScoped;
import javax.inject.Named;

/**
 *
 * @author bszydzik
 */
@Named("personView")
@ViewScoped
public class PersonView implements Serializable{

    @EJB
    private PersonFacade personFacade;

    private Person person;
    
    public PersonView() {
        this.person = new Person();
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public void save() {
        System.out.println("Dodawanie: "+person);
        personFacade.addPerson(person);
    }   

}
