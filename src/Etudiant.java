import java.util.ArrayList;

public class Etudiant extends Person {
	private int age;
	private ArrayList<Module> modules = new ArrayList<Module>();

	
	public Etudiant() {
		
	}
	
	public Etudiant(String lastName, String firstName, int age) {
		super(lastName, firstName);
		this.age = age;
	}

	
	public Etudiant(String lastName, String firstName, int age, Module module, Module... modules) {
		this(lastName, firstName, age);
		this.modules.add(module);
	}
	
	
	
	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @return the modules
	 */
	public ArrayList<Module> getModules() {
		return modules;
	}

	/**
	 * @param modules the modules to set
	 */
	public void setModules(ArrayList<Module> modules) {
		this.modules = modules;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}
	
	
}
