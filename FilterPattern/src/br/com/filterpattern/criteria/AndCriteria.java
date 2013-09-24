package br.com.filterpattern.criteria;

import java.util.List;

import br.com.filterpattern.model.Person;

public class AndCriteria implements Criteria{

	private Criteria criteria;
	private Criteria otherCriteria;
	
	public AndCriteria(Criteria criteria, Criteria otherCriteria) {
		this.criteria = criteria;
		this.otherCriteria = otherCriteria;
	}
	
	@Override
	public List<Person> meetCriteria(List<Person> persons) {
		List<Person> firstCriteriaPersosn = criteria.meetCriteria(persons);
		return otherCriteria.meetCriteria(firstCriteriaPersosn);
	}

}
