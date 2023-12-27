import java.util.List;
import java.util.Scanner;

public  class Enseignant extends Personne implements GestionMatiere {

    private List<String> matieresEnseignees;

    public Enseignant(int id, String nom, String prenom, String adresse, List<String> matieresEnseignees) {
        super(id, nom, prenom, adresse);
        this.matieresEnseignees = matieresEnseignees;
    }

    public List<String> getMatieresEnseignees() {
        return matieresEnseignees;
    }

    public void setMatieresEnseignees(List<String> string) {
        this.matieresEnseignees = string;
    }

    
    public void gererMatieres() {
        System.out.println("Matieres enseignees par l'enseignant " + getNom() + " " + getPrenom() + ": ");
        for (String matiere : matieresEnseignees) {
            System.out.println(matiere);
        }
    }

    
    public void supprimerMatiere() {
        try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("Veuillez entrer le nom de la matière à supprimer : ");
			String matiereASupprimer = scanner.nextLine();

			if (matieresEnseignees.contains(matiereASupprimer)) {
			    matieresEnseignees.remove(matiereASupprimer);
			    System.out.println("Matiere supprimee avec succes : " + matiereASupprimer);
			} else {
			    System.out.println("Matiere non trouvee : " + matiereASupprimer);
			}
		}
    }

   
    public void ajouterMatiere() {
        try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("Veuillez entrer le nom de la nouvelle matière : ");
			String nouvelleMatiere = scanner.nextLine();

			if (matieresEnseignees.contains(nouvelleMatiere)) {
			    matieresEnseignees.add(nouvelleMatiere);
			    System.out.println("Matiere ajoutee avec succes : " + nouvelleMatiere);
			} else {
			    System.out.println("Matiere deja existante : " + nouvelleMatiere);
			}
		}
    }
    public void ajouterNote(Etudiant etudiant) {
        try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("Entrez le nom de la matière : ");
			String matiere = scanner.nextLine();

			if (matieresEnseignees.contains(matiere)) {
			    System.out.print("Entrez le nom de l'étudiant : ");
			    String nomEtudiant = scanner.nextLine();
			    System.out.print("Entrez la note (entre 0 et 20) : ");
			    int note = scanner.nextInt();

			    if (note >= 0 && note <= 20) {
			        System.out.println("Note ajoutée avec succès pour " + nomEtudiant + " en " + matiere);
			    } else {
			        System.out.println("La note doit être entre 0 et 20.");
			    }
			} else {
			    System.out.println("Vous n'enseignez pas cette matière.");
			}
		}
    }
        
        

    public void ajouterEtudiant() {
        try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("Entrez le nom de l'étudiant : ");
			scanner.nextLine();
			System.out.print("Entrez le prénom de l'étudiant : ");
			scanner.nextLine();
			System.out.print("Entrez la matière qu'il suit : ");
			String matiereSuivie = scanner.nextLine();

			if (matieresEnseignees.contains(matiereSuivie)) {
			    System.out.println("Étudiant ajouté avec succès en " + matiereSuivie);
			} else {
			    System.out.println("Vous n'enseignez pas cette matière.");
			}
		}
}

	@Override
	public void modifierMatiere() {
		// TODO Auto-generated method stub
		
	}}

