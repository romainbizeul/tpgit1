package src;

public class Poney {
	private int id;
	private String name;
	private int weight;

	public Poney(int id, String name, int weight) {
		super();
		this.id = id;
		this.name = name;
		this.weight = weight;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getWeight() {
		return weight;
	}
	
	public void setWeight(int weight) {
		this.weight = weight;
	}
}