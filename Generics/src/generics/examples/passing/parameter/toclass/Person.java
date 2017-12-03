package generics.examples.passing.parameter.toclass;

public class Person {
	private String name;
	private Integer age;
	
	public Person(String name, Integer age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	public Integer getAge() {
		return age;
	}
	
	@Override
	public String toString() {
		return "{Name= "+getName()+" Age= "+age+"}";
	}
}
