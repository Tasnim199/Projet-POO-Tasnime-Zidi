import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test {

    public static void main(String[] args) {

        List<Enseignant> enseignants = new ArrayList<>();
        List<Etudiant> etudiants = new ArrayList<>();
        List<Personne> comptes = new ArrayList<>();

        
        Enseignant enseignant1 = new Enseignant(100, "Emna", "Aloui", "Medenine", new ArrayList<>());
        enseignants.add(enseignant1);
        comptes.add(enseignant1);

        
        Etudiant etudiant1 = new Etudiant(211, "Makram", "Ben Ali", "Gabes", new ArrayList<>());
        etudiants.add(etudiant1);
        comptes.add(etudiant1);

      
        Administrateur administrateur = new Administrateur(250, "Aicha", "Ben Mohamed ", "Gabes", "Administrateur");
        comptes.add(administrateur);

        
        enseignant1.setMatieresEnseignees(List.of("Mathématiques", "Statistiques"));

       
        System.out.println("== Liste des Enseignants ==");
        for (Enseignant enseignant : enseignants) {
            afficherEnseignant(enseignant);
        }

        System.out.println("\n== Liste des Étudiants ==");
        for (Etudiant etudiant : etudiants) {
            afficherEtudiant(etudiant);
        }

        System.out.println("\n== Liste des Administrateurs ==");
        afficherAdministrateur(administrateur);

       
        ajouterNotes(enseignants, etudiants);

        
        System.out.println("\n=== Notes pour les Étudiants ===");
        for (Etudiant etudiant : etudiants) {
            etudiant.consulterNote();
        }

        System.out.println("\n=== Ajout des naouveaux étudiants ===");
        administrateur.ajouterCompte(comptes, new Enseignant(4, "Sami", "AbdelBasset", "Sousse", new ArrayList<>()),
                "Enseignant");

      
        administrateur.ajouterCompte(comptes, new Etudiant(5, "Zinet", "Khalili", "Djerba", new ArrayList<>()),
                "Etudiant");

        
        System.out.println("\n=== Liste des Comptes ===");
        afficherComptes(administrateur, comptes);
    }

    private static void afficherEnseignant(Enseignant enseignant) {
        System.out.println("Enseignant - Nom: " + enseignant.getNom() + ", Prénom: " + enseignant.getPrenom()+",Adresse:" + enseignant.getAdresse());
        enseignant.gererMatieres();
       
    }

    private static void afficherEtudiant(Etudiant etudiant) {
        System.out.println("Étudiant - Nom: " + etudiant.getNom() + ", Prénom: " + etudiant.getPrenom()+",Adresse:" + etudiant.getAdresse());
        
    }

    private static void afficherAdministrateur(Administrateur administrateur) {
        System.out.println("Administrateur - Nom: " + administrateur.getNom() + ", Prénom: " + administrateur.getPrenom()+ ",Adresse:" + administrateur.getAdresse());
        
    }

    private static void ajouterNotes(List<Enseignant> enseignants, List<Etudiant> etudiants) {
        try (Scanner scanner = new Scanner(System.in)) {
            for (Enseignant enseignant : enseignants) {
                for (Etudiant etudiant : etudiants) {
                    System.out.println("Enseignant " + enseignant.getNom() + " ajoute une note pour " + etudiant.getNom());
                    enseignant.ajouterNote(etudiant);
                }
            }
        }
    }

    private static void afficherComptes(Administrateur administrateur, List<Personne> comptes) {
        for (Personne compte : comptes) {
            System.out.println("Type: " + administrateur.getType(compte) + " - Nom: " + compte.getNom() + ", Prénom: " + compte.getPrenom());
        }
    }
}