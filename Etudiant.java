import java.util.ArrayList;
import java.util.List;

public class Etudiant extends Personne {

    private List<String> matieresSuivies;

    public Etudiant(int id, String nom, String prenom, String adresse, List<String> matieresSuivies) {
        super(id, nom, prenom, adresse);
        this.matieresSuivies = matieresSuivies;
    }
    public List<String> getmatieresSuivies() {
        return new ArrayList<>(matieresSuivies); 
    }

    public void setmatieresSuivies(List<String> matieresSuivies) {
        this.matieresSuivies = new ArrayList<>(matieresSuivies);
    }

    public void consulterNote() {
        
        System.out.println("Consultation des notes pour l'étudiant " + getNom() + " " + getPrenom());
    }

    public void soumettreTravaux() {
        
        System.out.println(" l'étudiant " + getNom() + " " + getPrenom()+" a soumis son travail");
    }

}