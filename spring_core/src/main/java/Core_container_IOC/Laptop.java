package Core_container_IOC;

public class Laptop {
	private String brand;
	private String processor;
	private Projector p;
	
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getProcessor() {
		return processor;
	}
	public void setProcessor(String processor) {
		this.processor = processor;
	}
	public Projector getP() {
		return p;
	}
	public void setP(Projector p) {
		this.p = p;
	}
	
	public void display() {
		System.out.println(brand);
		System.out.println(processor);
		}
		}

