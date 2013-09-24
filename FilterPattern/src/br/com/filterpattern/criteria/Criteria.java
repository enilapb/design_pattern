package br.com.filterpattern.criteria;

import java.util.List;

import br.com.filterpattern.model.Person;

public interface Criteria {

	public List<Person> meetCriteria(List<Person> persons);
}
