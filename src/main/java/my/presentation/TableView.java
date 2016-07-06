/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.presentation;

import boundary.PersonFacade;
import entities.Person;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

/**
 *
 * @author bszydzik
 */
@Named("tableView")
@ViewScoped
public class TableView implements Serializable{
    
    @EJB
    private PersonFacade personFacade;

    private List<Person> persons = new ArrayList<>();

    public TableView() {
        
    }
    
    @PostConstruct
    private void init(){
        persons = personFacade.findAllPersons();
        System.out.println(persons);
    }
    
    public List<Person> getPersons() {
        return persons;
    }

    public void setPersons(List<Person> persons) {
        this.persons = persons;
    }
    
    
    
}
