package Appliance;

public abstract class Apps {
	private String name ;
	private double weight;
	private double leng;
	private double width;
	private double height;
	
	public Apps(String name, double weight, double leng, double width, double height) {
		super();
		this.name = name;
		this.weight = weight;
		this.leng = leng;
		this.width = width;
		this.height = height;
	}
	public String getName() {
		return name;
	}
	public double getWeight() {
		return weight;
	}
	public double getleng() {
		return leng;
	}
	public double getWidth() {
		return width;
	}
	public double getHeight() {
		return height;
	}
	public double getVolume() {
		return leng*width*height;
		
	};
	
	abstract String action();
	@Override
	public String toString() {
		return "Apps [name =" + name + " ][ Volume = "+getVolume()
				+" ][ weight = "+ weight + "]"+"\n";
	}
	

}
