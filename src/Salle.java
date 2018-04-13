import java.util.ArrayList;
import java.util.List;

public class Salle {
	private int numSalle;
	private int capacity;
	private List<Course> cours = new ArrayList<Course>();
	
	public Salle(int numSalle, int capacity) {
		this.numSalle = numSalle;
		this.capacity = capacity;
	}

	/**
	 * @return the numSalle
	 */
	public int getNumSalle() {
		return numSalle;
	}

	/**
	 * @return the cours
	 */
	public List<Course> getCours() {
		return cours;
	}

	/**
	 * @param cours the cours to set
	 */
	public void setCours(List<Course> cours) {
		this.cours = cours;
	}

	/**
	 * @param numSalle the numSalle to set
	 */
	public void setNumSalle(int numSalle) {
		this.numSalle = numSalle;
	}

	/**
	 * @return the capacity
	 */
	public int getCapacity() {
		return capacity;
	}

	/**
	 * @param capacity the capacity to set
	 */
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	
	
}
