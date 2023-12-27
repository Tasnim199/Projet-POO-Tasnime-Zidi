import java.util.ArrayList;
import java.util.List;

public class Administrateur extends Personne {

    private String role;

    public Administrateur(int id, String nom, String prenom, String adresse, String role) {
        super(id, nom, prenom, adresse);
        this.role = role;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public void ajouterCompte(List<Personne> comptes, Personne nouveauCompte, String typeCompte) {
        if (!comptes.contains(nouveauCompte)) {
            if ("Enseignant".equalsIgnoreCase(typeCompte) && nouveauCompte instanceof Enseignant) {
                ((Enseignant) nouveauCompte).setMatieresEnseignees(new ArrayList<>());
            } else if ("Etudiant".equalsIgnoreCase(typeCompte) && nouveauCompte instanceof Etudiant) {
                ((Etudiant) nouveauCompte).setmatieresSuivies(new ArrayList<>());
            }
            comptes.add(nouveauCompte);
            System.out.println("Compte ajouté avec succès.");
        } else {
            System.out.println("Compte déjà existant.");
        }
    }


    public String getType(Personne compte) {
        if (compte instanceof Enseignant) {
            return "Enseignant";
        } else if (compte instanceof Etudiant) {
            return "Etudiant";
        } else {
            return "Administrateur";
        }
    }
}

	