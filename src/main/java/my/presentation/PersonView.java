/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.presentation;

import boundary.PersonFacade;
import entities.Person;
import java.io.Serializable;
import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
//import javax.faces.bean.ViewScoped;
import javax.inject.Named;

/**
 *
 * @author bszydzik
 */
@Named("personView")
@SessionScoped
public class PersonView implements Serializable {

    @EJB
    private PersonFacade personFacade;

    private Person person;

    public PersonView() {
        this.person = new Person();
    }

    public void init(Person p) {
        this.person = p;
    }

    public void init() {
        this.person = new Person();
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public void save() {

        System.out.println("Dodawanie: " + person);
        if (person.getId() == null) {
            personFacade.addPerson(person);
        } else {
            personFacade.updatePerson(person);
        }
        count();
    }

    public void count() {
        personFacade.countPersons();
        System.out.println(personFacade.countPersons());

    }

    public void update() {
        System.out.println("Dodawanie: " + person);
        personFacade.updatePerson(person);
    }

}
