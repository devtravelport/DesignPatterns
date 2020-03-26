package design.patterns.factory;

public class PersonFactory {
	
	private int index;

	public Person createPerson(String name)
	  {
		
	    return new Person(index++, name);
	  }
	
	
}
