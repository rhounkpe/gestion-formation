import java.util.List;
import java.util.ArrayList;

public class Module {
	private String intitule;
	private int duree;
	private ArrayList<Course> cours = new ArrayList<Course>();
	private List<Etudiant> etudiants = new ArrayList<Etudiant>();
	
	public Module() {
		
	}
	
	public Module(String intitule, int duree) {
		this.intitule = intitule;
		this.duree = duree;
	}
	
	public Module(String intitule, int duree, Course course, Course...courses) {
		this(intitule, duree);
		this.cours.add(course);
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


	/**
	 * @return the cours
	 */
	public ArrayList<Course> getCours() {
		return cours;
	}


	/**
	 * @param cours the cours to set
	 */
	public void setCours(ArrayList<Course> cours) {
		this.cours = cours;
	}


	/**
	 * @return the etudiants
	 */
	public List<Etudiant> getEtudiants() {
		return etudiants;
	}


	/**
	 * @param etudiants the etudiants to set
	 */
	public void setEtudiants(List<Etudiant> etudiants) {
		this.etudiants = etudiants;
	}

}
