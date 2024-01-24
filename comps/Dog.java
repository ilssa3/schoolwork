package comps;

public class Dog {
	public String Name;

	public Dog(String name) {
		super();
		Name = name;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	@Override
	public String toString() {
		return "Dog [Name=" + Name + "]";
	}
	
	

}
