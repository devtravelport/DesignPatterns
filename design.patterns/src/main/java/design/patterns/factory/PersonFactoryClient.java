package design.patterns.factory;

public class PersonFactoryClient {

	public static void main(String[] args) {
		PersonFactory pf = new PersonFactory();
		Person p = pf.createPerson("meenu");
		System.out.println("id: " + p.id);
		Person p1 = pf.createPerson("m1");
		System.out.println("id: " + p1.id);
	}

}
