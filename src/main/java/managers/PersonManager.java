/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managers;

import entities.Person;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;

/**
 *
 * @author bszydzik
 */
@Stateless
@LocalBean
public class PersonManager extends AbstractManager<Person>{
    
    public PersonManager() {
        super(Person.class);
    }
    
}
