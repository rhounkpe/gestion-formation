import java.util.List;
import java.util.ArrayList;

public class Module {
	private String intitule;
	private int duree;
	private ArrayList<Cours> cours = new ArrayList<Cours>();
	private List<Etudiant> etudiants = new ArrayList<Etudiant>();
	
	public Module() {
		
	}
	
	public Module(String intitule) {
		this.intitule = intitule;
	}	
	
	public Module(String intitule, int duree) {
		this(intitule);
		this.duree = duree;
	}
	
	public Module(String intitule, int duree, Cours cours, Cours...courses) {
		this(intitule, duree);
		this.cours.add(cours);
	}	
	
	
	public void addEtudiants(Etudiant... etudiants) {
		for(Etudiant e : etudiants) {
			if(!this.etudiants.contains(e)) {
				this.etudiants.add(e);
				e.getModules().add(this);
			}
		}
	}
	
	public void addCours(Cours... cours) {
		for(Cours c : cours) {
			if(!this.cours.contains(c)) {
				this.cours.add(c);
				c.setModule(this);
			}
		}		
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
	public ArrayList<Cours> getCours() {
		return cours;
	}


	/**
	 * @param cours the cours to set
	 */
	public void setCours(ArrayList<Cours> cours) {
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
