package examples.inheritance.covariant.method.overriding;

public class PersonDetails {
	
	private Person person;
	
	public void setPerson(Person person) {
		this.person = person;
	}
	
	public Person getDetails() {
		return person;
	}
}
