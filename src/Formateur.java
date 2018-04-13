import java.util.ArrayList;
import java.util.List;

public class Formateur extends Person {
	private String entreprise;
	private List<Cours> cours = new ArrayList<Cours>();
	
	public Formateur() {

	}
	
	public Formateur(String lastName, String firstName, String entreprise) {
		super(lastName, firstName);
		this.entreprise = entreprise;
	}	
	
	public void addCours(Cours... cours) {
		for(Cours c : cours) {
			this.cours.add(c);
			c.setFormateur(this);
		}
	}
	
	/**
	 * @return the entreprise
	 */
	public String getEntreprise() {
		return entreprise;
	}

	/**
	 * @param entreprise the entreprise to set
	 */
	public void setEntreprise(String entreprise) {
		this.entreprise = entreprise;
	}

	/**
	 * @return the cours
	 */
	public List<Cours> getCourses() {
		return cours;
	}

	/**
	 * @param cours the cours to set
	 */
	public void setCourses(List<Cours> cours) {
		this.cours = cours;
	}

	public Formateur(String entreprise) {
		super();
		this.entreprise = entreprise;
	}
}
