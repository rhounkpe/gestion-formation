import java.util.ArrayList;
import java.util.List;

public class Formateur extends Person {
	private String entreprise;
	private List<Course> courses = new ArrayList<Course>();
	
	public Formateur() {

	}
	
	public Formateur(String lastName, String firstName, String entreprise) {
		super(lastName, firstName);
		this.entreprise = entreprise;
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
	 * @return the courses
	 */
	public List<Course> getCourses() {
		return courses;
	}

	/**
	 * @param courses the courses to set
	 */
	public void setCourses(List<Course> courses) {
		this.courses = courses;
	}

	public Formateur(String entreprise) {
		super();
		this.entreprise = entreprise;
	}
}
