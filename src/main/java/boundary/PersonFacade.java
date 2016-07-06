/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boundary;

import entities.Person;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import managers.PersonManager;

/**
 *
 * @author bszydzik
 */
@Stateless
@LocalBean
public class PersonFacade {

  @EJB
  PersonManager personManager;
  
  public void addPerson(Person person){
      personManager.create(person);
  }
  
  public List<Person> findAllPersons(){
      return personManager.findAll();
  }
  
  public Person findPerson(Integer id){
      return personManager.find(id);
  }

}
