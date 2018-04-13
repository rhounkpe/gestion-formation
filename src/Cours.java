import java.util.List;

public class Cours {
	private String intitule;
	private int duree;
	private Salle salle;
	private Formateur formateur;
	private Module module;
	
	public Cours() {
		
	}
	

	public Cours(String intitule, int duree) {
		this.intitule = intitule;
		this.duree = duree;		
	}	
	
	public Cours(String intitule, int duree, Salle salle, Formateur formateur) {
		this(intitule, duree);
		this.salle = salle;
		this.formateur = formateur;
	}

	
	
	/**
	 * @return the module
	 */
	public Module getModule() {
		return module;
	}

	/**
	 * @param module the module to set
	 */
	public void setModule(Module module) {
		this.module = module;
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
