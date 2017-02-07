package src;

public class Jockey {
	private int id;
	private String firstname;
	private String lastname;
	private int weight;
	
	public Jockey(int id, String firstname, String lastname, int weight) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.weight = weight;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getFirstname() {
		return firstname;
	}
	
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	
	public String getLastname() {
		return lastname;
	}
	
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	
	public int getWeight() {
		return weight;
	}
	
	public void setWeight(int weight) {
		this.weight = weight;
	}
}