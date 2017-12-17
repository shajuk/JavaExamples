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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((age == null) ? 0 : age.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (age == null) {
			if (other.age != null)
				return false;
		} else if (!age.equals(other.age))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		return true;
	}
	
}
