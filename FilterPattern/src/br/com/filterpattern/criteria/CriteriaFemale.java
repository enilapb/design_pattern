package br.com.filterpattern.criteria;

import java.util.ArrayList;
import java.util.List;

import br.com.filterpattern.model.Person;

public class CriteriaFemale implements Criteria{

	@Override
	public List<Person> meetCriteria(List<Person> persons) {
		
		List<Person> femalePersons = new ArrayList<Person>();
		for (Person person : persons) {
			if(person.getGender().equalsIgnoreCase("FEMALE")){
				femalePersons.add(person);
			}
		}
		return femalePersons;
	}

}
