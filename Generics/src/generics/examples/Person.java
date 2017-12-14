package generics.examples;


public class Person {
	private String name;
	private Integer age;
	private String type;
	
	public Person(String name, Integer age,String type) {
		super();
		this.name = name;
		this.age = age;
		if(null == type){
			this.type=this.getClass().getName();
		}else{
			this.type=type;
		}
	}
	
	public String getName() {
		return name;
	}
	public Integer getAge() {
		return age;
	}
	
	@Override
	public String toString() {
		return "{Name= "+getName()+" Age= "+age+" Type= "+type+"}";
	}

	public String getType() {
		return type;
	}

}
