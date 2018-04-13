import java.util.ArrayList;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		// INITIALISATION DES MODULES (je n'affectte pas la durée)
		Module moduleJava = new Module("Java");
		Module moduleCsharp = new Module("C#");
		
		// INITIALISATION DES ETUDIANTS
		Etudiant e1 = new Etudiant("Aloti", "Ethienne", 25);
		Etudiant e2 = new Etudiant("Blipo", "Jean", 25);
		Etudiant e3 = new Etudiant("Collard", "Baptiste", 25);
		Etudiant e4 = new Etudiant("De Montpelier", "Jean-François", 25);
		Etudiant e5 = new Etudiant("Eltar", "Marie", 25);
		Etudiant e6 = new Etudiant("Fernand", "Sarah", 25);
		Etudiant e7 = new Etudiant("Glor", "Milo", 25);
		Etudiant e8 = new Etudiant("Henin", "Justine", 25);
		Etudiant e9 = new Etudiant("Ilkeaz", "Clément", 25);
		Etudiant e10 = new Etudiant("Juumonji", "Katsuto", 25);
		
		// INITIALISATION DES FORMATEURS
		Formateur f1 = new Formateur("Kalom", "Alberto", "Formator");
		Formateur f2 = new Formateur("Lalolil", "Mégane", "Formator");
		Formateur f3 = new Formateur("Morl", "Cassendra", "Formator");
		Formateur f4 = new Formateur("Nainportemanteau", "Harry", "Bxl teach");
		Formateur f5 = new Formateur("Orl", "Xavier", "Bxl teach");
		Formateur f6 = new Formateur("Petit", "Simon", "Bxl teach");
		
		// INITIALISATION DES COURS
		Cours c1 = new Cours("UML", 3);
		Cours c2 = new Cours("UML", 3);
		Cours c3 = new Cours("C# base", 15);
		Cours c4 = new Cours("Java base", 10);
		Cours c5 = new Cours("SQL", 5);
		Cours c6 = new Cours("SQL", 4);
		Cours c7 = new Cours("ASP.NET", 20);
		Cours c8 = new Cours("Java EE", 6);
		Cours c9 = new Cours("Spring", 15);
		Cours c10 = new Cours("JPA - Hibernate", 5);
		
		// INITIALISATION DES SALLES (/!\ le numéro est de type String)
		Salle s1 = new Salle("-202", 12);
		Salle s2 = new Salle("-203", 12);
		Salle s3 = new Salle("-204", 12);
		
		// AJOUT DES COURS AUX FORMATEURS 				
		f1.addCours(c1, c2);
		f2.addCours(c3, c7);
		f3.addCours(c4, c10);
		f4.addCours(c5);
		f5.addCours(c6);
		f6.addCours(c8, c9);
		
		// AJOUT DES ETUDIANTS AUX MODULES
		moduleCsharp.addEtudiants(e1,e2,e3,e4,e5);
		moduleJava.addEtudiants(e6,e7,e8,e9,e10);
		
		// AJOUT DES COURS AUX MODULES
		moduleCsharp.addCours(c1, c3, c5, c7);
		moduleJava.addCours(c2, c4, c6, c8, c9, c10);
		
		// AJOUT DES COURS AUX SALLES
		s1.addCours(c2, c4, c6, c8, c9, c10);
		s2.addCours(c1, c3, c5, c7);
		
		
		// CREATION DES LISTES
		ArrayList<Module> modules = new ArrayList<Module>(Arrays.asList(moduleCsharp, moduleJava));
		ArrayList<Etudiant> etudiants = new ArrayList<Etudiant>(Arrays.asList(e1, e2, e3, e4, e5, e6, e7, e8, e9, e10));
		ArrayList<Formateur> formateurs = new ArrayList<Formateur>(Arrays.asList(f1, f2, f3, f4, f5, f6));
		ArrayList<Cours> listeCours = new ArrayList<Cours>(Arrays.asList(c1, c2, c3, c4, c5, c6, c7, c8, c9, c10));
		ArrayList<Salle> salles = new ArrayList<Salle>(Arrays.asList(s1, s2, s3));		
	}

}
