package BankAcc;

public class account {
	 public String name;
	 public String num;
	 public double suma;
	 
	public account(String name, String num, double suma) {
	
		this.name = name;
		this.num = num;
		this.suma = suma;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNum() {
		return num;
	}

	public void setNum(String num) {
		this.num = num;
	}

	public double getSuma() {
		return suma;
	}

	public void setSuma(double suma) {
		this.suma = suma;
	}

	@Override
	public String toString() {
		return "Account: Holder's name=" + name + ", BankAcc.num =" + num + ", Avalable sum=" + suma ;
	}
	 
	public String toString1() {
		return "Account: Holder's name = " + name + ", BankAcc.num = " + num  ;
	}
	
	public String toString2() {
		return " Avalable sum = " + suma ;
	}
	public String toString3() {
		return  "(+)Transaction and new balance =" + suma ;
	}
	public String toString4() {
		return  "(-)Transaction and new balance =" + suma ;
	}
}
