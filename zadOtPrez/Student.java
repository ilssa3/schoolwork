package zadOtPrez;

public class Student extends Person{
	public int fn;

	public Student(String name, String surname, int fn) {
		super(name, surname);
		this.fn = fn;
	}

	public int getFn() {
		return fn;
	}

	public void setFn(int fn) {
		this.fn = fn;
	}

	@Override
	public String toString() {
		return "Student [fn=" + fn + "]";
	}
	public void welcomeMessage() {
		System.out.println("Hello "+name+" "+surname+", w fn: "+fn
				);
	}
}
