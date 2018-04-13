import java.util.ArrayList;
import java.util.List;

public class Salle {
	private String numSalle;
	private int capacity;
	private List<Cours> cours = new ArrayList<Cours>();
	
	public Salle(String numSalle, int capacity) {
		this.numSalle = numSalle;
		this.capacity = capacity;
	}
	
	
	public void addCours(Cours... cours) {
		for(Cours c : cours) {
			if(!this.cours.contains(c)) {
				this.cours.add(c);
			}			
		}

	}

	/**
	 * @return the numSalle
	 */
	public String getNumSalle() {
		return numSalle;
	}

	/**
	 * @return the cours
	 */
	public List<Cours> getCours() {
		return cours;
	}

	/**
	 * @param cours the cours to set
	 */
	public void setCours(List<Cours> cours) {
		this.cours = cours;
	}

	/**
	 * @param numSalle the numSalle to set
	 */
	public void setNumSalle(String numSalle) {
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
