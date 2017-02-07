package src;

public class Courir {
	private Jockey jockey;
	private Course course;
	private Poney poney;
	private int rank;
	
	public Courir() {
		
	}
	
	public Courir(Jockey jockey, Course course, Poney poney, int rank) {
		this.jockey = jockey;
		this.course = course;
		this.poney = poney;
		this.rank = rank;
	}

	public Jockey getJockey() {
		return jockey;
	}

	public void setJockey(Jockey jockey) {
		this.jockey = jockey;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	public Poney getPoney() {
		return poney;
	}

	public void setPoney(Poney poney) {
		this.poney = poney;
	}

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}
	
	
}
