import java.util.ArrayList;
import java.util.List;

public class Course {
	private String intitule;
	private int duree;
	private Salle salle;
	private Formateur formateur;
	private List<Module> modules = new ArrayList<Module>();
	
	public Course() {
		
	}
	
	public Course(String intitule, int duree) {
		this.intitule = intitule;
		this.duree = duree;		
	}	
	
	public Course(String intitule, int duree, Salle salle, Formateur formateur) {
		this(intitule, duree);
		this.salle = salle;
		this.formateur = formateur;
	}

	/**
	 * @return the salle
	 */
	public Salle getSalle() {
		return salle;
	}

	/**
	 * @return the formateur
	 */
	public Formateur getFormateur() {
		return formateur;
	}

	/**
	 * @param formateur the formateur to set
	 */
	public void setFormateur(Formateur formateur) {
		this.formateur = formateur;
	}

	/**
	 * @return the modules
	 */
	public List<Module> getModules() {
		return modules;
	}

	/**
	 * @param modules the modules to set
	 */
	public void setModules(List<Module> modules) {
		this.modules = modules;
	}

	/**
	 * @param salle the salle to set
	 */
	public void setSalle(Salle salle) {
		this.salle = salle;
	}

	/**
	 * @return the intitule
	 */
	public String getIntitule() {
		return intitule;
	}

	/**
	 * @param intitule the intitule to set
	 */
	public void setIntitule(String intitule) {
		this.intitule = intitule;
	}

	/**
	 * @return the duree
	 */
	public int getDuree() {
		return duree;
	}

	/**
	 * @param duree the duree to set
	 */
	public void setDuree(int duree) {
		this.duree = duree;
	}
	
	
	
}
